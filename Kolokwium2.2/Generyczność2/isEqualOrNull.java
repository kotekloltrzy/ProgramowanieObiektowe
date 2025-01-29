package Generyczność2;

public class isEqualOrNull<T> {
    private T t1;
    private T t2;

    public isEqualOrNull(T t1, T t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public boolean isEqual() {
        if(this.t1==null && this.t2==null){
            return true;
        }
        if(this.t1 == this.t2)
            return true;
        else
            return false;
    }
}
