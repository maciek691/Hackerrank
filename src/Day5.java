import java.util.Scanner;

public class Day5 {
    //mnoży podana liczbę przez liczby od 1 do 10

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int wynik = 0;

                for ( int i = 1; i<=10;i++) {
                    wynik=n*i;
                    System.out.println(n+" x "+i+" = "+wynik);

                }

    }
}
