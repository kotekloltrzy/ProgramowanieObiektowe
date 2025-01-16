package VideoGame;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        VideoGame game1 = new VideoGame("Minecraft", "sandbox", LocalDate.parse("2007-12-07"));

        VideoGame game2;

        try{
            game2 = (VideoGame)game1.clone();
        } catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }

        game1.setReleaseDate(LocalDate.parse("2024-12-12"));

        System.out.println(game1.getReleaseDate());
        System.out.println(game2.getReleaseDate());
    }
}
