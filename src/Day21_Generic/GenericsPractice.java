package Day21_Generic;

public class GenericsPractice {

    public static <T extends Comparable <T>> T findMax(T a, T b) {
        int n = a.compareTo(b);
        if (n < 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(findMax(1,5));
        System.out.println(findMax(5,1));
        System.out.println(findMax(5,5));

        System.out.println(findMax(5.3, 4.5));
        System.out.println(findMax("b", "d"));
        System.out.println(findMax("hi", "there"));
    }



}
