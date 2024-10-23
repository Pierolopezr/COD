import java.util.Scanner;
/**
 *  Este código te pide un número n y te devueve los primos infeirores a ese número
 * @version 1.0
 * @author Jorge Durán Cruz
 */
public class Primos {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿que número eliges?");
        int n = sc.nextInt();
        sc.close();
        int divisores =0;
        for (int i =1;i<n;i++){
            for (int j=2;j<i; j++){
                if (i%j==0){
                    divisores++;
                }
            }
            if (divisores == 0){
                System.out.print(i+",");
            }
            else {divisores =0;}
        }
    }
}
