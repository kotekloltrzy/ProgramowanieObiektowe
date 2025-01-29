package Exception;

import java.util.Scanner;

public class Grupa {
    public static String NewExceptionTest() throws isLargeEnough{
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość osbób w grupie: ");
        int ilosc = sc.nextInt();
        if(ilosc < 10){
            throw new isLargeEnough("Za mało osób w grupie");
        }
        return "OK";
    }

    public static void main(String[] args) {
    try{
        System.out.println(NewExceptionTest());
    }catch(isLargeEnough e){
        System.out.println(e.getMessage());
    }
    }
}
