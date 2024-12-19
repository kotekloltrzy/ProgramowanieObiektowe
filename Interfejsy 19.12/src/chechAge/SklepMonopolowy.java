package chechAge;

public class SklepMonopolowy {
    public static void main(String[] args) {
        try{
            sprzedajCos();
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public static void sprzedajCos() throws IllegalArgumentException{
        checkAge(17);
    }

    public static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Niepełnoletni klient");
        }
    }
}
