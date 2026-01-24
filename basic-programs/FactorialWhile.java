import java.util.Scanner;
 public class FactorialWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();

        if (n<0){
            System.out.println("enter a positive integer.");
        } else {
            long fact= 1;  
            int count= 1;     
            
            while(count<= n) {
                fact*= count;
                count++;
            }
            System.out.println("Factorial of " +n+ " = " + factorial);
        }
    }
}