package collections.list;

import java.util.*;

public class Driver {
    public static void main(String[] args) {

        MyArrayList<Integer> list1 = new MyArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("list1: " + list1);

        MyArrayList<Integer> list2 = new MyArrayList<Integer>();

        list2.add(2);
        list2.add(4);
        list2.add(6);
        System.out.println("list2: " + list2);

        System.out.println("list1.retainAll(list2)");
        list1.retainAll(list2);
        System.out.println("list1: " + list1);
    }
}
