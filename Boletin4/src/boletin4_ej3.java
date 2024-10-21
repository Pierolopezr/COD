import java.util.Scanner;
/**
 * Este código te pide un numero y te devuelve su valor absoluto
 * @version 1.0
 * @author Jorge Durán Cruz
 */
public class boletin4_ej3 {
    public static void main(String[]args){
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que número quieres?");
        numero = sc.nextInt();
        sc.close();
        numero = (numero>0) ? (numero):(numero*(-1));
        System.out.println(numero);
    }
}
