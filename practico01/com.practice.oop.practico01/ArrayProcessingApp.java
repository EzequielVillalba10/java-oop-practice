package com.practice.oop.practico01;

import java.util.Random;

public class ArrayProcessingApp {

    public static void main(String[] args) {

        int[] numbers = new int[30];

        fillArray(numbers);
        System.out.println("Original array:");
        printArray(numbers);

        squareEvenNumbers(numbers);
        System.out.println("\nArray after squaring even numbers:");
        printArray(numbers);
    }

    // Fills the array with random, non-prime, non-repeated numbers
    public static void fillArray(int[] array) {
        Random random = new Random();
        int index = 0;

        while (index < array.length) {
            int randomNumber = random.nextInt(1000) + 1;

            if (!isPrime(randomNumber) && !contains(array, randomNumber, index)) {
                array[index] = randomNumber;
                index++;
            }
        }
    }

    // Checks if a number is already in the array
    public static boolean contains(int[] array, int value, int limit) {
        for (int i = 0; i < limit; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    // Checks if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }

    // Squares even numbers in the array
    public static void squareEvenNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] * array[i];
            }
        }
    }

    // Prints the array
    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }
}
