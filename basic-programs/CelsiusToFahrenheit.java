import java.util.Scanner;
public class CelsiusToFahrenheit{
	
	public static void celsius_to_fahrenheit(){
		Scanner k =new Scanner(System.in);
		float tem=k.nextFloat();
		float f=(tem*9/5)+32;
		System.out.println(f);
	}
	public static void main(String[] args){
		celsius_to_fahrenheit();
	}
}