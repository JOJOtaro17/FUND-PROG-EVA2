/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_arreglos;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EVA2_25_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        int[]arregloCali;
        Scanner input=new Scanner(System.in);
        System.out.println("cuantas califas vas a capturar");
        cant=input.nextInt();
        arregloCali=new int[cant];
        for(int i=0; i<cant;i++){
            System.out.println("introduce la calificacion");
            arregloCali[i]=input.nextInt();
        }
        for(int i=0; i<cant;i++){
            System.out.println(arregloCali[i]+" - ");
        }
    }
    
}
