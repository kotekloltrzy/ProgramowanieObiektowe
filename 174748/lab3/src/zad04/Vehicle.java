package zad04;

import java.util.Objects;

public class Vehicle {
    public String brand;
    public String model;
    public int yearOfProduction;

    public String notNull(String string){
        if(string==null){
            return "";
        }
        return string;
    }

    Vehicle(String brand, String model, int yearOfProduction){
        this.brand = notNull(brand);
        this.model = notNull(model);
        this.yearOfProduction = Math.min(yearOfProduction, 2024);
    }

    @Override
    public String toString() {
        return "Vehicle:"  + brand + " " + model + ", Year: "  + yearOfProduction + ".";
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
}
