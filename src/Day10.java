import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String m = Integer.toBinaryString(n);

        char[] arr = Integer.toBinaryString(n).toCharArray();
        int one=0;
        int maxOne=0;

        for (int i=0; i< arr.length; i++) {

              if ( arr[i]=='1') {
                  one++;
            } else {
                  one=0;
              }
              if (one>maxOne){
                  maxOne=one;
              }
        }
        System.out.println(m);
        System.out.println(maxOne);
    }
}
