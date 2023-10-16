package application;

import java.util.Scanner;

import application.entities.Product;

public class App {
  public final double PI = 3.14;
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter product data:");
    System.out.print("Nome: ");
    String name = sc.nextLine();

    System.out.print("Price: ");
    double price = sc.nextDouble();

    System.out.print("Quantity in stock: ");
    int quantity = sc.nextInt();

    Product product = new Product(name, price, quantity);
    // funciona por conta da sobrecarga
    // Product product = new Product(name, price);
    System.out.println("Product data: " + product);

    System.out.println();
    System.out.print("Enter the number of products to be added in stock: ");
    int inputQuantity = sc.nextInt();
    product.addProducts(inputQuantity);

    System.out.println("Update data: " + product);

    System.out.print("Enter the number of products to be removed in stock: ");
    inputQuantity = sc.nextInt();
    product.removeProducts(inputQuantity);

    System.out.println("Update data: " + product);
    sc.close();
  }
}
