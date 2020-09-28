package Day18;

import java.util.LinkedList;
import java.util.Stack;

public class Queuey {

    // queue -> FIFO
    // stack -> LIFO

    LinkedList queue = new LinkedList ();

    //Construktor (make a que instance)
    public Queuey() {
        queue = new LinkedList();
    }
    // Methods

    // czy kolejka jest pusta?
    public boolean isEmpty() {
       return queue.isEmpty();
    }
    // podaj wielkość kolejki
    public int size() {
        return queue.size();
    }
    //doodaj do kolejki
    public void enqueue (int n) {
        queue.addLast(n);
    }
    //podaj i usun pierwsza
    public int dequeue() {
        return (int) queue.remove(0);
    }
    // podaj pierwsza
    public int peek() {
        return (int) queue.get(0);
    }

    public static void main(String[] args) {
/*         Queuey numberQueue = new Queuey();

         numberQueue.enqueue(5);
         numberQueue.enqueue(7);
         numberQueue.enqueue(6);

        System.out.println("First out: "+ numberQueue.dequeue());
        System.out.println("Second out: "+ numberQueue.dequeue());
        System.out.println("Third out: "+ numberQueue.dequeue());*/

        Stack <Integer> stacky = new Stack<>();

        stacky.push(4);                // push - dodaje na wierch
        stacky.push(3);
        stacky.push(2);

        System.out.println("wybierz i usuń: " + stacky.pop());   // pop - wybiera i usuwa
        System.out.println("wybierz: " + stacky.peek());  // peek - wybiera
        System.out.println("wybierz i usuń: " + stacky.pop());
        System.out.println("wybierz: " + stacky.peek());
        System.out.println("rozmiar stosu: " + stacky.size());
    }

}
