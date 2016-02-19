/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime.ejercico;
import java.util.Scanner;//paquete

/**
 *
 * @author usuario
 */
public class PrimeEjercico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de variables
       
        double volumen,area,lado;
        Scanner lector = new Scanner(System.in);
        //Entrada de datos
        System.out.println("Digite el numero del lado");
        lado = lector.nextDouble();
        //proceso de datos
        volumen = Math.pow(lado,  3);
        area=Math.pow(lado,2);
    }
    
}
