package Silnik;

public class SilnikDieselowy implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("Uruchomiono silnik Diesela");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymano silnik Diesela");
    }
}
