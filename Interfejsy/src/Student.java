import java.util.Comparator;

public class Student implements Comparable<Student>{
    String imie;
    double sredniaOcen;
    int rokUrodzenia;

    public Student(String imie, double sredniaOcen, int rokUrodzenia){
        this.imie = imie;
        this.sredniaOcen = sredniaOcen;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public String toString() {
        return "Student: " + imie + ", " + sredniaOcen + ", " + rokUrodzenia;
    }

    @Override
    public int compareTo(Student o) {
        if(Double.compare(this.sredniaOcen, o.sredniaOcen)==0){
           return Integer.compare(o.rokUrodzenia, this.rokUrodzenia);
        }
        return Double.compare(this.sredniaOcen, o.sredniaOcen);
    }
}

class YearofBirthStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.rokUrodzenia, o1.rokUrodzenia);
    }
}

class AvgGradesStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.sredniaOcen, o2.sredniaOcen);
    }
}