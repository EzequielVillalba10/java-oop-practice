package com.practice.opp.practico02;

import java.util.Scanner;

public class Word {
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter word: ");
        String word=sc.nextLine();


        int vocals=numberOfVowels(word);
        System.out.println("The number of vowels is: "+vocals);
        System.out.println("================================");
        System.out.println("The word entered is: "+word);
        progressiveWord(word);
        sc.close();
    }

    public static int numberOfVowels(String word){
        int vocals=0;
        word = word.toLowerCase();

        for(int i=0; i<word.length();i++){
            char c = word.charAt(i);
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            vocals++;
        }
        }
        return vocals;
    }

    public static void progressiveWord(String word) {
        String newWord = "";

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            newWord += character;
            System.out.println(newWord);
        }
    }

}
