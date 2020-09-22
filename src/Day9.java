import java.util.Scanner;

public class Day9 {

    // recurencja (recursion) odwolywanie się w petli az dojscia do base case

    static int summation(int n) {               // metoda do summation n (summation 5 = 5+4+3+2+1
        if (n<=0) {
            return 0;
        } else {
            return n + summation(n-1);
        }
    }

    static int factorial(int n) {               //metoda do obliczania silni n
        if (n<=1) {         //base case
            return 1;
        } else {            //recursive case
            int recuse = factorial(n-1);
            return n*recuse;
        }
    }

    static int exponentiation (int n, int k) {  //metoda do podnoszenia n do potęgi k
        if (k<=0){
            return 1;
        } else {
            return n*exponentiation(n,k-1);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(summation(n));
        System.out.println(factorial(n));
        System.out.println(exponentiation(n,k));
    }
}

