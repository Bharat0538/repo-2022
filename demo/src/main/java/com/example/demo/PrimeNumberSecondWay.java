package com.example.demo;

public class PrimeNumberSecondWay {

    public static void main(String[] args) {
        System.out.println(checkPrimeNumber(1)+" 1");
        System.out.println(checkPrimeNumber(2)+" 2");
        System.out.println(checkPrimeNumber(4)+" 4");
        System.out.println(checkPrimeNumber(7)+" 7");
        System.out.println(checkPrimeNumber(17)+" 17");
        System.out.println(checkPrimeNumber(0)+" 0");
        System.out.println(checkPrimeNumber(19)+" 19");
        System.out.println(checkPrimeNumber(91)+" 91");
        System.out.println(checkPrimeNumber(97)+" 97");

    }

    public static boolean checkPrimeNumber(int num){
        int flag = 0;
        int m = num/2;
        if (num==0 || num==1){
            flag = 1;
        }else {
            for (int i = 2 ;i<=m;i++){
                if(num%i==0){
                    flag=1;
                    break;
                }
            }
        }

        if (flag==0){
            return true;
        }else {
            return false;
        }
    }
}
