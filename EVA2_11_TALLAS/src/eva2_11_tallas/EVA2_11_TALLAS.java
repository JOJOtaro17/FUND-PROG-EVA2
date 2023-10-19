/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_tallas;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EVA2_11_TALLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int talla;
         Scanner input = new Scanner(System.in);
        System.out.println("introduce el numero de talla");
        talla= input.nextInt();

        if(talla==29)
            System.out.println("tu talla es small");
        else if(talla==42)
            System.out.println("tu talla medium");
        else if(talla==44)
            System.out.println("tu talla es large");
        else if(talla==48)
            System.out.println("tu talla es xlarge");
        else 
            System.out.println("talla desconocida");
    }
    
}
