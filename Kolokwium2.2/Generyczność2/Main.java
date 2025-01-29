package Generyczność2;

public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 12;
        int c = 13;

        isEqualOrNull<Integer> i1 = new isEqualOrNull<>(a , b);
        System.out.println(i1.isEqual());
        isEqualOrNull<Integer> i2 = new isEqualOrNull<>(a , c);
        System.out.println(i2.isEqual());
    }
}
