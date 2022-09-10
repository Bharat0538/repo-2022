package com.example.demo;

public class PrimeNumberProgram {

    public static void main(String[] args) {
        int n1=1,n2=100;

        for (int i=n1;i<=n2;i++){
            if (PrimeNumberProgram.isPrime(i)){
                System.out.println(i+" ");
            }
        }

    }

    public static boolean isPrime(int n){

        int m = n/2;

        if(n==1 || n==2 || n==0){
            return false;
        }

        for (int i=2 ; i<Math.sqrt(n) ;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
