package com.SetCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class topshiriq_3 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Adidas");
        set.add("Nike");
        set.add("Puma");
        set.add("Reebok");
        set.add("NewBalance");
        set.add("Fila");

//        a)

        Object collection = set.clone();
        System.out.println(collection);

//        b)

        Collection<String> list = (Collection<String>) collection;
        ArrayList<String> list1 = new ArrayList<>(list);
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>(set);     // "ikkinchi yo'li"
        System.out.println(list2);

//        c)

        for (int i = 1; i < list1.size(); i+=2) {
            System.out.println(list1.get(i));
        }

        for (int i = 0; i < list1.size(); i++) {        // "ikkinchi yo'li"
            if (i%2 != 0){
                System.out.println(list1.get(i));
            }
        }

    }
}
