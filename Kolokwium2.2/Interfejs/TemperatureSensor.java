package Interfejs;

public class TemperatureSensor implements Sensor {
    @Override
    public double readValue() {
        return 12.5;
    }

    @Override
    public String getStatus() {
        return "Temperatura na dworze: " + readValue();
    }

    @Override
    public void reset() {
        System.out.println("Zresetowano termometr");
    }
}
