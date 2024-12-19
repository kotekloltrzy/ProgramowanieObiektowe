package Sensor;

public class SensorTest {
    public static void main(String[] args) {
        PreassureSensor ps = new PreassureSensor();
        TemperatureSensor ts = new TemperatureSensor();

        System.out.println(ps.getStatus());
        System.out.println(ts.getStatus());
    }
}
