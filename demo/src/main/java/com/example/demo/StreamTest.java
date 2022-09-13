package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        Integer[] a = new Integer[]{12,2,3,22,44,54,34,32,1219,19,18,17,20,20};
        List<Integer> list = Arrays.asList(a);
        List<Integer> filIntegers = list.stream().filter(p->p<=50).collect(Collectors.toList());
        System.out.println(filIntegers);

        List<Integer> evenNum = list.stream().filter(p->p%2==0).collect(Collectors.toList());
        System.out.println(evenNum);

        List<Integer> squareNum = list.stream().map(p->p*p).collect(Collectors.toList());
        System.out.println(squareNum);
        
        System.out.println("Count : "+list.stream().filter(p->p<=50).count());
    }
}
