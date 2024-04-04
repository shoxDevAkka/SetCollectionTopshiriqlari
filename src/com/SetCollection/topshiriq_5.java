package com.SetCollection;

import java.util.ArrayList;
import java.util.HashSet;

public class topshiriq_5 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Adidas");
        set.add("Nike");
        set.add("Puma");
        set.add("Reebok");
        set.add("NewBalance");
        set.add("Fila");

        HashSet<String> setClone = new HashSet<>(set);

        HashSet<String> setCloneSet = new HashSet<>(set);

        HashSet<String> set1 = new HashSet<>();
        set1.add("Adidas");
        set1.add("Puma");
        set1.add("Reebok");
        set1.add("Armour");
        set1.add("Navbahor");

        HashSet<String> setClone1 = new HashSet<>(set1);

        HashSet<String> setCloneSet1 = new HashSet<>(set1);

//        a)

        set.retainAll(set1);

        setClone.removeAll(set);

        ArrayList<String> list = new ArrayList<>(setClone);

        System.out.println(list);

//        b)

        setClone1.removeAll(set);

        ArrayList<String> list1 = new ArrayList<>(setClone1);

        System.out.println(list1);

//        c)

        ArrayList<String> mainList = new ArrayList<>();

        ArrayList<String> arrayList = new ArrayList<>(setCloneSet);
        ArrayList<String> arrayList1 = new ArrayList<>(setCloneSet1);

        topshiriq_5.getEverySecondElement(arrayList, mainList);
        topshiriq_5.getEverySecondElement(arrayList1, mainList);

        System.out.println(mainList);
    }

    private static void getEverySecondElement(ArrayList<String> list, ArrayList<String> mainList){
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0){
                mainList.add(list.get(i));
            }
        }
    }

}
