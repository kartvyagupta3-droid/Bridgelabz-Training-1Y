import java.util.Scanner;
 public class FactorOfNumberByWhile{
  public static void main(Stirng[] args){
  
  Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
   
   if(num<=0){
   System.out.println("enter a natural number");}
   else{
   int i=1;
   while(i<=num)
   if(num%i==0){
   System.out.println(i);
   i++}
   }
   }
   }
   }