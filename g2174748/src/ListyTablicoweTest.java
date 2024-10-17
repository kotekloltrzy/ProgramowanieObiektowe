import java.util.ArrayList;

public class ListyTablicoweTest {

    public static int minimumValue(ArrayList<Integer> lista){
        int minimum = lista.getFirst();
        for (int i=1; i<lista.size(); i++){
            if(minimum > lista.get(i)){
                minimum = lista.get(i);
            }
        }
        return minimum;
    }

    public static double average(ArrayList<Double> lista){
        if(lista.isEmpty()){
            return 0;
        }
        double suma = 0;
        for(int i=0; i<lista.size(); i++){
            suma += lista.get(i);
        }
        return suma/lista.size();
    }

    public static int countZeros(ArrayList<Integer> lista){
        int wynik =0;
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i)==0){
                wynik++;
            }
        }
        return wynik;
    }
    public static String odwrocNapis(String napis){
        StringBuilder wynik = new StringBuilder(napis);
        return wynik.reverse().toString();
    }

    public static String tenSamZnak(String napis){
        char start = napis.charAt(0);
        char koniec = napis.charAt(napis.length()-1);
        if(start == koniec){
            return "Tak";
        }
        else{
            return "Nie";
        }
    }

    public static String zamiana(String napis){
        return napis.charAt(napis.length()-1) + napis.substring(1) + napis.charAt(0);
    }

    public static void choinka(String znak, Integer wysokosc) {
        StringBuilder warstwa = new StringBuilder(znak);
        for (int j = wysokosc-1; j >=0; j--) {
            String spacja = " ";
            warstwa.insert(0, spacja);}

            for (int i = 0; i < wysokosc; i++) {
                warstwa.deleteCharAt(0);
                System.out.println(warstwa);
                warstwa.append(znak);
                warstwa.append(znak);
            }
        }
    }

