package com.SetCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class topshiriq_1 {
    public static void main(String[] args) {

//        a)

        HashSet<String> set = new HashSet<>();
        set.add("Adidas");
        set.add("Nike");
        set.add("Puma");
        set.add("Reebok");
        set.add("NewBalance");
        set.add("Fila");

//        b)

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        c)

        TreeSet<String> treeSet = new TreeSet<>(set);

        for (String brand : treeSet.descendingSet()){
            System.out.println(brand);
        }

        Iterator<String> iterator1 = treeSet.descendingIterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

    }
}
