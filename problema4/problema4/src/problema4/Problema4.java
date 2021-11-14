/*
En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente 
se hospeda más de 5 días, del 15% si se hospeda más de 10 días y del 20% si se 
hospeda más de 15 días. Elaborar un solución que pida como datos de entrada 
el número de días y el precio diario de la habitación y luego calcule e 
imprima el subtotal por pagar, el descuento y el total por pagar.
 */
package problema4;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int numero_dias;
        double precio_habitacion;
        double subtotal;
        double descuento1;
        double porcentaje1 = 10;
        double porcentaje2 = 15;
        double porcentaje3 = 20;
        double valortotal;

        System.out.println("Ingrese el número de días en la hostería");
        numero_dias = entrada.nextInt();

        System.out.println("Ingrese el precio de la habitación");
        precio_habitacion = entrada.nextDouble();

        subtotal = precio_habitacion * numero_dias;
        //Condiciones
        //+5 dias 10% 
        if (numero_dias < 0) {
            subtotal = 0;
            valortotal = 0;
        } else {
            if (numero_dias <= 5 && numero_dias >= 0) {
                valortotal = subtotal;
            } else {

                if (numero_dias > 5 && numero_dias <= 10) {
                    descuento1 = (porcentaje1 * subtotal) / 100;
                    valortotal = subtotal - descuento1;
                } else {
                    if (numero_dias > 10 && numero_dias <= 15) {
                        descuento1 = (porcentaje2 * subtotal) / 100;
                        valortotal = subtotal - descuento1;
                    } else {
                        descuento1 = (porcentaje3 * subtotal) / 100;
                        valortotal = subtotal - descuento1;
                    }

                }

            }

        }

        System.out.printf("El subtotal a pagar es: %.2f\n", subtotal);
        System.out.printf("El total a pagar es: %.2f\n", valortotal);

    }

}