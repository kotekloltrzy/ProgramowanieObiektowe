package Drukarnia;

public class StandardowyPrinter implements Printer{
    @Override
    public void drukuj(String tekst) {
        Printer.super.drukuj(tekst);
    }
}
