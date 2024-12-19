package Sensor;

public class PreassureSensor implements Sensor{
    @Override
    public double readValue() {
        return 1000;
    }

    @Override
    public String getStatus() {
        return "Ciśnienie wynosi: " + readValue() + " hPa.";
    }

    @Override
    public void reset() {

    }
}
