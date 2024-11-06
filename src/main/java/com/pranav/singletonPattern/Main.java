package com.pranav.singletonPattern;

public class Main {
    public static void main(String[] args) {
        //Eager
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        System.out.println("EAGER: " + eagerSingleton1.getAge());

        //Lazy
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        System.out.println("LAZY: " + lazySingleton1.getName());

        //Synchronized
        SynchronizedSingleton synchronizedSingleton1 = SynchronizedSingleton.getInstance();
        System.out.println("Synchronized: " + synchronizedSingleton1.getCh());

        //DoubleChecked
        DoubleCheckSingleton doubleCheckSingleton1 = DoubleCheckSingleton.getInstance();
        System.out.println("DoubleChecked: " + doubleCheckSingleton1.getNum());

        //BillPlug
        BillPlugSingleton billPlugSingleton1 = BillPlugSingleton.getInstance();
        System.out.println("BillPlug: " + billPlugSingleton1.getName());
    }
}
