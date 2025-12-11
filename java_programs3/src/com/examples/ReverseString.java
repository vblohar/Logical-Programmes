package com.examples;

public class ReverseString {
    public static void main(String[] args ) {
        String  name = "Vaibhav";
        String reverseName = new StringBuilder(name).reverse().toString();
        System.out.println(reverseName);
    }
}
