import java.util.Scanner;
public class ConvertKilometersToMiles{
	
	public static void kilometer_to_miles(){
		Scanner a =new Scanner(System.in);
		float Kliometer= a.nextFloat();
		double miles= Kliometer*0.621371;
		System.out.println(miles);
	}
	
	public static void main(String[] args){
		kilometer_to_miles();
	}
}
		