package zad2;

import java.util.Objects;

public class Person {
    public String firstName;
    public String lastName;
    public double ocena;
    public static String nazwaUczelni = "UWM";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public Person(String firstName, String lastName, String nazwaUczelni) {
        firstName = firstName;
        lastName = lastName;
        nazwaUczelni = nazwaUczelni;
    }

    public Person(String firstName, String lastName){
        firstName = firstName;
        lastName = lastName;
    }

    public String toString(){
        return "Nazywam się " + firstName + " " + lastName + ", studiuję na"  + nazwaUczelni + "\n";
    }
}

