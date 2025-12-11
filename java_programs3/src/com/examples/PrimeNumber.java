package com.examples;
//
//public class PrimeNumber {
//    public static void main(String[] args) {
//        int n = 2;
//        boolean prime = true;
//        if ( n <= 1) {
//            prime = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                System.out.println(i);
//                if(n % i == 0){
//                    prime = false;
//                    break;
//                }
//
//            }
//        }
//        System.out.println(prime);
//    }
//}

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 7;
        boolean prime = true;
        if(n <= 1){
            prime = false;
        } else
            for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(n + " is prime? " + prime);
    }
}


