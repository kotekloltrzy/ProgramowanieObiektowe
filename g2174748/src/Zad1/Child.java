package Zad1;

public class Child extends Parrent {

    // Konstruktor
    public Child(String protectedField) {
        super(protectedField);
    }

    public void displayProtectedField() {
        // Uzyskujemy dostęp do protectedField z klasy Parent
        System.out.println("Protected field from Parent: " + protectedField);
    }
}

