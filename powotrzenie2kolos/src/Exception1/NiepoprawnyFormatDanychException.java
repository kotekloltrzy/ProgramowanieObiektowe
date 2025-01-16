package Exception1;

public class NiepoprawnyFormatDanychException {
    public static void sprawdzFormatDanych(String dane){
        if(dane.contains("@")){
            System.out.println("Podano prawidłowy e-mail");
        }
        else{
            throw new IllegalArgumentException("Podany ciąg znaków nie jest emailem");
        }
    }
}
