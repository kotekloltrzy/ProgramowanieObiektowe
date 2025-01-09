package Pair;

public class Pair<T, U> {
    public T value1;
    public U value2;

    public Pair(T value1, U value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getFirst(){
        return value1;
    }

    public U getSecond(){
        return value2;
    }
}
