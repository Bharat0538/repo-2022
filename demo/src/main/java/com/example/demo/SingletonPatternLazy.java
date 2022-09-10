package com.example.demo;

public class SingletonPatternLazy {

    private static SingletonPatternLazy patternLazy = null;

    public static SingletonPatternLazy getPatternLazy(){
        if (patternLazy==null){
            patternLazy = new SingletonPatternLazy();
        }
        return patternLazy;
    }

}
