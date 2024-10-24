package zad04;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Toyota", "Corrola", 2020);
        Vehicle v2 = new Vehicle("Toyota", "Corrola", 2020);
        Vehicle v3 = new Vehicle("Toyota", "Corrola", 2028);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v1.equals(v2));
        System.out.println(v2.equals(v3));
    }
}
