package application;

import java.util.Scanner;

public class ProblemWithoutPOO {
  public static void main() {
    Scanner sc = new Scanner(System.in);
    double xA, xB, xC, yA, yB, yC;

    System.out.println("Enter the measures of trinagule X: ");
    xA = sc.nextDouble();
    xB = sc.nextDouble();
    xC = sc.nextDouble();

    System.out.println("Enter the measures of trinagule Y: ");
    yA = sc.nextDouble();
    yB = sc.nextDouble();
    yC = sc.nextDouble();

    double p = (xA + xB + xC) / 2;
    double areaX = Math.sqrt(
        p * (p - xA) * (p - xB) * (p - xC));

    p = (yA + yB + yC) / 2;
    double areaY = Math.sqrt(
        p * (p - yA) * (p - yB) * (p - yC));

    System.out.printf("Tringle X area: %.4f%n", areaX);
    System.out.printf("Tringle Y area: %.4f%n", areaY);

    char maiorArea = areaX > areaY ? 'X' : 'Y';

    System.out.println("Maior area é: " + maiorArea);
  }
}
