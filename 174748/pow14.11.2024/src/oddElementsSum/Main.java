package oddElementsSum;

public class Main {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,6};
        System.out.println(oddElementsSum(tab));
    }
    public static int oddElementsSum(int[] tablica){
        int wynik =0;
        for(int i=0; i< tablica.length;i++){
            if(tablica[i]%2 !=0){
                wynik += tablica[i];
            }
        }
        return wynik;
    }
}
