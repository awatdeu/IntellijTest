package Objects;

public class BankAccount {

    public String name = "Awat";
    public final int accountNumber = 123456789;
    public double balance = 100;

    public void withdraw(double amount) {
        //  شرط جدید: اگر مبلغ برداشت بیشتر از موجودی باشه
        if (amount > balance) {
            System.out.println("The Account balance is not sufficient."); // این پیغام چاپ میشه
        } else {
            // در غیر اینصورت، برداشت انجام میشه
            balance = balance - amount; // balance -= amount
        }
    }

    public void deposit(double amount) {
        balance = balance + amount; // balance += amount
    }
}
