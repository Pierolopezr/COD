import java.util.Scanner;

/**
 *  Este código recoje por teclado la nota que sacaste y te devuelve si estas suspenso, si sacaste un suficiente, un bien , un notable o un sobresaliente
 *  Igual que Notas pero usando el switch de una manera distinta
 * @version 2.0
 * @author Jorge Durán Cruz
 */
public class NuevoSwitch {
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es tu nota?");
        nota = sc.nextInt();

        sc.close();
        switch (nota) {
            case 1, 2, 3, 4 -> System.out.println("Tienes un suspenso");
            case 5 -> {
                System.out.println("Tienes un suficiente");
                System.out.println("Necesitas mejorar");
            }
            case 6 -> System.out.println("Tienes un bien");
            case 7, 8 -> System.out.println("Tienes un notable");
            case 9, 10 -> System.out.println("Tienes un sobresaliente");
            default -> System.out.println("La nota no es válida");
        }
    }
}