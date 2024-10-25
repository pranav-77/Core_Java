package com.pranav.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(90);
        l.add(80);
        l.add(90);
        l.add(100);
        System.out.println(l);
        System.out.println(l.contains(90));
        l.remove(2);
        System.out.println("After removing:"+l);
        System.out.println(l.size());
        for (int i:l){
            if(i%2==0) {
                System.out.println(i);
            }
        }
        System.out.println(l.isEmpty());
        System.out.println(l);
        //l.clear();
        System.out.println(l);
        System.out.println(l.lastIndexOf(90));
    }
}