import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {

   /*  stworzenie książki telefonicznej korzystajac z map
    Map is an interface that provides a blueprint for data structures that take (key, value) pairs and map keys to their associated
    values (it's important to note that both the  and the  must be Objects and not primitives).

    Here are a few Map methods you will find helpful for this challenge:

    containsKey(Object key): Returns true if the map contains a mapping for key; returns false if there is
     no such mapping.
    get(Object key): Returns the value to which the key is mapped; returns null if there is no such mapping.
    put(K key, V value): Adds the (Key, Value) mapping to the Map; if the key is already in the map,
     the value is overwritten.

    Create a Map of String Keys to String Values, implemented by the HashMap class
    Map<String,String> myMap = new HashMap<String,String>();

    Adds ("Hi","Bye") mapping to myMap
    myMap.put("Hi", "Bye");

    Print the Value mapped to from "Hi"
    System.out.println(myMap.get("Hi"));

    Replaces "Bye" mapping from "Hi" with "Bye!"
    myMap.put("Hi", "Bye!");

    Print the Value mapped to from "Hi"
    System.out.println(myMap.get("Hi"));
    */

    public static void main(String[] args) {

        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i=0;i<n;i++) {
            phoneBook.put(scn.next(), scn.nextInt());
        }
        String serch;
        for (int i=0;i<n;i++) {
            serch = scn.next();
            if (phoneBook.containsKey(serch)) {
                System.out.println(serch + "=" + phoneBook.get(serch));
            } else {
                System.out.println("Not found");
            }
            }
        }
    }

