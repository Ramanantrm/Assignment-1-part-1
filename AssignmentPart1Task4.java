/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.part.pkg1.task.pkg4;

import java.util.Scanner;

/**
 *
 * @author ramananthirugnanasundaram
 */
public class AssignmentPart1Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myBalanceCalculator = new Scanner(System.in);
        System.out.print("Please enter the initial balance: $");
        double initialBalance = myBalanceCalculator.nextDouble();

        System.out.print("Please enter the annual interest rate(2 for 2%): ");
        double annualInterestRate = myBalanceCalculator.nextDouble();

        System.out.print("Please enter the number of years the client wants to save money in the bank: ");
        int savingYears = myBalanceCalculator.nextInt();

        System.out.printf("\n%-21s : ", "Initial Balance");
        System.out.printf("%.2f\n", initialBalance);

        System.out.printf("%-21s : ", "Annual Interest Rate");
        System.out.printf("%.2f%%\n", annualInterestRate);

        System.out.printf("%-21s : ", "Saving Years");
        System.out.printf("%d\n", savingYears);

        System.out.printf("------------------------------\n");

        Double balanceAfter5Years = initialBalance * Math.pow(1 + annualInterestRate / 100, savingYears);
        System.out.printf("%-17s : ", "Balance After 5 Years");
        System.out.printf("%.2f\n", balanceAfter5Years);

    }

}
