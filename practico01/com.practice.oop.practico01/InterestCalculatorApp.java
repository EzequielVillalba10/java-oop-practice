package com.practice.oop.practico01;

import java.util.Scanner;

public class InterestCalculatorApp {
    private static final double ANNUAL_RATE = 33.0;

    public static void main(String[] args){


    double capital;
    double term;
    double profitability;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter capital: ");
        capital= sc.nextDouble();
        System.out.println("Enter term: ");
        term=sc.nextDouble();
        profitability=calculateprofitability(capital,term);
        System.out.println("Profitability: $" + profitability);
        sc.close();
    }

    public static double calculateprofitability(double capital, double term){
        return capital*(ANNUAL_RATE/100*term/365);
    }
}
