package com.pranav.collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        q.offer(90);
        q.offer(98);
        q.offer(87);
        q.offer(86);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.remove(90));
        System.out.println(q);
        System.out.println();
        Queue<Integer> qe=new ArrayDeque<>();
        qe.offer(89);
        qe.offer(98);
        qe.offer(99);
        System.out.println(qe);
        System.out.println(qe.peek());
    }
}
