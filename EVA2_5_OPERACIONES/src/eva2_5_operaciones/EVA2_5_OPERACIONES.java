/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_operaciones;

/**
 *
 * @author Joshua
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1, var2, resu;
        var1=100;
        var2=200;
        
        //OPERADOR +
        //SUMA
        //CONCATENAR--- UNIR CADENAS DE TEXTO
        resu=var1+var2;
        System.out.println("SUMA");
        System.out.println("var1="+var1);
        System.out.println("var2="+var2);
        System.out.println("var1 + var2="+resu);
        //RESTA
        resu=var1-var2;
        System.out.println("");
        System.out.println("RESTA");
        System.out.println("var1="+var1);
        System.out.println("var2="+var2);
        System.out.println("var1 - var2="+resu);
        //MULTIPLICACION
        //OPERADOR *
        resu=var1*var2;
        System.out.println("");//SALTO DE LINEA (ENTER)
        System.out.println("MULTIPLICACION");
        System.out.println("var1="+var1);
        System.out.println("var2="+var2);
        System.out.println("var1 *var2="+resu);
        //DIVISION
        //OPERADOR /
        // OJO: El tipo de dato es imortante, si quieren
        //el resultado de una division, hay que manearlo flotante
        //si lo manjan entero, les dara el # de veces que cabe el
        // divisor en el dividendo (de forma entera)
        var1= 15;
        var2= 7;
        resu= var1/var2;
        System.out.println("");//SALTO DE LINEA (ENTER)
        System.out.println("DIVISION");
        System.out.println("var1="+var1);
        System.out.println("var2="+var2);
        System.out.println("var1 / var2="+resu);
        
       //DIVISION FLOTANTE
       double resuExacto;
       resuExacto=var1/var2;
       System.out.println("");//SALTO DE LINEA (ENTER)
        System.out.println("DIVISION EXACTA");
        System.out.println("var1="+var1);
        System.out.println("var2="+var2);
        System.out.println("var1 / var2="+resuExacto);
        
        double var2F=7;
        resuExacto=var1/var2F;
         System.out.println("");//SALTO DE LINEA (ENTER)
        System.out.println("DIVISION EXACTA");
        System.out.println("var1="+var1);
        System.out.println("var2="+var2F);
        System.out.println("var1 / var2="+resuExacto);
        
        int cfra=7;
        double cifraDoble=7.0;
        
        double division= 100/10;//es diferente a://SE TOMA AL DIVISOR COMO ENTERO
        //double division= 100/10.0//SE TOMA EL DIVISOR COMO FLOTANTE
        
        //PRECEDENCIA DE OPERADORES:
        int a=5, b=3,c=2;
        int resultado = (a*b) + (a-c) * (b-a);//(15)+(3)*(-2)//15-6=9
        System.out.println("RESULTADO PRECEDENCIA" + resultado);
        
        //POTENCIAS Y RAICES:
        double potencia;
        potencia =Math.pow(100, 2);
        System.out.println("POTENCIA= "+ potencia);
    }
    
}
