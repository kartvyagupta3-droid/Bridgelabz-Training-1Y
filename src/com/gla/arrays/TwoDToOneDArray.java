package com.gla.arrays;
import java.util.Scanner;
public class TwoDToOneDArray {
  public static void main(String[] args){

      Scanner sc =new Scanner(System.in);
      System.out.println("enter number of rows ");
      int rows = sc.nextInt();
      System.out.println("enter number of columns ");
      int cols =sc.nextInt();

      int [] [] matrix = new int[rows][cols];
      System.out.println("enter the elements of the matrix ");
      for (int i = 0; i < rows; i++) {
          for(int j = 0; j<cols; j++){
              System.out.println("elements [" + i + "][" + j + "] ");
              matrix[i][j] =sc.nextInt();
          }
      }
      int[] arr =new int [rows * cols];
      int index =0;

      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
              arr[index] = matrix[i][j];
              index++;
          }
      }
      System.out.println("elements copied into 1D array ");
      for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i] + " ");
      }
  }
}
