package isEqual;

public class Main {
    public static void main(String[] args) {
        String nazwa1 = "Kot";
        String nazwa2 = "Pies";
        String nazwa3 = "Kot";

        System.out.println((isEqual(nazwa1 , nazwa2)));
        System.out.println((isEqual(nazwa1 , nazwa3)));
    }
    public static <T> boolean isEqual(T value1, T value2){
        return value1.equals(value2);
    }
}
