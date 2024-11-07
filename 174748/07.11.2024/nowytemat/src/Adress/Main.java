package Adress;

public class Main {
    public static void main(String[] args) {
        Address a1 = new Address("Fiołkowa", 13, "86-300", "Grudziądz");
        Person p1 = new Person("Michał", "Broda", a1);
        System.out.println(p1.firstName() + " " + p1.lastName() + " " + p1.address().city() + " "
                + p1.address().street() + " " + p1.address().houseNumber() + " " + p1.address().postalCode());
    }
}
