import java.util.ArrayList;

public class Listy {
    public static double average(ArrayList<Integer> lista){
        if(lista.isEmpty()){
            return 0;
        }
        double sum = 0;
        for(int i=0;i<lista.size();i++){
            sum += lista.get(i);
        }
        double avg = sum/lista.size();
        return avg;
    }
    public static int countZeros(ArrayList<Integer> lista){
        int zeros = 0;
        for(int i=0;i<lista.size();i++){
            if(lista.get(i)==0){
                zeros += 1;
            }
        }
        return zeros;
    }

    public static String odwrocNapis(String napis){
        StringBuilder odwrocony = new StringBuilder(napis);
        return odwrocony.reverse().toString();
    }

    public static boolean sameChar(String napis){
        return napis.toLowerCase().charAt(0) == napis.toLowerCase().charAt(napis.length() - 1);
    }

    public static String zmiana(String napis){
        StringBuilder zamien = new StringBuilder();
        char first = napis.charAt(0);
        char ls = napis.charAt(napis.length()-1);
        zamien.append(ls);
        for(int i = 1; i<napis.length()-1;i++){
            zamien.append(napis.charAt(i));
        }
        zamien.append(first);
        return zamien.toString();
    }

    public static String piramida(int n, char a){
        StringBuilder cho = new StringBuilder();
        String pi = ""+a;
        String sp = " ";
        for(int i = 0; i<n; i++){
            cho.append(sp.repeat(n-i-1));
            cho.append(a+pi.repeat(i*2)+'\n');
        }
        return cho.toString();
    }

}
