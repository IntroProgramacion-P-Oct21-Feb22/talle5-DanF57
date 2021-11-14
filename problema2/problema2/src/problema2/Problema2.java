/*
Solución que imprima el costo de un pedido de un artículo del cual se tiene 
la descripción, la cantidad que se requiere y el precio unitario. 
Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        double cantidad;
        double preciouni;
        double valortotal;
        double descuento;
        double porcentaje = 10;
        String nombrearticulo;
        
        System.out.println("Ingrese Nombre del Artículo");
        nombrearticulo = entrada.nextLine();
        
        System.out.println("Ingrese la cantidad");
        cantidad = entrada.nextDouble();
        
        System.out.println("Ingrese el precio unitario");
        preciouni = entrada.nextDouble();
        
        valortotal = cantidad * preciouni;
        
        if (cantidad > 50) {
            descuento = (porcentaje * valortotal)/100;
            valortotal = valortotal - descuento;
        }
        
        System.out.printf("El costo total del artículo %s es: %.2f\n"
                , nombrearticulo , valortotal);
        
        
    }
    
}
