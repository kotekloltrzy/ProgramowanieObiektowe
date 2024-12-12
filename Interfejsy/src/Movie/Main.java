package Movie;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Piraci z karaibów",
                "Jakiś gość",
                "piraci"));
        movies.add(new Movie("Gwiezdne wojny",
                "Inny typ",
                "kosmos"));
        movies.add(new Movie("Indiana Jones",
                "Nie znam typa",
                "akcja"));
        movies.add(new Movie("Żywot Brajana",
                "Monthy Python",
                "komedia"));

        System.out.println(movies);
        Collections.sort(movies);
        System.out.println(movies);
    }
}
