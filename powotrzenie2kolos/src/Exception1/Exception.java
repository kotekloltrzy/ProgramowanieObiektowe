package Exception1;

public class Exception extends NiepoprawnyFormatDanychException{
    public static void sprawdz(String dane) throws IllegalArgumentException{
        sprawdzFormatDanych(dane);
    }
}
