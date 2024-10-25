package com.pranav.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Aakash");
        hm.put(2,"Binu");
        hm.put(3,"Charlos");
        System.out.println(hm);

        Set s=hm.entrySet();
        System.out.println(s);

        Iterator i=s.iterator();
        while (i.hasNext()){
            Map.Entry me=(Map.Entry)i.next();
            if (me.getValue().equals("Binu")) {
                System.out.println(me.getKey());
                System.out.println(me.getValue());
            }
        }
    }
}
