package Tool;

public class Hammer extends Tool{
    public Hammer(String nazwaNarzedzia){
        super(nazwaNarzedzia);
    }

    @Override
    public void przeczytajNazwe() {
        System.out.println("Tutaj leży " + getNazwaNarzedzia() + ".");
    }
}
