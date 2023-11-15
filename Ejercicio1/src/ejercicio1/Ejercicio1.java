/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int nume, nume2;
        Scanner input = new Scanner(System.in);
        System.out.println("introduce un numero positivo");
        nume=input.nextInt();
        System.out.println("introduce un numero positivo");
        nume2=input.nextInt();
        for (int i =nume; i <=nume2;i++){
            System.out.print(i+" - ");
        }
    
    }
    
}
