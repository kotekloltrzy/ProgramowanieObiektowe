package GenericQueue;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        GenericQueue<Integer> g1 = new GenericQueue<Integer>();
        g1.enqueue(8);
        g1.enqueue(21);
        g1.enqueue(37);
        g1.enqueue(42);

        try {
            System.out.println(g1.dequeue());
            System.out.println(g1.dequeue());
            System.out.println(g1.dequeue());
            System.out.println(g1.dequeue());
            System.out.println(g1.dequeue());
        } catch(NoSuchElementException e){
            System.out.println("Lista jest pusta");
        }
    }
}
