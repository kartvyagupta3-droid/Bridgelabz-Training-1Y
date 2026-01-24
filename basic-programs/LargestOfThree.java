import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        boolean firstLargest = (n1>=n2 && n1>=n3);
        boolean secondLargest = (n2>=n1 && n2>=n3);
        boolean thirdLargest = (n3>=n1 && n3>=n2);

        System.out.println("is the first number the largest? " + (firstLargest ? "Yes" : "No"));
        System.out.println("is the second number the largest? " + (secondLargest ? "Yes" : "No"));
        System.out.println("is the third number the largest? " + (thirdLargest ? "Yes" : "No"));

  
    }
}