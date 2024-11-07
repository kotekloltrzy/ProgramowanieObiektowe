package Car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Corrola", 7.00);
        System.out.println(c1.brand() + " "+ c1.model() + " " + c1.fuelConsumptionPer100km());
        System.out.println(c1.fuelCost(6.50, 150));
    }
}
