package Day26;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution1_arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String actualReturnDate = sc.nextLine();
        String expectedReturnDate = sc.nextLine();


        String[] actual = actualReturnDate.split(" ");
        String[] expected = expectedReturnDate.split(" ");

        int [] actualInt = new int[actual.length];
        int [] expectedInt = new int[expected.length];

        for (int i = 0;i <actual.length; i++) {
            actualInt[i] = Integer.parseInt(actual[i]);
            expectedInt[i] = Integer.parseInt(expected[i]);
        }

        if (actualInt[2] > expectedInt[2]) {
            System.out.println("10000");
        } else if (actualInt[1] > expectedInt[1] && (actualInt[2] >= expectedInt[2])) {
            System.out.println((actualInt[1] - expectedInt[1]) * 500);
        } else if (actualInt[0] > expectedInt[0] && (actualInt[1] >= expectedInt[1]) && (actualInt[2] >= expectedInt[2])) {
            System.out.println((actualInt[0] - expectedInt[0]) * 15);
        } else {
            System.out.println(0);
        }

    }
}
