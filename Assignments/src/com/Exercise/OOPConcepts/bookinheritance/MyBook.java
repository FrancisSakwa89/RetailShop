package com.Exercise.OOPConcepts.bookinheritance;

import com.Exercise.OOPConcepts.bookinheritance.Book;

public class MyBook extends Book {
    public void setTitle(String s){
        title=s;
    }
    public String toString() {
        return title;
    }

}
