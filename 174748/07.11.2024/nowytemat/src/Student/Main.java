package Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> oceny = new ArrayList<Double>();
        oceny.add(3.00);
        oceny.add(4.00);
        oceny.add(5.00);
        oceny.add(4.00);
        oceny.add(5.00);
        oceny.add(4.00);
        Student s1 = new Student("Michał", "Broda", oceny);
        System.out.println(s1.firstName()+ " " + s1.lastName() + " "+ s1.averageGrades());
    }
}
