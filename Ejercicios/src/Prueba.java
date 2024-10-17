import java.util.Scanner;

/**
 *  Este código recoje por teclado un número entre el 0 y el 99 y lo devuelve en letra
 * @version 1.0
 * @author Jorge Durán Cruz
 */

public class Prueba {
    public static void main(String[]args){

        // declaro las variables que me ayudan a que el código vaya por donde tiene que ir
        int decenas, unidades,yComprobador;
        // inicializo un scanner para recoger el número que hay que escribir
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije un número entre el 0 y el 99 ");
        // declaro la variable que recoge el número seleccionado por el usuario
        int numero = sc.nextInt();
        sc.close();
        //divido el numero selleccionado entre 10 para saber cuantas decenas tiene el número seleccionado
        decenas = numero/10;
        //compruebo si el numero es 0, si lo es escribe directamente cero si no entonces sigue con normalidad
        if(numero !=0){
            // compruebo si el numero es menor que 15 ya que son posibilidades que se eliminan dentro del if
            if (numero>15){
                //le resto al numero las decenas que tiene para saber las unidades
                unidades = numero-decenas*10;
                //aqui igualo "yComrobador" con "unidades" para saber si el número tiene una y para separar su nombre
                yComprobador = unidades;
                //este switch escribe el nombre de las decenas gracias a la variable "decenas"
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
                        // esto identifica si el numero es exactamente 20 porque es el único que tiene una raiz diferente de la de los veinialgo
                        if(numero ==20){
                            System.out.print("veinte");
                        }
                        else {
                            System.out.print("veinti");
                            //aqui establece el valor de "yComprobador" a 0 para que los veintialgo no tenga una y en el medio
                            yComprobador = 0;
                        }
                        break;
                    case 1:
                        System.out.print("diez ");
                        break;
                    default:
                }
                numero = unidades; // igualo numero a unidades para que el swtich de abajo lea las unidades
                if (yComprobador !=0){ // esto sirve para que si el numero no es multiplo de diez escriba la "y" entre las decenas y unidades
                    System.out.print("y ");
                }
            }

            switch (numero){ // aqui escribe el numero elegido o si el numero es mayor de 15 escribe las unidades
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
        else { //si el numero es exactamente 0 lo escribe directamente
            System.out.println("cero");
        }
    }
}