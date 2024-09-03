package com.java.dsa;

import java.util.ArrayList;
import java.util.List;

public class ListOfListsExample {
    public static void main(String[] args) {
        // Creating a List of Lists
        List<List<String>> listOfLists = new ArrayList<>();

        // Creating individual lists
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");

        List<String> list2 = new ArrayList<>();
        list2.add("Carrot");
        list2.add("Tomato");

        List<String> list3 = new ArrayList<>();
        list3.add("Mango");
        list3.add("Orange");

        // Adding individual lists to the list of lists
        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        // Iterating through the List of Lists
        for (List<String> list : listOfLists) {
            for (String item : list) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
