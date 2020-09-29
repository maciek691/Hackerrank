package Day19_Interfaces;

import java.util.Scanner;

public class Solution {


    public static int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();

        System.out.println(divisorSum(k));

    }

}





