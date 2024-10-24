package zad003;

import java.util.Objects;

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public String stringCheck(String string){
        if(string == null){
            return "";
        }
        return string;
    }

    Person(String firstName, String lastName, int age){
        this.firstName = stringCheck(firstName);
        this.lastName = stringCheck(lastName);
        this.age = Math.max(age, 0);
    }

    @Override
    public String toString() {
        return "Person:" + firstName + " " + lastName + ",\n Age: " +  + age + ".\'";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}