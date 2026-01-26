import java.util.Scanner;
 public class NumberOfDigit{
  public static void main(String[] args){
  
  Scanner s=new Scanner(System.in);
  int num=sc.nextInt();
  int count=0;
  
  while(num!=0){
  num=num/10;
  count++;
  }
  System.out.println("number of digit"+count);
   }
  } 