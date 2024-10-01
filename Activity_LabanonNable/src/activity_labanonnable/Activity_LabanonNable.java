/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity_labanonnable;

import java.util.Scanner;


/**
 *
 * @author Lenovo
 */
public class Activity_LabanonNable {

    static double total, difference, quotient, product;
    static double num1, num2, num3;
    
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        
        Scanner sc = new Scanner(System.in);
        
        boolean loop = true;
        
        while (true){
        
        int operation;
        System.out.print("Enter number 1: ");
        num1 = sc.nextDouble();
        System.out.print("Enter number 2: ");
        num2 = sc.nextDouble();
        System.out.print("Enter number 3: ");
        num3 = sc.nextDouble();
        System.out.println("Choose an operation: 1. addition 2.subtraction 3.division 4.multiplication");
        operation = sc.nextInt();
        switch (operation){
            case 1:
                total = num1 + num2 + num3;
                System.out.println("Total: " + total);
                break;        
            case 2:
                difference = num1 - num2 - num3;
                System.out.println("Difference: " + difference);
                break;
            case 3:
                quotient = num1 / num2 / num3;
                System.out.println("Quotient: " + quotient);
                break;
            case 4:
                product = num1 * num2 * num3;
                System.out.println("{Product: " + product);
                break;
            }
            System.out.println("Do you want to calculate another numbers?");
            sc.nextLine();
            System.out.println("Type: y/n ");
            String calculate = sc. nextLine();
            
            if (calculate == "n"){
                loop=false;
            }
            else{
                loop = true;
            }
        }
    }
}
