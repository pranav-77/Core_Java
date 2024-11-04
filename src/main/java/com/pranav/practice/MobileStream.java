package com.pranav.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MobileStream {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Oppo", 21000, 8);
        Mobile mobile2 = new Mobile("RealMe", 15000, 8);
        Mobile mobile3 = new Mobile("iPhone", 50000, 8);

        List<Mobile> mobiles = Arrays.asList(mobile1, mobile2, mobile3);
        List<Mobile> m = mobiles.stream()
                .filter(data -> data.getPrice() > 20000 && data.getRam() >= 8)
                .map(data ->{
                    if (data.getPrice()>20000){
                        data.setPrice(data.getPrice()-2000);
                    }
                    return data;
                })
                .collect(Collectors.toList());
        System.out.println(m);

        for (Mobile m1 : m) {
            System.out.println(m1);
        }
    }
}
