package org.example;
import java.util.Scanner;
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
