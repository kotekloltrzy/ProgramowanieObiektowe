package Pracownik;

import java.time.LocalDate;
import java.util.Comparator;

public class Pracownik implements Comparable<Pracownik>{
    String imie;
    double pensja;
    LocalDate dataZatrudnienia;

    Pracownik(String imie, double pensja, LocalDate dataZatrudnienia){
        this.imie = imie;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return "Pracownik: "+imie+", pensja: "+pensja+", data zatrudnienia: "+dataZatrudnienia+". ";
    }

    @Override
    public int compareTo(Pracownik o) {
        return 0;
    }

    static class PracownikPensjaComparaotr implements Comparator<Pracownik>{

    @Override
    public int compare(Pracownik o1, Pracownik o2) {
        return Double.compare(o1.pensja, o2.pensja);
        }
    }
}
