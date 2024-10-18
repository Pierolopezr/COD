import java.util.Scanner;

/**
 * Este código te pide el nombre y las ventas anuales de un producto y te devulve el nivel de consumo de ese producto
 * @version 1.0
 * @author Jorge Durán Cruz
 */
public class boletin4_ej1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el nombre del producto");
        String nome = sc.next();
        System.out.println("Cuales son las ventas anuais");
        int ventas = sc.nextInt();
        sc.close();
        if (ventas<=100){
            System.out.println("El consumo de "+nome+ " es bajo");
        } else if (ventas<=500) {
            System.out.println("El consumo de "+nome+ " es medio");
        } else if (ventas<=1000) {
            System.out.println("El consumo de "+nome+ " es alto");
        }else {
            System.out.println("El consumo de "+nome+ " es de primera necesidad");
        }

    }
}
