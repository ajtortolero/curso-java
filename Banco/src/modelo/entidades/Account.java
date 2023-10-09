package modelo.entidades;

public class Account {
    int number;
    String dateOpen;
    double balance;
    String dateClose;
    public Account(int number, String dateOpen, double balance) {
        this.number = number;
        this.dateOpen = dateOpen;
        this.balance = balance;
    }
}
