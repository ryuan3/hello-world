package com.yuanruiling.demo;

/**
 * Created by aurora on 8/29/16.
 */
public class Book {
    public String name;
    public String author;
    public Book(String b_name){
        name = b_name;
        System.out.println("This is a book: "+name);
    };

    @Override
    public String toString() {
        return "result?";
    }
}
