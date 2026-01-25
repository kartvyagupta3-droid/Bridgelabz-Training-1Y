import java.util.Scanner;
 public class PowerOfNumberByWhile{
  public static void main(String[] args){
   
   Scanner sc=new Scanner(System.in);
   int num=sc.nextInt();
   int pow=sc.nextInt();'
   int res=1;
   
   if(num>=0){
  int count=1;
   while(count<=pow){
   res=res*num;
   count++;}
   }
   System.out.println(res);
   }
   }
   