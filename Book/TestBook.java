package Book;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Akademia Pana Kleksa", "Jakiś Ziut", 500);
        Book b2 = new Book("O Psie Który Jeździł Koleją", "Jakiś Typ", 200);
        System.out.println(b1.isLarge());
        System.out.println(b2.isLarge());
    }
}
