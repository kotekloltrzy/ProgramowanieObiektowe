package Dziedziczenie;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Toyota", "Corrola");
        Car v2 = new Car("Opel", "Astra", 5);

        System.out.println(v1.model);
        System.out.println(v2.numberOfDoors);
    }
}
