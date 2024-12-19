package Dzielenie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dzielenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        String pierwszaLiczba = scanner.nextLine();
        System.out.println("Podaj drugą liczbę: ");
        String drugaLiczba = scanner.nextLine();

        numberCheck(pierwszaLiczba);
        numberCheck(drugaLiczba);

        double a = Double.parseDouble(pierwszaLiczba);
        double b = Double.parseDouble(drugaLiczba);

        System.out.println(dzielenie(a,b));
    }

    public static double dzielenie(double a, double b){
        if(b == 0) {
            throw new ArithmeticException("Cholero nie dziel przez zero");
        }

        return a/b;
    }

    public static void numberCheck(String string){
        for(int i=0; i<string.length();i++){
            if(string.charAt(i) > 48 && string.charAt(i) < 58);
            else{
                throw new InputMismatchException("Podaj liczbę");
            }
        }
    }
}
