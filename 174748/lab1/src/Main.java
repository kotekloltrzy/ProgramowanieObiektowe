public class Main {
    public static void main(String[] args) {

        Student student = new Student(1,"Robert","Kubica");

        Student student2 = new Student(2,"Andrzej","Andrzejewski");

        System.out.println(student.nazwisko);
        student.przedstawSie();

//        for (int i = 1; i <= 5; i++){
//            System.out.println("i = " + i);
//        }
    }
}