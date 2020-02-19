package com.cg.iter;

import java.util.Scanner;

public class Lab1Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        int previousDigit = 9;
        boolean checkNumber = true;
        while (n > 0) {
            int currentDigit = n % 10;
            n = n / 10;
            if (currentDigit > previousDigit) {
            	checkNumber = false;
                break;
            }
            previousDigit = currentDigit;
        }
        System.out.println("Increasing number = " + checkNumber);
    }
}