/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EVA2_26_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[]platillos = new String[10];
        platillos[0]="tacos";
        platillos[1]="tortas de lomo";
        platillos[2]="tortas de ahogadas";
        platillos[3]="tamales";
        platillos[4]="tripitas";
        platillos[5]="pizza";
        platillos[6]="hamburgesa";
        platillos[7]="chilaquiles";
        platillos[8]="montados";
        platillos[9]="hotdog";
        double[]precio={20,50,60,25,80,90,55,30,100,400};
        
        System.out.println("-----MENU-----");
        for (int i = 0; i < platillos.length; i++) {
            System.out.println(i+"- "+platillos[i] + ": $" + precio[i]);
            int opc, cant;
        Scanner input = new Scanner(System.in);
            System.out.println("que quieres ordenar");
            opc = input.nextInt();
            System.out.println("cuantas quieres ordenar");
            cant = input.nextInt();
            System.out.println("el costo de tu pedido es: $"+ (cant*precio[opc]));
        }
    }
    
}
