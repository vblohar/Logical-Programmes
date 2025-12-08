package com.examples;

import java.util.List;

public class Fibonancci {

    public static int fibonacciSeries(int n) {
        if(n <= 1){
            return n;
        }
        return fibonacciSeries(n-1) + fibonacciSeries(n-2);
    };

    public static void main(String[] args) {
//        int n1 = 0, n2 = 1, count = 10;
//        System.out.print(n1);
//        for (int i = 2; i < count; i++) {
//            int n3 = n1 + n2;
//            System.out.print(" " + n3);
//            n1 = n2;
//            n2 = n3;
//        }
//        int n =6;
//           for (int i = 0; i < n; i++) {
//            System.out.println(fibonacciSeries(i));
//        }
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries(i) + ", ");
        }

    }
}


