package com.examples.intermediate_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "java is easy and java is powerful";

        Map<String, Integer> freqMap = countWordFrequency(text);

        System.out.println(freqMap);
    }

    public static Map<String, Integer> countWordFrequency(String text){
        Map<String, Integer> map = new LinkedHashMap<>();

        String[] words = text.toLowerCase().split("\\s+");
        for(String word: words){
            map.put(word, map.getOrDefault(word, 0) +1);
        }
        System.out.println(map);
        return map;
    }


}
