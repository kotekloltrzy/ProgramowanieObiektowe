import zad1.Person;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<=5; i++){
            list.add(i);
        }
        Listy l = new Listy();
        //System.out.println(l.average(list));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(2);
        list2.add(0);
        list2.add(3);
        list2.add(0);

        //System.out.println(l.countZeros(list2));

        //System.out.println(l.odwrocNapis("Napis"));

        //System.out.println(l.sameChar("NapiN"));
        //System.out.println(l.sameChar("Napis"));

        //System.out.println(l.zmiana("Napis"));
        //System.out.println(l.zmiana("ZamiankO"));

        //Scanner scanner = new Scanner(System.in);
       // System.out.println("Wprowadź tekst do odwrócenia: ");
        //String napis = scanner.nextLine();
        //System.out.println(Listy.odwrocNapis(napis));

        //System.out.print(Listy.piramida(5,'*'));

        Person p1 = new Person();
        p1.imie = "Andrzej";
        p1.nazwisko = "Kowalski";
        p1.wiek = 24;
        p1.rok = 2;

    }
}