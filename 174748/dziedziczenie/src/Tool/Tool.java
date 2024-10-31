package Tool;

public class Tool {
    protected String nazwaNarzedzia;

    protected Tool(String nazwaNarzedzia) {
        this.nazwaNarzedzia = nazwaNarzedzia;
    }

    public String getNazwaNarzedzia() {
        return nazwaNarzedzia;
    }

    public void przeczytajNazwe(){
        System.out.println("To jest " + getNazwaNarzedzia() + ".");
    }
}
