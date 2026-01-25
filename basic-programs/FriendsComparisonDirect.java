import java.util.Scanner;
 public class FriendsComparisonDirect{
    public static void main(String[] args){
        
		Scanner scanner = new Scanner(System.in);
        int ageAmar = scanner.nextInt();
        int heightAmar = scanner.nextInt();

        int ageAkbar = scanner.nextInt();       
        int heightAkbar = scanner.nextInt();

        int ageAnthony = scanner.nextInt();
        int heightAnthony = scanner.nextInt();

        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("The youngest friend is: Amar");
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("The youngest friend is: Akbar");
        } else {
            System.out.println("The youngest friend is: Anthony");
        }

        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            System.out.println("The tallest friend is: Amar");
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            System.out.println("The tallest friend is: Akbar");
        } else {
            System.out.println("The tallest friend is: Anthony");
        }

    }
}