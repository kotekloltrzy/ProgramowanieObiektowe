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
}
