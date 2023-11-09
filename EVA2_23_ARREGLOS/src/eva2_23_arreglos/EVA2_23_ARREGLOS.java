/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_arreglos;

/**
 *
 * @author Joshua
 */
public class EVA2_23_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR EL ARREGLO=CREACIÒN DEL ARREGLO
        int[] arreglo = new int[10];
        //COMO SE USA EL ARREGLO,EL ACCESO ES POR INDICES
        //EL PRIMER ELEMENTO DEL ARRGLO ESTA EN LA POSICION 0(CERO)
        // ULTIMO ARREGLO ES N - 1, N ES EL TAMAÑO DEL ARREGLO
        arreglo[0]=100;
        arreglo[1]=200;
        arreglo[2]=300;
        arreglo[3]=400;
        arreglo[4]=500;
        System.out.println(arreglo[0]);
        ///
        String[]arregloCode=new String[5];
        arregloCode[0]="hola";
        arregloCode[1]=" ";
        arregloCode[2]="mundo";
        arregloCode[3]="";
        arregloCode[4]="cruel";
        System.out.println(arregloCode[0]);
        System.out.println(arregloCode[1]);
        System.out.println(arregloCode[2]);
        System.out.println(arregloCode[3]);
        System.out.println(arregloCode[4]);
        
    }
    
}
