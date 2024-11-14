package Vehicle2;

import java.util.Calendar;
import java.util.Objects;

public class Vehicle {
    String brand;
    String model;
    int yearOfProduction;

    Vehicle(String brand, String model, int yearOfProduction){
        if(yearOfProduction > Calendar.getInstance().get(Calendar.YEAR)){
            this.yearOfProduction = Calendar.getInstance().get(Calendar.YEAR);
        }
        else{
            this.yearOfProduction = yearOfProduction;
        }
        if(brand != null || brand.isEmpty()){
            this.brand = brand;
        }
        else{
            this.brand = " ";
        }
        if(model != null || model.isEmpty()){
            this.model = model;
        }
        else{
            this.model = " ";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return yearOfProduction == vehicle.yearOfProduction && brand.equals(vehicle.brand) && model.equals(vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Vehicle: " + brand + " " + model + ", Year: " + yearOfProduction;
    }
}
