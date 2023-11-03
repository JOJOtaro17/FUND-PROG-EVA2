/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_validar_usuario;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EVA2_19_VALIDAR_USUARIO {
   final static String NOMBRE_USUARIO="admin";
   final static String PASSWORD="admin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario, password;
        Scanner input= new Scanner(System.in);
       
       do{
           System.out.println("introduce el usuario");
           usuario=input.nextLine();
           System.out.println("introduce la contraseña");
           password=input.nextLine();
       } while((!usuario.equals(NOMBRE_USUARIO)) || (!password.equals(PASSWORD)));
        System.out.println("acceso concendido");
    }
    
}
