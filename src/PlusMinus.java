import java.util.Scanner;

public class PlusMinus {
/*    pierwsza liczba mówi o dlugosci tabeli,
    za zadanie jest napisac kod ktory bedzie zwracał współczynnik ilosci liczb ujemnych, dodatnich i zer w całości tabeli
    w formacie 6ciu miejsc po przecinku*/

    //-4 3 -9 0 4 1

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countOfNumbers = scanner.nextInt();
        int [] arr = new int[countOfNumbers];
        double positive =0;
        double negative =0;
        double zeros =0;

        for( int i =0; i<arr.length; i++) {

            arr[i] = scanner.nextInt();
        }

        for (int i =0; i<arr.length; i++) {
            if( arr[i]<0) {
                negative++;
            } else if (arr[i]==0) {
                zeros++;
            } else {
                positive++;
            }
        }

        double ratioPositive = (double) positive/countOfNumbers;
        double ratioNegative = (double) negative/countOfNumbers;
        double ratioZeros = (double) zeros/countOfNumbers;

        System.out.format("%.6f",ratioPositive);
        System.out.println();
        System.out.format("%.6f",ratioNegative);
        System.out.println();
        System.out.format("%.6f",ratioZeros);

    }
}
