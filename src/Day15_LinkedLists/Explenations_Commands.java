package Day15_LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class Explenations_Commands {
    public static void main(String[] args) {

// wstawianie danych do listy za pomocą pętli for

        LinkedList<Integer> ints1 = new LinkedList<>();
        ArrayList<Integer> ints2 = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            ints1.add(i);
            ints2.add(i);
        }


// Podobne do tabeli ale ma dynamiczną długośc a nie z góry określoną.

        LinkedList<String> myLinkedList = new LinkedList<String>();

// Add a node with data="First" to back of the (empty) list
        myLinkedList.add("First");

// Add a node with data="Second" to the back of the list
        myLinkedList.add("Second");

// Insert a node with data="Third" at front of the list
        myLinkedList.addFirst("Third");

// Insert a node with data="Fourth" at back of the list
        myLinkedList.addLast("Fourth");

// Insert a node with data="Fifth" at index 2
        myLinkedList.add(2, "Fifth");

// Print the list: [Third, First, Fifth, Second, Fourth]
        System.out.println(myLinkedList);

// Print the value at list index 2:
        System.out.println(myLinkedList.get(2));

// Empty the list
        myLinkedList.clear();

// Print the newly emptied list: []
        System.out.println(myLinkedList);
    }
}
