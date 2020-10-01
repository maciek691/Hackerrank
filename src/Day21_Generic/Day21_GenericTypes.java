package Day21_Generic;

public class Day21_GenericTypes {

    // dzieki Generic Types nie musimy trzymać sie stricte jednego typu danych w metodzie, może ona sie
    // zmieniać wraz z potrzebami

    public static <E> void printArray(E[] array) {
        System.out.print("[");
        for (int i=0; i < array.length; i++) {
            E item = array[i];
            System.out.print(item);
            if (i< array.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    // ta sama metoda tylko mniej kodu:
    public static <E> void printArrayShort(E[] array) {
        for (E element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        //        było:
        //        int[] intArray2 = new int[4];
        //        int[] intArray1 = {5,2,9,1,3};
        //        printArray(intArray1);


        Integer[] intArray2 = new Integer[4];
        Integer[] intArray1 = {5,2,9,1,3};
        printArray(intArray1);
    }


}
