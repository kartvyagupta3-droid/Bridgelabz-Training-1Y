import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        int day = sc.nextInt();
		
        if ((mon==3 && day>=20 && day <= 31) ||(mon==4 && day>=1 && day <= 30) ||(mon==5 && day>=1 && day <= 31) ||(mon==6 && day>=1 && day <= 20)) {
            System.out.println("It's Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }


    }
}