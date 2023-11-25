package application.entities.heranca;

public class COverride {
  public static void main() {
    Account acc1 = new Account(1001, "Alex", 1000.0);    
    acc1.withdraw(200.0);
    System.out.println(acc1.getBalance());

    // testando se sobrescreveu
    Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.1);
    acc2.withdraw(200.0);
    System.out.println(acc2.getBalance());

    Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
    acc3.withdraw(200);
    System.out.println(acc3.getBalance());
  }
}
