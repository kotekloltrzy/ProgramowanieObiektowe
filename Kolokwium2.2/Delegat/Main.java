package Delegat;

public class Main {
    public static void main(String[] args) {
        WorkTool w1 = new WorkTool("Młot", 2025, new Hammer());
        w1.use();
        w1.setTool(new Screwdriver());
        w1.use();
    }
}
