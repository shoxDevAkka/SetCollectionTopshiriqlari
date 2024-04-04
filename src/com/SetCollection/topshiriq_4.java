package com.SetCollection;

import java.util.ArrayList;
import java.util.HashSet;

public class topshiriq_4 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Adidas");
        set.add("Nike");
        set.add("Puma");
        set.add("Reebok");
        set.add("NewBalance");
        set.add("Fila");

        HashSet<String> setClone = new HashSet<>(set);

        HashSet<String> set1 = new HashSet<>();
        set1.add("Adidas");
        set1.add("Puma");
        set1.add("Reebok");
        set1.add("Armour");
        set1.add("Navbahor");

        HashSet<String> setClone1 = new HashSet<>(set1);

//        a)

        set.retainAll(set1);

        ArrayList<String> list = new ArrayList<>(set);
        System.out.println(list);

//        b)

        setClone.removeAll(set);
        setClone1.removeAll(set);

        setClone.addAll(setClone1);
        ArrayList<String> list1 = new ArrayList<>(setClone);
        System.out.println("Test : " + list1);

    }
}
