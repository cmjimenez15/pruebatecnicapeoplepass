/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import java.util.Scanner;
/**
 *
 * @author Rentadvisor
 */
public class Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cadena = "";
        Scanner leer = new Scanner(System.in);
        System.out.println("introduzca cadena");
        cadena = leer.nextLine();
        String cadult = cadena.substring((cadena.length()-2),cadena.length());
        System.out.println("los dos ultimos caracteres son "+cadult);
        String cadpri = cadena.substring(0,2);
        System.out.println("los dos primeros caracteres son "+cadpri);
        String cadmay = cadena.toUpperCase();
        System.out.println("la cadena en mayuscula es "+cadmay);
        String cadmin = cadena.toLowerCase();
        System.out.println("la cadena en minuscula es "+cadmin);
        char ultCarac = cadena.charAt(cadena.length()-1);
        int contUltCarac = 0;
        for(int i=0; i<cadena.length(); i++) {
            if(cadena.charAt(i) == ultCarac) {
                contUltCarac++;
            }
        }
        System.out.println("la ocurrencia del ultimo caracter es "+contUltCarac);
        
        System.out.println("la cadena con 3 asteriscos por delante y por detrás: ***" + cadena + "***");
        
        String cadenaInv = "";
        for(int i=cadena.length()-1; i>=0; i--) {
            cadenaInv += cadena.charAt(i);
        }
        System.out.println("la cadena invertida: " + cadenaInv);
        // TODO code application logic here
    }
    
}
