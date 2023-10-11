/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_annio_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EVA2_4_ANNIO_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year, residuo;
        Scanner input= new Scanner(System.in);
        year = input.nextInt();
        //VERIFICAR SI ES DIVISIBLE ENTRE 4
        System.out.println("introduce año");
        residuo= year % 4;
        if(residuo == 0){// divisible entre 4, no es garantia de año bisiesto
              residuo=year % 100;
              if(residuo > 0)// no es divisible entre 100, es bisiesto
                  System.out.println("es año bisiesto");
              else{
                  residuo= year%400;
                  if(residuo==0)
                      System.out.println("año bisiesto");
                  else
                      System.out.println("no es año bisiesto");
              }
            
        }else
            System.out.println("no es año bisiesto");
        
    }
    
}
