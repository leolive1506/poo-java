package application.entities.polimorfismo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
  private Instant manufactureDate;

  public UsedProduct() {
    super();
  }

  public UsedProduct(String name, Double price, Instant manufactureDate) {
    super(name, price);
    this.manufactureDate = manufactureDate;
  }

  public Instant getManufactureDate() {
    return manufactureDate;
  }

  public void setManufactureDate(Instant manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  @Override
  public final String priceTag() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime localDateTime = LocalDateTime.ofInstant(manufactureDate, ZoneId.systemDefault());

    return " (Manufacture date: " + formatter.format(localDateTime) + ")";
  }
}
