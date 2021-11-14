/*
 * Solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
 * Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios 
   consumidos en el mes.
 * Si el usuario tiene edad mayor a 65 años, se debe descontrar el 10%.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //Variables
        double costo_kilovatio;
        double kilovatios_consumidos;
        int edad;
        double descuento;
        double porcentaje;
        double valortotal;
        porcentaje = 10;
        
        //Funciones
        
        System.out.println("Ingrese el costo por kilovatio: ");
        costo_kilovatio = entrada.nextDouble();
        
        System.out.println("Ingrese el número de kilovatios consumidos: ");
        kilovatios_consumidos = entrada.nextDouble();
        
        System.out.println("Ingrese la edad del usuario: ");
        edad = entrada.nextInt();
        
        valortotal = costo_kilovatio*kilovatios_consumidos;
        if (edad > 65) {
            descuento = (porcentaje * valortotal)/100;
            valortotal = valortotal - descuento;
        } 
        
        System.out.printf("El valor a pagar es: %s\n" , 
                valortotal);
    }
    
}
