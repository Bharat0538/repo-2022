package com.example.demo;

public class SingletonTestDemo {

    public static void main(String[] args) {

        System.out.println(SingletonPatternEager.getSingleton());
        System.out.println(SingletonPatternEager.getSingleton());


        System.out.println(SingletonPatternLazy.getPatternLazy());
        System.out.println(SingletonPatternLazy.getPatternLazy());

    }
}
