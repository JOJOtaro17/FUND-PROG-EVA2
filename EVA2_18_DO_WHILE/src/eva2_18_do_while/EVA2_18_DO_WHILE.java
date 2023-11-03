/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_do_while;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EVA2_18_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume;
        Scanner input= new Scanner(System.in);
        
        do{
            System.out.println("intenta adivinar el numero");
            nume=input.nextInt();
        }while(nume != 100);
        System.out.println("ADIVINASTE");
    }
    
}
