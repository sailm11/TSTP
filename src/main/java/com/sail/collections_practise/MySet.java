package com.sail.collections_practise;

import java.util.HashSet;
import java.util.TreeSet;

public class MySet {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(52);
        set.add(52);
        set.add(95);
        set.add(32);

        // set doesn't allow duplcates num
        System.out.println(set);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(820);
        set2.add(80);
        set2.add(50);

        set.addAll(set2);

        // it doesn't sort and maintains the order
        System.out.println(set);

        TreeSet<Integer> treeSet = new TreeSet<>(set);

        // it sorts the entered elements in ascending order....
        System.out.println(treeSet);

        System.out.println(set.isEmpty());

        Object arr[] = set.toArray();
        for (Object o : arr) {
            System.out.println(o.toString());
        }

        set.removeIf(t -> t.equals(5));

        System.out.println(set);

        // HashSet.newHashSet(5);

        set.clear();

        System.out.println(set);

    }
}
