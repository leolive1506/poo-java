package application.entities.abstracao.exercicies.tax;

public class Individual extends TaxPayer {
  private Double healthExpenditures;
  public static final Double BASE_SALARY = 2000.00;
  
  public Individual() {
  }
  public Individual(String name, Double anualIncome, Double healthExpenditures) {
    super(name, anualIncome);
    this.healthExpenditures = healthExpenditures;
  }

  @Override
  public Double tax() {
    double discount = 0;

    this.setTaxesPercentage(this.getAnualIncome() <= BASE_SALARY ? 0.15 : 0.25);

    if (healthExpenditures > 0) {
      discount = healthExpenditures * 0.5;
    }

    return (this.getAnualIncome() * this.getTaxesPercentage()) - discount;
  }

  public Double getHealthExpenditures() {
    return healthExpenditures;
  }
  public void setHealthExpenditures(Double healthExpenditures) {
    this.healthExpenditures = healthExpenditures;
  }

}
