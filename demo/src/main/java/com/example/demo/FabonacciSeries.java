package com.example.demo;

public class FabonacciSeries {

    public static void main(String[] args) {
        fabSeries();

    }

    public static void fabSeries(){
        int n1=0,n2=1,n3,i;
        System.out.print(n1+","+n2);


        for (i = 2;i<20;++i){
            n3 = n1+n2;
            System.out.print(","+n3);
            n1 = n2;
            n2 = n3;
        }
    }
}