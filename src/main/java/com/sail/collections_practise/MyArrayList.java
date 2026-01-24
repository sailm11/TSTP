package com.sail.collections_practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.stream.Collectors;

public class MyArrayList {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        // Adding elements in an array.
        arr.add(5);
        arr.add(10);
        arr.add(10);
        arr.add(80);
        arr.add(6);

        System.out.println(arr.toString());

        // updating an element
        arr.set(2, 25);

        // deleting an element
        arr.remove(4);

        arr.addFirst(65);
        arr.addLast(94);

        // reverse the array elements.
        List<Integer> rev = arr.reversed();
        System.out.println(rev);

        // arr.clear();
        // System.out.println(arr);

        boolean check = arr.containsAll(rev);
        System.out.println("elements in object rev are present in arr ? : " + check);

        List<Integer> arr2 = new ArrayList<>(arr);

        // this checks the address the of the object
        System.out.println(arr == arr2);

        // this method checks the values present in the object and compare...
        System.out.println(arr.equals(arr2));

        // to printing the array elemens
        {

            // arr.forEach(n -> {
            // System.out.println(n);
            // });

            System.out.println("using iterator....");
            Iterator<Integer> iterator = arr.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
                // iterator.next();
            }
        }

        System.out.println("using listiterator....");
        ListIterator<Integer> nl = arr.listIterator();

        nl.add(10000);
        // nl.next();

        // System.out.println(nl.previous());
        while (nl.hasNext()) {
            // nl.add(150);
            if (nl.next() == 150)
                nl.remove();
            System.out.println(nl.next());
        }

        System.out.println(arr);

        System.out.println(arr.retainAll(arr2));

        System.out.println(arr + "\n");

        // stream
        arr.parallelStream().filter(n -> n > 20).forEach(System.out::println);

        int product = arr.parallelStream().reduce(1, (a, b) -> a * b);
        System.out.println("produc of arr is : " + product);

        Map<String, List<Integer>> mapto = arr.parallelStream()
                .collect(Collectors.groupingByConcurrent(n -> n % 2 == 0 ? "EVEN" : "ODD"));

        System.out.println(mapto);
    }
}

class ListOperations {
    public static void main(String[] args) {
        LinkedList<Integer> node = new LinkedList<>();

        node.add(5);
        node.add(65);
        node.add(18);
        node.add(34);
        System.out.println(node);

        node.offer(28);
        System.out.println(node);

        node.remove(4);

        System.out.println(node);
        System.out.println(node.element());

        node.pop();
        System.out.println(node.element());

        node.poll();
        System.out.println(node.element());

        node.peek();
        System.out.println(node.element());
    }
}