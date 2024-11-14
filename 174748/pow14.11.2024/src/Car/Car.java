package Car;

import java.util.Calendar;

public class Car {
    String brand;
    String model;
    int productionYear;

    Car(String brand, String model, int productionYear){
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
        if(productionYear > Calendar.getInstance().get(Calendar.YEAR)){
            this.productionYear = Calendar.getInstance().get(Calendar.YEAR);
        }
        else{
            this.productionYear = productionYear;
        }
    }
}
