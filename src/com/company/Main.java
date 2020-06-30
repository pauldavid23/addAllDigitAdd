package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number to sum all digits: ");

        if(scanner.hasNextInt()) {
            int num = scanner.nextInt();
            scanner.nextLine();
            
            int sum = 0;
            int chosenNum = num;

            while (num > 0) {
                sum += num%10;
                num /= 10;
            }
            System.out.println("The sum of " + chosenNum + " is equal to " + sum);

        } else {
            System.out.println("Invalid input! Please input numbers only. ");
        }
    }
}
