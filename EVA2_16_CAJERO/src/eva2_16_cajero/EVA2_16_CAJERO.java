/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_cajero;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EVA2_16_CAJERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cuenta = 1000;
        int retiro = 0;
        Scanner input=new Scanner(System.in);
        
        while(cuenta>0){
            System.out.println("¿cuanto quieres retirar");
            retiro=input.nextInt();
            cuenta -= retiro;
            System.out.println("tu saldo es: "+ cuenta);
        }
    }
    
}
