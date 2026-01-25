import java.util.Scanner;
 public class FactorOfNumberByFor{
  public static void main(Stirng[] args){
  
  Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
   
   if(num<=0){
   System.out.println("enter a natural number");}
   else{
   for(int i=1; i<=num; i++){
   if(num%i==0){
   System.out.println(i);}
   }
   }
   }
   }