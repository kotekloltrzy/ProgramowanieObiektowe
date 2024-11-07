package BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(123456, 200000);
        BankAccount b2 = new BankAccount(234567);
        System.out.println(b1.numerKonta() + ", stan konta: " + b1.saldo());
        System.out.println(b2.numerKonta() + ", stan konta: " + b2.saldo());
    }
}
