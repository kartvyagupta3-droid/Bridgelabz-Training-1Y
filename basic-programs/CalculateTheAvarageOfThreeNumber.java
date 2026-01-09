import java.util.Scanner;
public class CalculateTheAvarageOfThreeNumber{
	
	public static void avarage_of_three_number(){
		Scanner a =new Scanner(System.in);
		int  r= a.nextInt();
	    int h= a.nextInt();
		int  b= a.nextInt();
		int c=(r+h+b)/3;
		System.out.println(c);
	}
	
	public static void main(String[] args){
		avarage_of_three_number();
	}
}
		