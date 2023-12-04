package application.abstracao;

import java.util.ArrayList;
import java.util.List;

import application.entities.abstracao.Account;
import application.entities.abstracao.BusinessAccount;
import application.entities.abstracao.SavingsAccount;

public class ClassAbstrata {
  public static void main() {
    // erro pois é abstrato, permite somente as subclasses
    // Account acc1 = new Account();
    List<Account> list = new ArrayList<>();
    list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
    list.add(new SavingsAccount(1002, "Bob", 300.0, 0.01));
    list.add(new BusinessAccount(1003 , "Maria", 1000.0, 400.0));
    list.add(new BusinessAccount(1004 , "Anna", 500.0, 500.0));

    double sum = 0.0;
    for (Account acc: list) {
      sum += acc.getBalance();
    }

    System.out.printf("Total Balance: %.2f%n", sum);

    for (Account acc: list) {
      acc.deposit(10.0);
    }

    for (Account acc: list) {
      System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
    }
  }
}
