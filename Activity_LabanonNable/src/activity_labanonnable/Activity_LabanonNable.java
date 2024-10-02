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

    static double result;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("================================================================================HelloWorld================================================================================");
        Scanner sc = new Scanner(System.in);
        
        boolean Loop = true;
        while (Loop==true){
            System.out.print("How many Numbers do you want to input? ");
            int nums = sc.nextInt();
            double numbers[]=new double [nums];
            for(int i=0;i<numbers.length;i++){
                System.out.println("Enter the number ");
                double numInputs=sc.nextDouble();
                numbers[i]=numInputs;
            }
            System.out.print("Choose an operation:\n[1] Addition\n[2] Subtraction\n[3] Division\n[4] Multiplication\nEnter:");
            int operation = sc.nextInt();
            switch (operation){
                case 1:
                    result = numbers[0];
                    for(int j=1;j<numbers.length;j++){
                        result += numbers[j];
                    }
                    System.out.println("Total: "+result);
                    break;        
                case 2:
                    result = numbers[0];
                    for(int j=1;j<numbers.length;j++){
                        result -= numbers[j];
                    }
                    System.out.println("Total: "+result);
                    break;
                case 3:
                    result = numbers[0];
                    for(int j=1;j<numbers.length;j++){
                        result /= numbers[j];
                    }
                    System.out.println("Total: "+result);
                    break;
                case 4:
                    result = numbers[0];
                    for(int j=1;j<numbers.length;j++){
                        result *= numbers[j];
                    }
                    System.out.println("Total: "+result);
                    break;
            }
            System.out.println("\nDo you want to calculate another numbers?");
            sc.nextLine();
            System.out.println("Choose:\n[Y] Yes\n[N] no");
            String calculate = sc.nextLine();
            
            if (calculate.equalsIgnoreCase("n")){
                System.out.print("Closing Program");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(700);
                System.out.print(".");
                Thread.sleep(700);
                System.out.print(".\n");
                System.out.println("Have a nice day");
                Loop = false;
            }
            else if(calculate.equalsIgnoreCase("y")){
                System.out.print("\n");
            }else{
                System.out.print("INVALID OUTPUT\nClosing Program");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(700);
                System.out.print(".");
                Thread.sleep(700);
                System.out.print(".\n");
                System.out.println("Have a nice day");
                Loop = false;
                Loop = false;
            }
        }
    }
}
