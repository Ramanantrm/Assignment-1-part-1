/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.pkg1.part.pkg1.task.pkg1;

import java.util.Scanner;

/**
 *
 * @author ramananthirugnanasundaram
 */
public class Assignment1Part1Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myPersonalnfo = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String Name = myPersonalnfo.nextLine();

        System.out.print("Please enter your age:");
        int Age = myPersonalnfo.nextInt();

        myPersonalnfo.nextLine();

        System.out.print("Please enter your gender:");
        String Gender = myPersonalnfo.nextLine();

        System.out.print("Please enter your departement:");
        String Department = myPersonalnfo.nextLine();

        System.out.print("Please enter the value of PI(3.1415926):");
        float PI = myPersonalnfo.nextFloat();

        System.out.printf("\n%-20s :", "Name");
        System.out.printf("%s", Name);

        System.out.printf("\n%-20s :", "Age");
        System.out.printf("%d", Age);

        System.out.printf("\n%-20s :", "Gender");
        System.out.printf("%s", Gender);

        System.out.printf("\n%-20s :", "Department");
        System.out.printf("%s", Department);

        System.out.printf("\n%-20s :", "PI");
        System.out.printf("%.2f\n", PI);

    }

}
