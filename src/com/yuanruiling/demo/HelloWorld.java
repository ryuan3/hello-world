package com.yuanruiling.demo;

import java.util.*;
/**
 * Created by aurora on 8/24/16.
 */
public class HelloWorld {
    public static void main(String[] args) {
//        Book book;
////        System.out.println(book);
//        book = new Book("The story");
//        System.out.println("Hello World"+book);
//        char ch = '一';
//        System.out.println(ch);
//
//        int[] arr;
//        arr = new int[2];
//        int[] arr = new int[2];
//        int[] arr = {5,1,2,3};
//        System.out.println(arr[0]);
//        System.out.println(arr.length);
//
//        String[] str = {"hi","hello"};
//        System.out.println(str[1]);
//        System.out.println(Arrays.toString(str));
//        System.out.println(Arrays.toString(arr));
//
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println(Arrays.binarySearch(arr,3));

//        System.out.println("------------A HashSet Example ----------");
//        Set words = new HashSet();
//
//        words.add("cat");
//        words.add("mail");
//        words.add("dog");
//        words.add("cat"); // won't add it again
//        System.out.println("The set has no duplicates: ");
//        System.out.println(words); //don’t know the order
//
//        // ArrayList example
//        System.out.println("----------An ArrayList Example ----------");
//        List countries = new ArrayList();
//        countries.add("USA");
//        countries.add("China");
//        countries.add("Italy");
//        System.out.println(countries.indexOf("Italy"));
//
//        for (int i = 0; i < countries.size();  i++)  {
//            System.out.print(countries.get(i) + " ");
//        }
//        System.out.println();
//
//
//        // LinkedList example
//        System.out.println("----------An LinkedList Example ----------");
//        List country = new LinkedList();
//        country.add("USA");
//        country.add("China");
//        country.add("Italy");
//        System.out.println(country.indexOf("Italy"));
//
//        for (int i = 0; i < country.size();  i++)  {
//            System.out.print(country.get(i) + " ");
//        }
//        System.out.println();

//        TreeSet<String> wordsTree = new TreeSet<String>();
//        wordsTree.add("cat");
//        wordsTree.add("mail");
//        wordsTree.add("dog");
//        String firstElement = wordsTree.first();
//        String test = wordsTree.lower("mail");
//        String test1 = wordsTree.higher("mail");
//
//        System.out.println(test1);
//
//        System.out.println("----------A TreeSet Example ----------");
//        TreeSet wordsTree = new TreeSet();
//        wordsTree.add("duck");
//        wordsTree.add("cat");
//        wordsTree.add("mail");
//        wordsTree.add("dog");
//        String firstElement = wordsTree.first().toString();
//        System.out.println("The first element is " + firstElement);
//        String demoLower = wordsTree.lower("mail").toString(); //returns the greatest word less than mail
//        System.out.println("The greatest value lower than mail is " + demoLower);
//        String demoHigher = wordsTree.higher("cat").toString();  // returns the smallest word higher than cat
//        System.out.println("The lowest value higher than cat is " + demoHigher);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("smart", "Having a quick-witted intelligence");
        map.put("university", "A school that offers courses leading to a degree");
        for (Map.Entry<String,Object>entry : map.entrySet()){

        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("key=" + entry.getKey());
            System.out.println("value=" + entry.getValue());
        }
    }
}
