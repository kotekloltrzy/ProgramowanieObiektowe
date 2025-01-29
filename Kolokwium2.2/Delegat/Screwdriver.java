package Delegat;

public class Screwdriver implements Tool{

    @Override
    public void useTool() {
        System.out.println("Użyto śrubokrętu");
    }
}
