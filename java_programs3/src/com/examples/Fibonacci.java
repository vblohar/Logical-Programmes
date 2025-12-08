package com.examples;

public class Fibonacci{

    public static void main(String[] args) {
        int num = 10;
        int first = 0;
        int second = 1;
        for(int i = 0; i < num; i++){
            if (i <= 1){
                System.out.print(i + " ");
            } else {
                int sum = first + second;
                System.out.print(sum+ " ");
                first = second;
                second = sum;
            }

        }

    }
}