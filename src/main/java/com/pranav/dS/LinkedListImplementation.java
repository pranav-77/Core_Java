package com.pranav.dS;

public class LinkedListImplementation {


    public static void main(String[] args) {
        LinkedListImplementation li=new LinkedListImplementation();
        li.add(10);
        li.add(20);
        li.add("yt5y");
        li.add('3');
        System.out.println("-----------------------");
        li.print();
    }


 Node head=new Node();
 void add(Object data)
 {
     Node n=new Node();
     if(head.next==null)
     {
         head.data=data;
         n.previous=head;
         head.next=n;

     }
     else{
         Node temp=head.next;
         Node temp2=null;
         while(temp!=null)
         {
             temp2=temp;
            temp=temp.next;

         }
         n.previous=temp2;
         temp2.data=data;
         temp2.next=n;
//         System.out.println(head.data);
//         System.out.println(head.next.data);
     }
 }
 void print()
 {
//     System.out.println(head.data);
//     System.out.println(head.next.data);
     Node temp=head;

     while(temp.next!=null)
     {
         System.out.println(temp.data);
         temp=temp.next;

     }

 }
}
class Node{
    Node previous;
    Object data;
    Node next;
}
