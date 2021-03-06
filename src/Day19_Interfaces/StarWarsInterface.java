package Day19_Interfaces;

// Interface it is a collection of abstract methods, it's not a class -> no constructor, no implementations.
// implement an interface <-> extend a class
/* Interfejs może zawierać jedynie deklaracje metod, a klasa abstrakcyjna może zawierać również metody zdefiniowane.
Wynika to bezpośrednio z tego, że interfejs skupia się na zapewnieniu określonej funkcjonalności, natomiast klasa
abstrakcyjna może również opierać się na podobieństwie w implementacji klas pochodnych.*/

import java.util.Random;

public interface StarWarsInterface {

    public static Character summonCharacter() {
        Random rand = new Random();

        if(Math.abs(rand.nextInt()) % 2 ==0) {
            return new Enemy();
        } else {
            return new Hero();
        }
    }

    public static void main(String[] args) {
        Enemy darthVader = new Enemy();
        Hero obiWanKenobi = new Hero();
        darthVader.attack();
        obiWanKenobi.attack();
        darthVader.heal();
        obiWanKenobi.heal();

        System.out.println("Enemy weapon: " +darthVader.getWeapon());
        System.out.println("Hero weapon: "+ obiWanKenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }

}
