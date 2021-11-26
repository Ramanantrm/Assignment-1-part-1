/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.pkg1.part.pkg1.task.pkg2;

import java.util.Scanner;

/**
 *
 * @author ramananthirugnanasundaram
 */
public class Assignment1Part1Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myPriceCalculator = new Scanner(System.in);
        System.out.print("Please enter the item price:");
        double originalPrice = myPriceCalculator.nextDouble();

        System.out.print("Please enter the discount ratio(5 for 5%):");
        double discountRatio = myPriceCalculator.nextDouble();

        System.out.printf("%-17s :", "Original Price");
        System.out.printf("%.2f\n", originalPrice);

        System.out.printf("%-17s :", "Discount Ratio");
        System.out.printf("%.2f\n", discountRatio);

        double priceBeforeTax = 19.99 * (1 - 0.05);
        System.out.printf("%-17s :", "Price Before Tax");
        System.out.printf("%.2f\n", priceBeforeTax);

        System.out.printf("-------------------------");

        double federalTax = 0.05 * priceBeforeTax;
        System.out.printf("\n%-17s :", "Federal Tax");
        System.out.printf("%.2f", federalTax);

        double provincialTax = 0.09975 * priceBeforeTax;
        System.out.printf("\n%-17s :", "Provincial Tax");
        System.out.printf("%.2f\n", provincialTax);

        double finalPrice = 18.99 + (0.95 + 1.89);
        System.out.printf("%-17s :", "Final Price");
        System.out.printf("%.2f\n", finalPrice);

    }

}
