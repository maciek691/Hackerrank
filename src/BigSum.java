import java.util.Scanner;

public class BigSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] ar= new long[n];


        for (int i=0; i<n; i++) {
            ar[i]=scanner.nextLong();
        }
            long sum = 0L;
        for (int i=0; i<ar.length; i++) {
            sum=sum+ar[i];
        }
        System.out.println(sum);


    }
}
