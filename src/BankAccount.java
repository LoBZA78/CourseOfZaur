public class BankAccount {
    int id;
    String name;
    double balance;
    void popolnenieScheta(double uvelichenie) {
        System.out.println("Balance do uvelicheniya: " + balance);
        System.out.println("Summa popolneniya: " + uvelichenie);
        balance += uvelichenie;
        System.out.println("Balance posle popolneniya: " + balance);
        System.out.println('\n');
    }
    void snyatieSoScheta(double umenshenie) {
        System.out.println("Balance do umensheniya: " + balance);
        System.out.println("Summa umenshenia: " + umenshenie);
        balance -= umenshenie;
        System.out.println("Balance posle umenshenia: " + balance);
    }
}
class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        MyAccount.id = 1;
        MyAccount.name = "Zaur";
        MyAccount.balance = 234.3;
        MyAccount.snyatieSoScheta(100);
        MyAccount.popolnenieScheta(300);
    }
}