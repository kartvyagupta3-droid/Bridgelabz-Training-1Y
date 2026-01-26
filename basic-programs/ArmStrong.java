import java.util.Scanner;
 public class ArmStrong{
  public static void main(String[] args){
  
  Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  int sum=0;
  int originalnum=num;
  
  while(originalnum!=0){
  int digit=num%10;
  sum=digit*digit*digit;
  originalnum=num/10;
  
  if(sum==num){
  System.out.println(num+"it is ArmStrong");}
  else{
  System.out.println(num+"it is not ArmStrong");}
    }
   }
  } 