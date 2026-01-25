import java.util.Scanner;
 public class FizzBuzzByWhile {
    public static void main(String[] args) {
 
 Scanner scanner = new Scanner(System.in);       
        String input = scanner.nextLine();

        
        try {
            int num = Integer.parseInt(input);

            if (num > 0) {
                
                while (i <= num) {
                    if (i % 3 == 0 && i % 5 == 0) {
                       System.out.println("FizzBuzz");
                    } else if (i % 3 == 0) {
                        System.out.println("Fizz");
                    } else if (i % 5 == 0) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println(i);
                    }
                }
            } else {
                System.out.println("Please enter a number greater than 0.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a positive integer.");
        }


    }
}