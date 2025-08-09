package Objects;

public class ObjectNo1
{
    public static void main(String[] args) {

    BankAccount b=new BankAccount();
        System.out.println(b.balance);
        b.deposit(50.5);
        System.out.println(b.balance);
        b.withdraw(200);
        System.out.println(b.balance);
    }
}
