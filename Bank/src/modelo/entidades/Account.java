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
    public int getNumber() {
        return number;
    }
    public String getDateOpen() {
        return dateOpen;
    }
    public double getBalance() {
        return balance;
    }
    public String getDateClose() {
        return dateClose;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", dateOpen='" + dateOpen + '\'' +
                ", balance=" + balance +
                ", dateClose='" + dateClose + '\'' +
                '}';
    }
}
