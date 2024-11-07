package BookDTO;

public class Main {
    public static void main(String[] args) {
        BookDTO b1 = new BookDTO("Książka", "Artur Autorski", 49.99, 2024);
        System.out.println(b1.author() + " " + b1.title()+ " " + b1.price()+ " " + b1.yearOfPublication());
    }
}
