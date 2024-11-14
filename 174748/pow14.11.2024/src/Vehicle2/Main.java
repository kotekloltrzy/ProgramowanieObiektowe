package Vehicle2;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Toyota", "Corolla", 2025);
        Vehicle v3 = new Vehicle("Toyota", "Corolla", 2024);
        Vehicle v2 = new Vehicle("Toyota", "Yarris", 2023);
        System.out.println(v1.equals(v2));
        System.out.println(v1.yearOfProduction);
        System.out.println(v2.equals(v3));
        System.out.println(v2.yearOfProduction);
        System.out.println(v3.equals(v1));
        System.out.println(v3.yearOfProduction);
    }
}
