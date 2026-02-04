package com.gla.arrays;
import java.util.Scanner;
 public class FootballTeamMeanHeight {
  public static void main(String[] args){

      Scanner sc =new Scanner(System.in);

      double[] heights = new double[11];
      System.out.println("enter the heights of 11 football players ");

      for (int i = 0; i < heights.length; i++) {
          System.out.println("Height of player " + (i + 1) + ": ");
          heights[i] =sc.nextDouble();
      }
      double sum=0;
      for(double height : heights ){
          sum += height;
      }
      double mean =sum/heights.length;
      System.out.println("the mean height of the football team is " + mean);
  }
 }
