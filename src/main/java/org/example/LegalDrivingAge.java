package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */
public class LegalDrivingAge
{
    public static void main( String[] args )
    {
        // Program to check if user is of legal age to drive
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = input.nextInt();

        // Prompts if age is negative
        while (age < 0)
        {
            System.out.print("That age was invalid. What is your age? ");
            age = input.nextInt();
        }

        // Ternary Operation to select appropriate prompt
        String prompt = age >= 16 ? "Yay! You are old enough to legally drive!" : "Sorry! You are not old enough to legally drive. :(";

        System.out.print(prompt);
    }
}
