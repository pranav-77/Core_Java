package com.pranav.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> s=new LinkedHashSet<>();
        s.add(10);
        s.add(89);
        s.add(100);
        //s.remove(89);
        System.out.println(s);
        s.add(87);
        System.out.println(s.size());
        System.out.println(s);

        Iterator<Integer> i=s.iterator();
        while (i.hasNext()){
            Integer current=i.next();
            if (current.equals(89)){
                System.out.println(current);
            }

        }
        System.out.println(s);
    }
}
