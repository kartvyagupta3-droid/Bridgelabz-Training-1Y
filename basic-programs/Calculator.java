import java.util.Scanner;
 public class Calculator{
  public static void main(String[] args) {
    
	Scanner sc= new Scanner(System.in);
    System.out.println("Enter 1st  number");
    int a=sc.nextInt();
    System.out.println("Enter 2nd number");
    int b=sc.nextInt();
    
   System.out.println("Choose operation");
   System.out.println("1 : + (Addition)");
   System.out.println("2 : - (Subtraction)");
   System.out.println("3 : * (Multiplication)");
   System.out.println("4 : / (Division)");
   System.out.println("5 : % (Modulo)");

   int choice = sc.nextInt();
   int result = 0; 

       switch(choice){
            case 1:
                result = a + b;
                System.out.println("Result" +result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result" +result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result" +result);
                break;
            case 4:
                if(b!=0){
                    double divisionResult = (double) a/b;
                    System.out.println("Result" +divisionResult);
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;
            case 5:
                if(b!=0){
                    result = a%b;
                    System.out.println("Result" +result);
                } else {
                    System.out.println("Modulo by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid choice! Please select 1 to 5");
        }

  
 }
}
