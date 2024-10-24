package zad6;

public class Car {
    public String brand;
    public String model;
    public int productionYear;

    Car(String brand,String model,int productionYear){
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }

    Car(String brand, String model){
        this(brand,model,2024);
    }
}
