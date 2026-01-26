import java.util.Scanner;
 public class HarshadNumber{
  public static void main(String[] args){
  
  Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  int sum=0;
  
  while(num!=0){
  int digit=num%10;
  sum=sum+digit;
  num=num/10;
  }
  if(num%summ==0){
  System.out.println(num+"it is harshad number");}
  else{
  System.out.println(num+"not a Harshad Number");}
   }
  } 