import java.util.Scanner;
 public class AllMultiplesByWhile{
  public static void main(String[] args){
   
   Scanner sc =new Scanner(System.in);
   int num =sc.nextInt();
   int count=num-1;
   
   if(num>=0 && num<100){
   while(count>=1){
   if(count%num==0){
   System.out.println(num);
   continue;
   }
   }
   }
   }
   }