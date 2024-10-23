import java.util.Scanner;

/**
 * Este código pide notas hasta que se le indique que ya no hay más y luego de te devuelve la media
 * @version 1.0
 * @author Jorge Durán cruz
 */
public class Notas_aborte_media {
    public static void main(String[]args){
        int sum =0, cantidad=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Meta la nota (-1 para terminar)");
        int nota = sc.nextInt();
        while (nota != -1){
            sum = sum +nota;
            cantidad++;
            System.out.println("Meta la nota (-1 para terminar)");
            nota = sc.nextInt();
        }
        sc.close();
        int media =sum/cantidad;
        System.out.println("La media es: "+media);

    }
}
