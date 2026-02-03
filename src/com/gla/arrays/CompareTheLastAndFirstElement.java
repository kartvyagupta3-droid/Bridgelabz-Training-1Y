package com.gla.arrays;
import java.util.Scanner;
public class CompareTheLastAndFirstElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                if (num[i] % 2 == 0) {
                    System.out.println("Number" + num[i] + "is positive and even");
                } else {
                    System.out.println("Number" + num[i] + "is positive and odd");
                }
            } else if (num[i] < 0) {
                System.out.println("Number" + num[i] + "is negative");
            } else {
                System.out.println("Number" + num[i] + "is zero");
            }
        }
        int first=num[0];
        int last=num[num.length-1];
        if (first == last) {
            System.out.println("First element (" + first + ") and last element (" + last + ") are equal.");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than last element (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is less than last element (" + last + ").");
        }

    }
}
