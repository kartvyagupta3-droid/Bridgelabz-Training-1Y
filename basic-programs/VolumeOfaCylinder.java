import java.util.Scanner;
public class VolumeOfaCylinder{
	
	public static void volume_of_cylinder(){
		Scanner a =new Scanner(System.in);
		float r= a.nextFloat();
		float h= a.nextFloat();
		double  b= 3.14*(r*r)*h;
		System.out.println(b);
	}
	
	public static void main(String[] args){
		volume_of_cylinder();
	}
}
		