package Triple;

public class Main {
    public static void main(String[] args) {
        String nazwa = "Toyota";
        Integer rokProdukcji = 2024;
        Double cena = 50000.99;

        Triple<String, Integer, Double> auto = new Triple<>(nazwa, rokProdukcji, cena);

        System.out.println(auto.getFirst());
        System.out.println(auto.getSecond());
        System.out.println(auto.getThird());
    }
}
