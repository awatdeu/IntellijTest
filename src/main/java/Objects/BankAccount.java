package Objects;

public class BankAccount {

    private String name;
    private final int accountNumber;
    private double balance;


    //Constructor >>>>> Ein Method muss public sein und ohne void, wie public class genannt
    public BankAccount(String name, int accountNumber, double balance){

        this.name=name;
        this.accountNumber = accountNumber;
        this.balance=balance;
    }


    //2 Methods
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
    // getter
    public String getName(){
        return name;
    }

    // setter
    public void setName(String name){
        this.name=name;
    }
}
