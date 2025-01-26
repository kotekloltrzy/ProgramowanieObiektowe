package Car;

import java.util.ArrayList;
import java.util.Collections;

public class TestCar{
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Toyota", 1500, 2024));
        cars.add(new Car("Opel", 31000, 2023));
        cars.add(new Car("BMW", 500, 2022));

        System.out.println("Przed sortowaniem:\n" + cars);
        Collections.sort(cars, new Car.MileageComparator());
        System.out.println("Po sortowaniu:\n" + cars);
    }
}
