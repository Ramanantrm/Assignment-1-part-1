/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.pkg1.part.pkg1.task.pkg3;

import java.util.Scanner;

/**
 *
 * @author ramananthirugnanasundaram
 */
public class Assignment1Part1Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int decimalNumber = 0;
        int p = 0;

        Scanner OctalNumber = new Scanner(System.in);
        System.out.print("Please enter a 4-digits Octal number:");

        int octalNumber = OctalNumber.nextInt();
        int octalNumberInitial = octalNumber;

        while (true) {
            if (octalNumber == 0) {
                break;
            } else {
                int temp = octalNumber % 10;
                decimalNumber += temp * Math.pow(8, p);
                octalNumber = octalNumber / 10;
                p++;
            }
        }

        System.out.printf("\n%-15s :", "Octal Number");
        System.out.printf("%d", octalNumberInitial);

        System.out.printf("\n%-15s :", "Decimal Number");
        System.out.printf("%d\n", decimalNumber);

    }

}
