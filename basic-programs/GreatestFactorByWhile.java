import java.util.Scanner;
 public class GreatestFactorByWhile{
  public static void main(String[] args){
  
  Scanner sc =new Scanner(System.in);
  int num=sc.nextInt();
  int gf=1;
  int counter=num-1;
  while(counter>=1){
   if(num%counter==0){
    counter=gf;
	break;}
	counter--;
	}
	  System.out.println(gf);
	 }
	}