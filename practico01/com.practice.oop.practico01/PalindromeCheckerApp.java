package com.practice.oop.practico01;

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        if (isPalindrome(word)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }

        sc.close();
    }

    public static boolean isPalindrome(String word) {
        String normalized = word.toLowerCase();
        String reversed = reverseWord(normalized);
        return normalized.equals(reversed);
    }

    public static String reverseWord(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return reversed;
    }
}
