package Drukarnia;

public interface Printer {
    default void drukuj(String tekst){
        System.out.println(tekst);
    }
}
