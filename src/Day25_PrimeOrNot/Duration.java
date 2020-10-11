package Day25_PrimeOrNot;

public class Duration extends Solution{

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        String test = isItPrime1(3,123454323);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Duration isItPrime1: " + duration + "ms");


        long startTime2 = System.currentTimeMillis();
        String test2 = isItPrime2(3,123454323);
        long endTime2 = System.currentTimeMillis();
        long duration2 = endTime2 - startTime2;
        System.out.println("Duration isItPrime2: " + duration2 + "ms");


        long startTime3 = System.currentTimeMillis();
        String test3 = isItPrime3(3,123454323);
        long endTime3 = System.currentTimeMillis();
        long duration3 = endTime3 - startTime3;
        System.out.println("Duration isItPrime3: " + duration3 + "ms");
    }
}
