package Counter;

import java.util.ArrayList;

public class Counter<T> {
    private int count = 0;
    ArrayList<T> value;

    public Counter(ArrayList<T> value){
        this.value = value;
    }

    public void add(T element){
        value.add(element);
        setCount(this.count+1);
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }
}
