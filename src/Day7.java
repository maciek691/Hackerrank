import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {

 /*     odczyt od tyłu tabeli:

        Sample Input
        4
        1 4 3 2
        Sample Output
        2 3 4 1*/

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];


        for (int i =0;i<N;i++) {
            A[i]= scanner.nextInt();
        }

        for (int i = N-1; i >= 0; i--) {
            System.out.print(A[i]+" ");
        }

    }
}
