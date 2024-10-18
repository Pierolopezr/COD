package org.example;
import java.util.Scanner;
/**
 * Este código te pide el numero de billestes de cada tipo y cuantas monedas de 1 € que tengas y te devuelve cuanto dinero tienes en total
 * @version 1.0
 * @author Jorge Durán Cruz
 */
public class Ej_3 {
    public static void main(String[] args) {
        int B100,B20,B5,M1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos billetes de 100€ hay?");
        B100 = sc.nextInt();
        System.out.println("Cuantos billetes de 20€ hay?");
        B20 = sc.nextInt();
        System.out.println("Cuantos billetes de 5€ hay?");
        B5 = sc.nextInt();
        System.out.println("Cuantas monedas de 1€ hay?");
        M1 = sc.nextInt();
        sc.close();
        System.out.println("Tienes "+(B100*100+B5*5+B20*20+M1)+"€");
    }
}
