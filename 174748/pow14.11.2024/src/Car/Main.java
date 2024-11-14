package Car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Corolla", 2025);
        Car c2 = new Car("Toyota", "Corolla", 2023);
        System.out.println(c1.productionYear);
        System.out.println(c2.productionYear);
    }
}
