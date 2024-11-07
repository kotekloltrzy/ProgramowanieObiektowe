package Car;

public record Car(String brand, String model, double fuelConsumptionPer100km) {
    public double fuelCost(double fuelPrice, double distance){
        return (distance/100)*fuelConsumptionPer100km*fuelPrice;
    }
}
