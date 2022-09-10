package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceNumber {

    public static void main(String[] args) {
        Integer[] a = new Integer[]{9,1,2,3,45,1,2,3,4,5,6,5,4,5,3,2,3,1,2,3,4,5,6,7,8,9,0,8};
        Map<Integer,Integer> map = new HashMap<>();
        int k=1;
        for (int i=0;i<a.length;i++){
            if (map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else {
                map.put(a[i],k);
            }
        }
        System.out.println(map);
    }
}
