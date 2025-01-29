package Interfejs;

public class Main {
    public static void main(String[] args) {
        PressureSensor p1 = new PressureSensor();
        TemperatureSensor t1 = new TemperatureSensor();
        System.out.println(p1.getStatus());
        System.out.println(t1.readValue());
        p1.reset();
        t1.reset();
    }
}
