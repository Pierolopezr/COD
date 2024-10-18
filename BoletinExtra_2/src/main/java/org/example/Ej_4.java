package org.example;
import java.util.Scanner;
/**
 * Este código te pide cuanto dinero tienes con centimos y te devuelve todos los tipos de billestes y monedas mínimos que necesitas para tener ese dinero
 * @version 2.1
 * @author Jorge Durán Cruz
 */
public class Ej_4 {
    public static void main(String []args){
        int B100,B20,B5,M1;
        int M05,M02,M01,M005,M002,M001;
        double dineroTotal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos dinero tienes?");
        dineroTotal = sc.nextDouble();
        sc.close();
        System.out.println(dineroTotal);
        B100=(int)(dineroTotal/100); // Calculo para saber cuantos billetes de 100 serian posibles
        dineroTotal = dineroTotal-B100*100; // Calculo para saber cuanto dinero queda y que es menor de billetes de 100
        B20=(int)(dineroTotal/20); // Calculo para saber cuantos billetes de 20 serian posibles
        dineroTotal = dineroTotal-B20*20; // Calculo para saber cuanto dinero queda y que es menor de billetes de 20
        B5 = (int)(dineroTotal/5); // Calculo para saber cuantos billetes de 5 serian posibles
        dineroTotal=dineroTotal-B5*5; // Calculo para saber cuanto dinero queda y que es menor de billetes de 5
        M1=(int)dineroTotal;
        dineroTotal = (dineroTotal-M1)*100+0.0001; // Peuqueña correccion para que en numeros cercanos al 10 los detecte bien y no como un 9.9999...
        System.out.println(dineroTotal); // a partir de aqui es lo mismo pero con las monedas de centimos
        M05 = (int)dineroTotal/50;
        dineroTotal= dineroTotal-M05*50;
        M02 = (int)dineroTotal/20;
        dineroTotal = dineroTotal-M02*20;
        M01 = (int)dineroTotal/10;
        dineroTotal = dineroTotal-M01*10;
        M005 = (int)dineroTotal/5;
        dineroTotal = dineroTotal-M005*5;
        M002 = (int)dineroTotal/2;
        dineroTotal = dineroTotal-M002*2;
        M001 = (int)dineroTotal;
        System.out.println("Tienes "+B100+" billetes de 100€,"+B20+" billetes de 20€,"+B5+" billetes de 5€, "+M1+" monedas de 1€");
        System.out.println("Tambien tienes "+M05+" monedas de 50 centimos,"+M02+" monedas de 20 centimos,"+M01+" monedas de 10 centimos,");
        System.out.println(M005+" monedas de 5 centimos,"+M002+" monedas de 2 centimos y "+M001+" monedas de 1 centimo");
    }
}