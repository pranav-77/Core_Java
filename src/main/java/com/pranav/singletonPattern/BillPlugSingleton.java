package com.pranav.singletonPattern;

public class BillPlugSingleton {
    private final String name;

    private BillPlugSingleton(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private static class BillHelp {
        private static final BillPlugSingleton billPlugSingleton = new BillPlugSingleton("Alan");
    }

    public static BillPlugSingleton getInstance() {
        return BillHelp.billPlugSingleton;
    }
}
