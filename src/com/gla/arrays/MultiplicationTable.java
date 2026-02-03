package com.gla.arrays;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        System.out.print("Enter a number to print its multiplication table: ");
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();

        // Step 2: Define an array to store results (1 to 10)
        int[] table = new int[10];

        // Step 3: Run a loop from 1 to 10 and store results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Step 4: Display the results
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

    }
}
