package application.polimorfismo.exercicie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import application.entities.polimorfismo.Employee;
import application.entities.polimorfismo.OutsourcedEmployee;

public class EmployeesEx {
  public static void main() {
    List<Employee> employees = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String name;
    Integer hours;
    Double valuePerHour;
    Double additionalCharge;

    System.out.print("Enter the number of employees: ");
    int qtdEmployee = sc.nextInt();
    char isOutsourced;

    for (int index = 1; index <= qtdEmployee; index++) {
      System.out.printf("Employee #%d of employees%n", index);
      System.out.print("Outsourced (y/n)? ");
      isOutsourced = sc.next().charAt(0);

      System.out.print("Name: ");
      sc.nextLine();
      name = sc.nextLine();

      System.out.print("Hours: ");
      hours = sc.nextInt();

      System.out.print("Value per hour: ");
      valuePerHour = sc.nextDouble();

      if (isOutsourced == 'y') {
        System.out.print("Additional charge: ");
        additionalCharge = sc.nextDouble();
        employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
      } else {
        employees.add(new Employee(name, hours, valuePerHour));
      }
    }

    System.out.println();
    System.out.println("PAYMENTS:");
    for (Employee employee : employees) {
      System.out.println(employee);
    }

    sc.close();
  }
}
