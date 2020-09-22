import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if (n % 2 == 0) {

            if (n > 2 && n < 5) {
                System.out.println("Not Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        } else {
            System.out.println("Weird");
        }

    }
}

