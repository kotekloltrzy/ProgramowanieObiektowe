package zad1;

public class Main {
    public static void main(String[] args) {
        Book k1 = new Book();
        System.out.println(k1.author);

        Book k2 = new Book("Title", "Author", 2000);
        System.out.println(k2.title);
    }
}
