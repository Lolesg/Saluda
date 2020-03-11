/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saluda;

import java.util.Scanner;

/**
 *
 * @author Loles GS
 */
public class Saluda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Introduzca su nombre");
        nombre = sc.nextLine();
        
        
        System.out.println("Introduzca la edad");
        int edad ;
        edad=sc.nextInt();
        System.out.println("Hola "+nombre+" tienes "+edad+" años");
    }
    
}
