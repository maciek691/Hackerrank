package Day25_PrimeOrNot;

import java.util.Scanner;

public class Solution {

        public static String isItPrime1 (int t, int n) {

            String prime;
            int sum = 0;
            if (n > 1) {
                for (int j = 2; j<=Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        sum++;
                    }
                }

                if (sum == 0) {
                    prime = "Prime";
                } else {
                    prime = "Not Prime";
                }
            } else {
                prime = "Prime";
            }
            return prime;
        }

    public static String isItPrime2 (int t, int n) {

        String prime;
        int sum = 0;
        if (n > 1) {
                for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    sum++;
                }
            }

            if (sum == 0) {
                prime = "Prime";
            } else {
                prime = "Not Prime";
            }
        } else {
            prime = "Prime";
        }
        return prime;
    }

    public static String isItPrime3 (int t, int n) {

        String prime;
        int sum = 0;
        if (n > 1) {
                for (int j = 2; j*j<=n; j++) {
                if (n % j == 0) {
                    sum++;
                }
            }

            if (sum == 0) {
                prime = "Prime";
            } else {
                prime = "Not Prime";
            }
        } else {
            prime = "Prime";
        }
        return prime;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String result = null;
        for (int i = 0; i < t; i++) {
//            int sum = 0;
            int n = sc.nextInt();

            result = isItPrime1(t,n);
            System.out.println(result);
        }

    }
}
