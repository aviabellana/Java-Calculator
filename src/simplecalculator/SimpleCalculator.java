/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecalculator;

import java.util.Scanner;

/**
 *
 * @author avigracx
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        double answer = 0;
        char options;
        int choice;
        
        do{
            do{        
                System.out.println("\nPlease enter two numbers");
                System.out.print("Num1: ");
                int num1 = in.nextInt();

                System.out.print("Num2: ");
                int num2 = in.nextInt();

                System.out.println("\nSelect one operation");
                System.out.println("[1] Addition");
                System.out.println("[2] Subtraction");
                System.out.println("[3] Multiplication");
                System.out.println("[4] Division");
                System.out.print("Enter your choice: ");
                choice = in.nextInt();

                   if(choice == 1){
                        answer = num1 + num2;
                    }else if(choice == 2){
                        answer = num1 - num2;
                    }else if(choice == 3){
                        answer = num1 * num2;
                    }else if(choice == 4){
                        answer = num1 / num2;
                    }else{
                        System.out.print("Invalid Choice!\n");
                    }
                   
            }while(choice >= 5);
        
            System.out.println("\nThe final answer is " + answer); 
            
            System.out.print("\nDo you want to try again?(Y/N): ");
            options = in.next().charAt(0);
            
        }while(options == 'y' || options == 'Y');

    }
    
}
