/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_carreras;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EVA2_12_CARRERAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String carrera;
         Scanner input = new Scanner(System.in);
        System.out.println("introduce las iniciales de la carrera");
        carrera= input.nextLine();
        
        switch(carrera){
            case "ISC":
                System.out.println("Ingieneria en sistemas computacionales");
                break;
            case "INF":
                System.out.println("Ingieneria en informatica");
                break;
            case "IND":
                System.out.println("Ingieneria industrial");
                break;
            case "IDI":
                System.out.println("Ingieneria en diseño industrial");
                break;
            case "LA":
                System.out.println("Licenciatura en adminidtracion");
                break;
            case "IGE":
                System.out.println("Ingieneria en gestion empresarial");
                break;
            case "ARQ":
                System.out.println("Arquitectura");
                break;

            
        }
    }
    
}
