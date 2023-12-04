package application.abstracao.exercicies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import application.entities.abstracao.exercicies.tax.Company;
import application.entities.abstracao.exercicies.tax.Individual;
import application.entities.abstracao.exercicies.tax.TaxPayer;

public class Tax {
  public static void main() {
    Scanner sc = new Scanner(System.in);
    List<TaxPayer> list = new ArrayList<>();

    System.out.print("Enter the number of tax payers: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Tax payer #" + i + " data:");
      System.out.print("Individual or company (i/c)? ");
      char typeTax = sc.next().charAt(0);

      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Anual income: ");
      double anualIncome = sc.nextDouble();

      if (typeTax == 'i') {
        System.out.print("Health expenditures: ");
        double healthExpenditures = sc.nextDouble();
        list.add(new Individual(name, anualIncome, healthExpenditures));
      } else {
        System.out.print("Number of employees: ");
        int numberOfEmployees = sc.nextInt();
        list.add(new Company(name, anualIncome, numberOfEmployees));
      }
    }

    System.out.println();
    System.out.println("TAXES PAID: ");
    double totalTaxes = 0;
    for (TaxPayer taxPayer: list) {
      totalTaxes += taxPayer.tax();
      System.out.println(taxPayer);
    }

    System.out.println();
    System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
  }
}
