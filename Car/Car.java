package Car;

import java.util.Comparator;

public class Car{
    String brand;
    int mileage;
    int yearOfProduction;

    public Car(String brand, int mileage, int yearOfProduction) {
        this.brand = brand;
        if(mileage < 0 || yearOfProduction < 0) {
            throw new IllegalArgumentException("Mileage and year of production cannot be negative");
        }
        else{
            this.mileage = mileage;
            this.yearOfProduction = yearOfProduction;
        }
    }

    public int getMileage(){
        return mileage;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Mileage: " + mileage + ", YearOfProduction=" + yearOfProduction + "\n";
    }

    public static class MileageComparator implements Comparator<Car> {

        @Override
        public int compare(Car o1, Car o2) {
            return Integer.compare(o1.getMileage(), o2.getMileage());
        }
    }

}
