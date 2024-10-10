package org.example;
import java.util.Scanner;
public class Ej_4 {
    public static void main(String []args){
        int B100,B20,B5,M1,dineroTotal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos dinero tienes?");
        dineroTotal = sc.nextInt();
        sc.close();
        B100=dineroTotal/100;
        dineroTotal = dineroTotal-B100*100;
        B20=(dineroTotal/20);
        dineroTotal = dineroTotal-B20*20;
        B5 = dineroTotal/5;
        dineroTotal=dineroTotal-B5*5;
        M1=dineroTotal;
        System.out.println("Tienes "+B100+" billetes de 100€,"+B20+" billetes de 20€,"+B5+" billetes de 5€ y "+M1+" monedas de 1€");
    }
}
