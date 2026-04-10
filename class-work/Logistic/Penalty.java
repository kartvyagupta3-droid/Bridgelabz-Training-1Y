import java.util.Scanner;

public class Penalty extends RouteSummary {
   int actual;

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {

        this.actual = actual;
    }

    public int getExpected() {

        return expected;
    }

    public void setExpected(int expected) {

        this.expected = expected;
    }

    int expected;

    public void m1(){
        Scanner sc =new Scanner(System.in);
        int delay=sc.nextInt();

    if(actual>expected){
       int  delivery=(actual-expected)*2;
        System.out.println(delivery);
    } else if (delay>30) {
       double rest=(actual-expected)*0.5;
        System.out.println(rest);
    }
    }
}
