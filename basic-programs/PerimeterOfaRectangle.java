import java.util.Scanner;
public class PerimeterOfaRectangle{
	
	public static void perimeter_of_rectangle(){
		Scanner a =new Scanner(System.in);
		float l= a.nextFloat();
		float w= a.nextFloat();
		double  p=2*(l+w);
		System.out.println(p);
	}
	
	public static void main(String[] args){
		perimeter_of_rectangle();
	}
}
		