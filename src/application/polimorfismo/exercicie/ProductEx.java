package application.polimorfismo.exercicie;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import application.entities.polimorfismo.ImportatedProduct;
import application.entities.polimorfismo.Product;
import application.entities.polimorfismo.UsedProduct;

public class ProductEx {
  public static void main() {
    List<Product> products = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String name;
    Double price;
    Double customsFee;
    Instant manufactureDate;

    System.out.print("Enter the number of products: ");
    int qtdEmployee = sc.nextInt();
    char typeProduct;

    for (int index = 1; index <= qtdEmployee; index++) {
      System.out.printf("Product #%d data%n", index);
      System.out.print("Common, used or imported (c/u/i)? ");
      typeProduct = sc.next().charAt(0);

      System.out.print("Name: ");
      sc.nextLine();
      name = sc.nextLine();

      System.out.print("Price: ");
      price = sc.nextDouble();

      switch (typeProduct) {
        case 'u':
          System.out.print("Manufacture date (DD/MM/YYYY): ");
          sc.nextLine();
          String date = sc.nextLine();
          String[] dateSplit = date.split("/");
          LocalDate localDate = LocalDate.parse(dateSplit[2] + "-" + dateSplit[1] + "-" + dateSplit[0]);
          manufactureDate = localDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
          products.add(
            new UsedProduct(name, price, manufactureDate)
          );
          break;
        case 'i':
          System.out.print("Customs fee: ");
          customsFee = sc.nextDouble();
          products.add(
            new ImportatedProduct(name, price, customsFee)
          );
          break;
        default:
          products.add(new Product(name, price));
          break;
      }
    }

    System.out.println();
    System.out.println("Price tags:");
    for (Product product : products) {
      System.out.println(product);
    }

    sc.close();
  }
}
