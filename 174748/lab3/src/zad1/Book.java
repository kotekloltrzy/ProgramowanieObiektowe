package zad1;

public class Book {
    public String title;
    public String author;
    public int publicationYear;

    public Book(){
        title = "Ronde Di Andora";
        author = "R. Kubica";
        publicationYear = 2011;
    }

    public Book(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
}
