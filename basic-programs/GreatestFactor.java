import java.util.Scanner;
 public class GreatestFactor{
  public static void main(String[] args){
  
  Scanner sc =new Scanner(System.in);
  int num=sc.nextInt();
  int gf=1;
  
  for(int i=num-1; i>=1; i--){
   if(num%i==0){
     gf=i;
	 break;}
	 }
	  System.out.println(gf);
	 }
	}