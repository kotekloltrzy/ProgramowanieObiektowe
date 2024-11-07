public class Main {
    public static void main(String[] args)
    {
        Person p1 = new Person("Michał", 21);
        Person p2 = new Person("Adam", -10);
        Person p3 = new Person("Stefan");
        System.out.println(p1.imie() + " " + p1.wiek());
        System.out.println(p2.imie() + " " + p2.wiek());
        System.out.println(p3.imie() + " " + p3.wiek());
        System.out.println(p1);
        System.out.println(p3.equals(p1));
        p1.przedstawSie();

    }
}