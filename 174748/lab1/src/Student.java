public class Student {
    public int nrIndeksu;
    public String imie;
    public String nazwisko;

    public Student(int nrIndeksu, String imie, String nazwisko){
        this.nrIndeksu = nrIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void przedstawSie(){
        System.out.println("Dzień dobry, nazywam się " + imie + " " + nazwisko);
    }

}