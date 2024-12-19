package MusicPlayer;

public class Radio  implements MusicPlayer{

    @Override
    public void TurnOn() {
        System.out.println("Radio właczone");
    }

    @Override
    public void TurnOff() {

        System.out.println("Radio wyłaczone");
    }

    @Override
    public void nextTrack() {
        System.out.println("Stacja zmieniona");
    }

    public static void main(String[] args) {
        Radio r1 = new Radio();

        r1.TurnOn();
        r1.nextTrack();
        r1.TurnOff();
    }
}
