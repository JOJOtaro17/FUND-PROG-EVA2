/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EVA2_6_AND_OR_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input = new Scanner (System.in);
        System.out.println("introduce la califa");
        califa = input.nextInt();
        
        //VALLIDAR
        //UNA CALIFA ES MAYOR O IGUAL A 0---> califa >= 0
        //Y --- &&
        //LA CALIFA ES MENOR O IGUAL A 100 =< 100
        
        if((califa >= 0)&& (califa <=100)){ //valor 
            System.out.println("la calificacion "+ califa + "es valida!!");
            if(califa >= 70)
                System.out.println("aprobaste");
                else
                System.out.println("no acreditado");
        }else{
            System.out.println("la calificacion "+ califa + "no es valida");
        }
    }
    
}
