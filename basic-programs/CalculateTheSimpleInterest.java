import java.util.Scanner;
public class CalculateTheSimpleInterest{
	
	public static void calculate_simple_interest(){
		Scanner a =new Scanner(System.in);
	  float rate= a.nextInt();
	   float time= a.nextInt();
	  float principle = a.nextInt();
		double simpleinterest=(rate+time+principle)/100;
		System.out.println(simpleinterest);
	}
	
	public static void main(String[] args){
		calculate_simple_interest();
	}
}
		