package Zad1;

public class Person {
    public String firstname;
    public String lastname;
    public int age;

    public Person(String firstname,String lastname,int age){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
    }
    public Person(String firstname,String lastname){
    this(firstname,lastname,0);
    }
    public void displayInfo() {
        System.out.println("Imię: " + firstname + ", Nazwisko: " + lastname + ", Wiek: " + age);
    }
}