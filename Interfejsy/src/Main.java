import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args){

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Adam",
                4.0,
                1998));
        students.add(new Student("Arek",
                3.0,
                1999));
        students.add(new Student("Andrzej",
                4.0,
                1999));
        System.out.println(students);
        Collections.sort(students, new AvgGradesStudentComparator());
        System.out.println(students);
        students.sort(new YearofBirthStudentComparator());
        System.out.println(students);

        //Student s1 = new Student("A", 3.5, 2004);
        //Student s2 = null;
        //try{
        //    s2 = (Student) s1.clone();
        //}catch (CloneNotSupportedException e){
        //    System.out.println("Nie udało się sklonować");
        //}
    }
}