package com.SetCollection;

import java.util.HashSet;

public class topshiriq_2 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Adidas");
        set.add("Nike");
        set.add("Puma");
        set.add("Reebok");
        set.add("NewBalance");
        set.add("Fila");

//        a)

        System.out.println(set.size());

//        b)

        System.out.println(set.isEmpty());

//        c)

        set.clear();

    }
}
