package Day17_exceptions_2;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class HotChocolate {
    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException, TooColdException {
        // jeśli by było wcześniej try - catch to nie trzeba dawać throws.
        if(cocoaTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold) {
            throw new TooColdException();
        }
    }

    public static void main(String[] args) throws TooHotException, TooColdException, InterruptedException {

        // nie ma potrzeby dodawać throws. Jak będą tylko throws (bez try - catch)
        // to wywali nam błąd TooHotException lub tooColdException

        double currentCocoaTemp = 200;
        boolean wrongTemp = true;

        while(wrongTemp) {
        try{
            drinkHotChocolate(currentCocoaTemp);
            System.out.println("That cocoa was good!");
            wrongTemp = false;
        } catch (TooHotException e1) {
            System.out.println("THAT'S TOO HOT!!");
            currentCocoaTemp = currentCocoaTemp - 5;
        } catch (TooColdException e2) {
            System.out.println("THAT'S SO COLD!!");
            currentCocoaTemp = currentCocoaTemp + 5;
        }
            TimeUnit.SECONDS.sleep(2);

        }
        System.out.println("And it's gone...");
    }
}
