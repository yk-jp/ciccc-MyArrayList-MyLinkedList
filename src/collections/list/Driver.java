package collections.list;

import java.util.*;

public class Driver {
    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.addLast(1);
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(1);
        myLinkedList.addLast(5);
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);

        System.out.println(myLinkedList.toString());

//        System.out.println(myLinkedList.remove((Integer)2));
//        System.out.println(myLinkedList.remove(1));
//        System.out.println(myLinkedList.lastIndexOf(-3));
//        System.out.println(myLinkedList.lastIndexOf(1));
        myLinkedList.reverse();
        System.out.println(myLinkedList.toString());


    }
}
