package Zad1;



public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 30);
        Person person2 = new Person("Anna", "Nowak");

        person1.displayInfo(); // Wyświetli: Imię: Jan, Nazwisko: Kowalski, Wiek: 30
        person2.displayInfo(); // Wyświetli: Imię: Anna, Nazwisko: Nowak, Wiek: 0
    }
}
