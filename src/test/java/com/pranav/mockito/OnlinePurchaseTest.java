package com.pranav.mockito;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OnlinePurchaseTest {
    @Test
    public void testCheckoutSuccessfulPayment() {
        PaymentService paymentService = mock(PaymentService.class);
        when(paymentService.processPayment(Mockito.anyString(), Mockito.anyDouble())).thenReturn(true);

        OnlinePurchase onlinePurchase = new OnlinePurchase(paymentService);
        onlinePurchase.addItemToCart(new Product("1", "Test", 20.0), 2);

        assertTrue("Checkout should return true when the payment process is successful", onlinePurchase.checkout("1234"));
    }

    @Test
    public void testCheckoutUnsuccessfulPayment() {
        PaymentService paymentService = mock(PaymentService.class);
        when(paymentService.processPayment(Mockito.anyString(), Mockito.anyDouble())).thenReturn(false);

        OnlinePurchase onlinePurchase = new OnlinePurchase(paymentService);
        onlinePurchase.addItemToCart(new Product("2", "Test2", 40.0), 1);

        assertFalse("Checkout should return false when the payment process is unsuccessful", onlinePurchase.checkout("5678"));
    }

    @Test
    public void testCheckoutPaymentAmount() {
        PaymentService paymentService = mock(PaymentService.class);

        when(paymentService.processPayment(Mockito.anyString(), Mockito.anyDouble())).thenAnswer(invocation -> {
            double amount = invocation.getArgument(1);
            return amount == 100.0;
        });

        OnlinePurchase onlinePurchase = new OnlinePurchase(paymentService);
        onlinePurchase.addItemToCart(new Product("3", "Test3", 50.0), 2);

        assertTrue("Checkout should return true when the correct amount is passed", onlinePurchase.checkout("9101"));
    }
}