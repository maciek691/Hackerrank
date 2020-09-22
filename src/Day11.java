import java.util.Scanner;

public class Day11 {

/*     tablica dwuwymiarowa --> arr[wiersz][kolumna]
     znajdz najwieksza sume w tablicy 6x6 wg podanego wzorca:
          x x x
            x
          x x x                 */

    
    public static void main(String[] args) {

        int[][] arr = new int[6][6];

        //wprowadzenie danch

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");


            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();

        // odczyt danych

        for (int i =0; i<6; i++) {
            for (int j=0; j<6; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        // wyliczenie sumy i max liczb z zadanego układu

        int sum =0;
        int sumMax =0;

        for (int i=1; i<5; i++) {           // rzędy
            for (int j=1; j<5; j++){        // kolumny
                sum = arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i][j]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
                if (sum>sumMax){
                    sumMax=sum;
                }

            }

        }
        System.out.println(sumMax);

    }
}
