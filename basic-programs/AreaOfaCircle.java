import java.util.Scanner;
public class AreaOfaCircle{
	
	public static void area_of_circle(){
		Scanner a =new Scanner(System.in);
		float r= a.nextFloat();
		double b= 3.14*(r*r);
		System.out.println(b);
		
	}
	
	public static void main(String[] args){
		area_of_circle();
	}
}
		