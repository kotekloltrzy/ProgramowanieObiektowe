package Silnik;

public class Samochód {
    private Silnik engine;

    public Samochód(Silnik engine) {
        this.engine = engine;
    }

    public void start(){
        engine.uruchom();
    }

    public void stop(){
        engine.zatrzymaj();
    }

}
