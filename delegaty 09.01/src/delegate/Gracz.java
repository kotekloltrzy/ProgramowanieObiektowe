package delegate;

public class Gracz {
    Weapon bron;

    public Gracz(Weapon bron){
        this.bron = bron;
    }

    public void zaatakuj(){
        bron.attack();
    }

    public Weapon getBron() {
        return bron;
    }

    public void setBron(Weapon bron) {
        this.bron = bron;
    }
}
