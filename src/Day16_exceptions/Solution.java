package Day16_exceptions;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            int N = Integer.parseInt(S);
            System.out.println(S);
        }
        catch (NumberFormatException e) {
            System.out.println("Bad String");
        }



    }

}
