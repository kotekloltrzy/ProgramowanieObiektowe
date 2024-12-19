package Sensor;

public class TemperatureSensor implements Sensor{
    @Override
    public double readValue() {
        return 24.3;
    }

    @Override
    public String getStatus() {
        return "Temperatura wynosi: " + readValue() + " stopni Celsjusza. ";
    }

    @Override
    public void reset() {

    }
}
