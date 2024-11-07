package Student;

import java.util.ArrayList;

public record Student(String firstName, String lastName, ArrayList<Double> grades) {
    public double averageGrades(){
        double sum = 0;
        for(double grade : grades){
            sum += grade;
        }
        return (double) sum/grades.size();
    }
}
