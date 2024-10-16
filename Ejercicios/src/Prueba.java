import java.util.Scanner;

/**
 *  Este código recoje por teclado un número entre el 0 y el 99 y lo devuelve en letra
 * @version 1.0
 * @author Jorge Durán Cruz
 */

public class Prueba {
    public static void main(String[]args){
        int decenas, unidades,yComprobador;
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije un número entre el 0 y el 99 ");
        int numero = sc.nextInt();
        sc.close();
        decenas = numero/10;
        if(numero !=0){
            if (numero>15){
                unidades = numero-decenas*10;
                yComprobador = unidades;
                switch (decenas){
                    case 3:
                        System.out.print("treinta ");
                        break;
                    case 4:
                        System.out.print("cuarenta ");
                        break;
                    case 5:
                        System.out.print("cincuenta ");
                        break;
                    case 6:
                        System.out.print("sesenta ");
                        break;
                    case 7:
                        System.out.print("setenta ");
                        break;
                    case 8:
                        System.out.print("ochenta ");
                        break;
                    case 9:
                        System.out.print("noventa ");
                        break;
                    case 2:
                        if(numero ==20){
                            System.out.print("veinte");
                        }
                        else {
                            System.out.print("veinti");
                            yComprobador = 0;
                        }
                        break;
                    case 1:
                        System.out.print("diez ");
                        break;
                    default:
                }
                numero = unidades;
                if (yComprobador !=0){
                    System.out.print("y ");
                }
            }

            switch (numero){
                case 1:
                    System.out.println("uno");
                    break;
                case 2:
                    System.out.println("dos");
                    break;
                case 3:
                    System.out.println("tres");
                    break;
                case 4:
                    System.out.println("cuatro");
                    break;
                case 5:
                    System.out.println("cinco");
                    break;
                case 6:
                    System.out.println("seis");
                    break;
                case 7:
                    System.out.println("siete");
                    break;
                case 8:
                    System.out.println("ocho");
                    break;
                case 9:
                    System.out.println("nueve");
                    break;
                case 10:
                    System.out.println("diez");
                    break;
                case 11:
                    System.out.println("once");
                    break;
                case 12:
                    System.out.println("doce");
                    break;
                case 13:
                    System.out.println("trece");
                    break;
                case 14:
                    System.out.println("catorce");
                    break;
                case 15:
                    System.out.println("quince");
                default:
            }
        }
        else {
            System.out.println("cero");
        }
    }
}