package com.practice.oop.practico01;

import java.util.Scanner;

public class ImcApp {
public static void main(String[] args){



    double weight;
    double height;
    double imc;


    Scanner sc =new Scanner(System.in);
    System.out.println("Enter weight: ");
    weight=sc.nextDouble();
    System.out.println("Enter height: ");
    height=sc.nextDouble();
    imc=calculateBmi(weight,height);
    System.out.println("Given his height in meters and his weight in kg, his BMI is: "+imc);
    sc.close();
}

    public static double calculateBmi(double weight, double height) {
        return weight / (height * height);
    }
}
