import java.util.Scanner;
 public class BonusForEmployess{
  public static void main(String[] args){
   
   Scanner sc= new Scanner(System.in);
    int year=sc.nextInt();
	int salary=sc.nextInt();
	
	if(year>=5){
	float bonus=salary*.05;
	System.out.println("your bonus is" +bonus);}
	else{
	System.out.println("no bouns");}
	}
	}
	