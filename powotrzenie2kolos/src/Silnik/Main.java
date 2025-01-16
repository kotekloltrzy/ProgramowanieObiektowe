package Silnik;

public class Main {
    public static void main(String[] args) {
        Samochód car = new Samochód(new BenzynowySilnik());

        car.start();

        car.stop();

        Samochód car2 = new Samochód((new SilnikDieselowy()));

        car2.start();

        car2.stop();
    }
}
