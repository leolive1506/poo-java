package application.entities.abstracao.exercicies.tax;

public class Company extends TaxPayer {
  private int numberOfEmployees;
  
  public Company() {
  }

  public Company(String name, Double anualIncome, int numberOfEmployees) {
    super(name, anualIncome);
    this.numberOfEmployees = numberOfEmployees;
  }

  @Override
  public Double tax() {
    this.setTaxesPercentage(numberOfEmployees > 10 ? 0.14 : 0.16);
    return this.getAnualIncome() * this.getTaxesPercentage();
  }

  public int getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees(int numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }
}
