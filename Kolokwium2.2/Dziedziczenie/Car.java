package Dziedziczenie;

public class Car extends Vehicle {
    int numberOfDoors;

    public Car(String model, String brand, int numberOfDoors) {
        super(model, brand);
        this.numberOfDoors = numberOfDoors;
    }
}
