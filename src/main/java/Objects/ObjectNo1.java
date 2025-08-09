package Objects;

public class ObjectNo1
{
    public static void main(String[] args) {

    BankAccount bankAccount1=new BankAccount("Tomas", 987654321, 180 );
//        System.out.println(bankAccount1.name);
//    System.out.println(bankAccount1.balance);
//        bankAccount1.deposit(50.5);
//        System.out.println(bankAccount1.balance);
//        bankAccount1.withdraw(210);
//        System.out.println(bankAccount1.balance);
//-------------------------------------------------
        BankAccount bankAccount2=new BankAccount("Peter", 521473268, 240.5 );
//        System.out.println(bankAccount2.name);
//        System.out.println(bankAccount2.balance);
        System.out.println(bankAccount1.getName());
        bankAccount1.setName("Tom");
        System.out.println(bankAccount1.getName());

    }
}
