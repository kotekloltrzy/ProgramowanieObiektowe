package minimumValue;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>(Arrays.asList(
                21.5, 345.768, 21.37, 12.34, 90.9, -9.99));
    System.out.println(minimumValue(lista));
    }


    public static double minimumValue(ArrayList<Double> lista){
        double min = lista.getFirst();
        for(int i=1;i<lista.size(); i++){
            if(lista.get(i)<min){
                min = lista.get(i);
            }
        }
        return min;
    }
}
