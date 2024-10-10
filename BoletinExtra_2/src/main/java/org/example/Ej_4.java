package org.example;
import java.util.Scanner;
public class Ej_4 {
    public static void main(String []args){
        int B100,B20,B5,M1;
        double dineroTotal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos dinero tienes?");
        dineroTotal = sc.nextDouble();
        sc.close();
        System.out.println(dineroTotal);
        B100=(int)(dineroTotal/100);
        dineroTotal = dineroTotal-B100*100;
        B20=(int)(dineroTotal/20);
        dineroTotal = dineroTotal-B20*20;
        B5 = (int)(dineroTotal/5);
        dineroTotal=dineroTotal-B5*5;
        M1=(int)dineroTotal;
        dineroTotal = (dineroTotal-M1);
        System.out.print("Tienes "+B100+" billetes de 100€,"+B20+" billetes de 20€,"+B5+" billetes de 5€, "+M1+" monedas de 1€ y ");
        System.out.printf("%.2f centimos",dineroTotal);
    }
}