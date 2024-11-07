package BankAccount;

public record BankAccount(int numerKonta, int saldo) {
    public BankAccount(int numerKonta){
        this(numerKonta, 0);
    }
}
