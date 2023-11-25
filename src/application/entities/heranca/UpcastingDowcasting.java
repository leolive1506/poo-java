package application.entities.heranca;

public class UpcastingDowcasting {
  public static void main() {
    Account acc = new Account(1001, "Leo", 0.0);
    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

    // UPCASTING (subclass -> superclass)
    // consta businessAccount tbm é uma conta
    Account acc1 = bacc;
    Account acc2 = new BusinessAccount(1001, "Bob", 0.0, 200.0);
    Account acc3 = new SavingsAccount(1003, "Anna", 0.0, 0.01);

    // DOWCASTING
    BusinessAccount acc4 = (BusinessAccount) acc2;
    acc4.loan(100.0);

    // erro
    // BusinessAccount acc5 = (BusinessAccount) acc3;
    if (acc3 instanceof BusinessAccount) {
      BusinessAccount acc5 = (BusinessAccount) acc3;
      acc5.loan(200.0);
      System.out.println("Loan!");
    }

    if (acc3 instanceof SavingsAccount) {
      SavingsAccount acc5 = (SavingsAccount) acc3;
      acc5.updateBalance();
      System.out.println("Update");
    }
  }
}
