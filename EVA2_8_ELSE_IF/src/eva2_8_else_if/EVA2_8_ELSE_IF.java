/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_else_if;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EVA2_8_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
         Scanner input = new Scanner(System.in);
        System.out.println("introduce el numero de mes");
        mes= input.nextInt();
        //if((mes >= 1)&&(mes <= 12)){//if((mes > 0)&& (mes < 13))
            if(mes == 1)
                System.out.println("enero");
            else if(mes == 2)
                System.out.println("febrero");
            else if(mes == 3)
                System.out.println("marzo");
            else if(mes == 4)
                System.out.println("abril");
            else if(mes == 5)
                System.out.println("mayo");
            else if(mes == 6)
                System.out.println("junio");
            else if(mes == 7)
                System.out.println("julio");
            else if(mes == 8)
                System.out.println("agosto");
            else if(mes == 9)
                System.out.println("septiembre");
            else if(mes == 10)
                System.out.println("octubre");
            else if(mes == 11)
                System.out.println("noviembre");
            else if(mes == 12)
                System.out.println("diciembre");
            else 
                System.out.println("el numero no es un mes valido");
            
        //}
    }
    
}
