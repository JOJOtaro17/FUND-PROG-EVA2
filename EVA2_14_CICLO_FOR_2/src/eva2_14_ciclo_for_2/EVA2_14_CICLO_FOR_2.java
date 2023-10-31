/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_ciclo_for_2;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EVA2_14_CICLO_FOR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int noCalifas;
         int sumaCalifa=0;//neutro aditivo
         //1 es el neutro multiplicativo
        Scanner input=new Scanner(System.in);
        System.out.println("introduce el numero de la califa: ");
        noCalifas=input.nextInt();
        for(int i=1; i<=noCalifas;i++){
            System.out.println("introduce la califa");
            int califa=input.nextInt();
            //sumatoria de calificaciones:
            //ACUMULADORES (son operadores que permiten almacenar un valor)
            //sumaCalifa=sumaCalifa+califa;
            sumaCalifa+=califa;
            
            //el promedio es sumaCalifa/noCalifa, pero ambos son enteros
            //y dividir enteros en Java da como resultado un entero, sin decimal
        double promedio = sumaCalifa/(noCalifas*1.0);
             System.out.println("el promedio es" + promedio);
                    
        }
        
    }
    
}
