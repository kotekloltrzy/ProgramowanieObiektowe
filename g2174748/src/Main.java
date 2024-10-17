
import Zad1.Car;
import Zad1.Car2;
import Zad1.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//

//        Student student = new Student();
////        student.imie = "Stefan";
////        student.nazwisko = "Kowalski";
////        student.wiek = 24;
////        student.speclanosc
//        Scanner scaner = new Scanner(System.in);
//        System.out.println("wpsz tekst");
//        String wejscie = scaner.nextLine();
        Car myCar = new Car("Toyota", "Corolla");
        myCar.accelerete(50);
        System.out.println(myCar.speed);
        myCar.decelaryte(20);
        System.out.println(myCar.speed);


//        Child child = new Child("Hello, World!");
//        child.displayProtectedField(); // Wyświetli: Protected field from Parent: Hello, World!
        //----------------
        Car2 mycar = new Car2();
        mycar.trigger();

    }
}




