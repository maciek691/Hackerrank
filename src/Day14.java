public class Day14 {

    public static void main(String[] args) {

    int[] elements = {1,2,5,9,6,8,7,4};
    int maximumDifference = 0;

/*    constructor for hackerrank: A class constructor that takes an array of integers as
        a parameter and saves it to the elements instance variable.

    Difference (int [] num) {
        this.elements = num;
    }  */

//      method:

//    void computeDifference () {
        for (int i = 0; i< elements.length; i++) {
            for (int j = 1; j< elements.length;j++){
                int diff = Math.abs(elements[i] - elements[j]);
                if (maximumDifference<diff) {
                    maximumDifference=diff;
                }
            }
        }
        System.out.println(maximumDifference);
//    }



}
}
