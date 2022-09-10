package com.example.demo;

public class SingletonPatternEager {

    private static SingletonPatternEager singleton = new SingletonPatternEager();

    public static SingletonPatternEager getSingleton(){
        return singleton;
    }

}


