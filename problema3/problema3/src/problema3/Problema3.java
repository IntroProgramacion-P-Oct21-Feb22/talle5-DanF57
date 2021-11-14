/*
Elaborar una solución que permita leer los datos de un automóvil (marca, origen y costo) 
imprima el impuesto por pagar y el precio de venta (incluido el impuesto). 
Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, 
si es de Italia, 15%, y si es de USA, 8%
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String marca;
        int origen;
        double costo;
        double impuestoA = 20;
        double impuestoJ = 30;
        double impuestoI = 15;
        double impuestoU = 8;
        double precioventa = 0;
        double porcentaje = 0;

        System.out.println("Ingrese la marca del auto");
        marca = entrada.nextLine();

       System.out.println("Ingrese el número según el país de origen del auto");
       System.out.println("1)Alemania 2)Japón 3)Italia 4)USA ");
       origen = entrada.nextInt();

        System.out.println("Ingrese el costo del auto");
        costo = entrada.nextDouble();

        if (origen < 1 || origen > 4) {
            System.out.println("ERROR: Por favor elija un país predeterminado");
        } else {

            if (origen == 1) {
                porcentaje = (costo * impuestoA) / 100;
                precioventa = (costo + porcentaje);
            } else {

                if (origen == 2) {
                    porcentaje = (costo * impuestoJ) / 100;
                    precioventa = (costo + porcentaje);
                } else {
                    if (origen == 3) {
                        porcentaje = (costo * impuestoI) / 100;
                        precioventa = (costo + porcentaje);
                    } else {
                         if (origen == 4) {
                            porcentaje = (costo * impuestoU) / 100;
                            precioventa = (costo + porcentaje);
                        }
                    }
                }
            }
        }
       System.out.printf("Datos del auto:\n\tMarca: %s\n\tImpuesto: %.2f\n\t"
               + "Precio de Venta: %.2f\n", 
                marca, porcentaje, precioventa);
     
    }

}
