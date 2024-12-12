package Pracownik;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pracownik p1 = new Pracownik("Adam",
                4500,
                LocalDate.of(2003,1,8));
        Pracownik p2 = new Pracownik("Tomek",
                4000,
                LocalDate.of(2002,2,10));
        Pracownik p3 = new Pracownik("Grzegorz",
                4000,
                LocalDate.of(2007,3,12));
        Pracownik p4 = new Pracownik("Michał",
                4600,
                LocalDate.of(2003,12,28));
        Pracownik p5 = new Pracownik("Andrzej",
                5000,
                LocalDate.of(2004,11,18));

        Pracownik[] pracownicy = {p1, p2, p3, p4, p5};
        System.out.println(Arrays.toString(pracownicy));
        Arrays.sort(pracownicy, new Pracownik.PracownikPensjaComparaotr());
        System.out.println(Arrays.toString(pracownicy));
    }
}
