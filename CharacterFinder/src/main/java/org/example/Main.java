package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("araba");
        words.add("kitap");
        words.add("armut");
        words.add("defter");
        ArrayList<Character> result = findUniqueChars(words);
        System.out.println(result);
    }

    public static ArrayList<Character> findUniqueChars(ArrayList<String> words) {
        ArrayList<Character> uniqueChars = new ArrayList<>();

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (uniqueChars.isEmpty()) {
                    uniqueChars.add(word.charAt(i));
                }
                if (isUnique(uniqueChars, word.charAt(i))) {
                    uniqueChars.add(word.charAt(i));
                }
            }
        }

        return uniqueChars;
    }

    private static boolean isUnique(ArrayList<Character> uniqueChars, char character) {
        for (Character uniqueChar : uniqueChars) {
            if (uniqueChar.equals(character)) {
                return false;
            }
        }
        return true;
    }
}