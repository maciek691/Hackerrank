import java.util.Scanner;

public class Day6 {
    // z podanego wyrazu szereguje litery z moejsc nieparzystych i parzystych
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int testCase = scn.nextInt();

        for ( int i=0; i<testCase; i++) {
            char[] myCharArray = scn.next().toCharArray();
                for (int j = 0; j < myCharArray.length; j+=2) {
                        System.out.print(myCharArray[j]);
                }
                System.out.print(" ");
                for (int j = 1; j < myCharArray.length; j+=2) {
                        System.out.print(myCharArray[j]);
                }
            System.out.println();
        }


    }
}
