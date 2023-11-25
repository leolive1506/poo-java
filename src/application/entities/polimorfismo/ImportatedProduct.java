package application.entities.polimorfismo;

public class ImportatedProduct extends Product {
  private Double customsFee;

  public ImportatedProduct() {
    super();
  }

  public ImportatedProduct(String name, Double price, Double customsFee) {
    super(name, price + customsFee);
    this.customsFee = customsFee;
  }

  public Double getCustomsFee() {
    return customsFee;
  }

  public void setCustomsFee(Double customsFee) {
    this.customsFee = customsFee;
  }

  @Override
  public final String priceTag() {
    return " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
  }
}
