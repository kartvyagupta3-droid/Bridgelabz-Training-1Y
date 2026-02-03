package com.gla.arrays;
import java.util.Scanner;
 public class MultiplicationTableRange {
  public static void main(String[] args){

      Scanner sc =new Scanner(System.in);
      System.out.println("enter the number b/w 6 to 9");
      int num= sc.nextInt();

      if(num<6||num>9){
          System.out.println("invalid input, enter thr number b/w 6 to 9");
      }
      int [] mres =new int[10];
      for(int i=1; i<=10; i++){
          mres[i-1]=num*i;
      }
      System.out.println("Multiplication table of " + num + ".");
      for (int i = 1; i <= 10; i++) {
          System.out.println(num + " * " + i + " = " + mres[i - 1]);
      }

  }
}
