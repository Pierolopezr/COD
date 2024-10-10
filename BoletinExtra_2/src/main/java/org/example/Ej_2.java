package org.example;
import java.util.Scanner;
public class Ej_2 {
    public static void main(String[] args) {
        double C,F,K;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es la temperatura en centígrados?");
        C = sc.nextDouble();
        F = C*9/5+32;
        K = C+273.15;
        System.out.println("La temperatura en Farenhait es "+F+"ºF y la temperatura en Kelvin es "+K+"ºK");
        sc.close();
    }
}
