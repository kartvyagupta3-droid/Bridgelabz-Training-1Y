package com.gla.arrays;
import java.util.Scanner;
 public class OddEvenArray {
  public  static void  main(String[] args){

      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number");
       int number= sc.nextInt();

       if(number<=0){
           System.out.println(" plz enter a valid number");
           return;
       }
       int [] oddnum =new int[number/2+1];
       int [] evennum =new int[number/2+1];

       int oddIndex=0;
       int evenIndex=0;

      for (int i = 1; i <number ; i++) {
        if(i%2==0){
            evennum[evenIndex] =i;
            evenIndex++;
        }else{
            oddnum[oddIndex] =i;
            oddIndex++;
        }
      }
      System.out.println("odd number");
      for (int i = 0; i < oddIndex; i++) {
          System.out.println(oddnum[i] + " ");
      }
      System.out.println("\neven number");
      for (int i = 0; i < evenIndex; i++) {
          System.out.println(evennum[i] + " ");
      }
  }
}
