/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_califas_eua;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EVA2_10_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
         Scanner input = new Scanner(System.in);
        System.out.println("introduce la calificacion");
        califa= input.nextInt();

        if((califa>=90)&& (califa<=100))
            System.out.println("tu calificacion es A");
        else if((califa>=80)&& (califa<=89))
            System.out.println("tu calificacion es B");
        else if((califa>=70)&& (califa<=79))
            System.out.println("tu calificacion es C");
        else if((califa>=60)&& (califa<=69))
            System.out.println("tu calificacion es D");
        else if((califa<60))
            System.out.println("tu calificacion es F");
    }
    
}
