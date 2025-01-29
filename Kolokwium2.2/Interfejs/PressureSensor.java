package Interfejs;

public class PressureSensor implements Sensor{
    @Override
    public double readValue() {
        return 999.9;
    }

    @Override
    public String getStatus() {
        return "Ciśnienie na dworze:" + readValue();
    }

    @Override
    public void reset() {
        System.out.println("Zresetowano Ciśnieniomierz");
    }
}
