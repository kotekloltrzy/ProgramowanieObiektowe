package Movie;

public class Movie implements Comparable<Movie>{
    String title;
    String director;
    String genre;

    Movie(String title, String director, String genre){
        this.title = title;
        this.director = director;
        this.genre = genre;


    }

    @Override
    public String toString() {
        return "Film: " + title + ", " + director + ", " + genre + ".";
    }

    @Override
    public int compareTo(Movie o) {
        return Double.compare(this.title.length(), o.title.length());
    }
}


