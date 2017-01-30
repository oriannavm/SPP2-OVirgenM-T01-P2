/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.ovirgenm.t01.pkg2;
import java.util.Scanner;

/**
 *
 * @author Orianna
 */
public class SPP2OVirgenMT012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración de variables
        Scanner keyboard = new Scanner (System.in);
        double superficie;
        double perimetro;
        double base;
        double altura;
        

        //Ejecución del programa
        System.out.println("Introduce medida de base: ");
        base = keyboard.nextDouble();
        System.out.println("Introduce medida de altura: ");
        altura = keyboard.nextDouble();
        
        perimetro = (base+altura+base+altura);
        superficie = (base*altura);
        
        
       //Resultado final
        System.out.println("El perímetro del rectángulo es: "+perimetro);
        System.out.println("La superficie del rectángulo es: "+superficie);
    }
    
}
