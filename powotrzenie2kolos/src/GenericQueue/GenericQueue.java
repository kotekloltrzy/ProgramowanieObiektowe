package GenericQueue;

import java.util.ArrayList;

public class GenericQueue <T>{
    private final ArrayList<T> lista;

    public GenericQueue(){
        lista = new ArrayList<>();

    }

    public void enqueue(T element){
        lista.add(element);
    }

    public T dequeue(){
        T temp = lista.getFirst();
        lista.removeFirst();
        return temp;
    }
}
