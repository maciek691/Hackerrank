package Day20_Enum_BubbleSort;

import static Day20_Enum_BubbleSort.HairColour.*;

// enum - dana zmienna może przyjmować tylko określone wartości.
public class Person {

    HairColour hairColour = RED;

    public Person(){

    }

    public static void main(String[] args) {

        Person peterParker = new Person();
        Person spiderman = peterParker;

        spiderman.hairColour = BLACK;

        System.out.println("Hair colour of Peter Parker: "+ peterParker.hairColour);
        System.out.println("Hair colour of Spiderman: "+ spiderman.hairColour);

    }
}
