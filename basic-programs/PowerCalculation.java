import java.util.Scanner;
public class PowerCalculation {
         
        public static void power_calculation(){
           Scanner s=new Scanner(System.in);
		    
			double base= s.nextDouble();
			
			double exponent =s.nextDouble();
			
			double result= Math.pow(base, exponent);
			
		System.out.println(result);
		}
	public static void main(String[] args){
	power_calculation(); }
}
