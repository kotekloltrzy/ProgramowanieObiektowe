package Exception1;

import static Exception1.Exception.sprawdz;

public class Main {
    public static void main(String[] args) {
        try{
            sprawdz("kotek@gmail.com");
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
