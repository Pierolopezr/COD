package org.example;
import java.util.Scanner;
/**
 * Este código te pide el precio de un proucto y lo que has pagado por el, luego te devuelve el descuento que tenia el producto
 * @version 1.0
 * @author Jorge Durán Cruz
 */
public class Ej_1 {
    public static void main(String[]args){
        double desconto,precioP,precioO;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual era el precio original?");
        precioO = sc.nextDouble();
        System.out.println("Cuanto pagaste?");
        precioP = sc.nextDouble();
        sc.close();
        desconto = precioP/precioO*100;
        desconto = Math.round(desconto);
        System.out.println("El desuento fue de "+desconto+"%");
    }
}
