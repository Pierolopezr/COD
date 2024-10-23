import java.util.Scanner;
/**
 * Código que te pide un mes y te devuelve el numero de dias que tiene
 * @version 1.0
 * @author Jorge Durán Cruz
 */
public class Mes_Dias {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea el mes (1-12)");
        int mes =sc.nextInt();
        System.out.println("Teclea el año");
        int ano = sc.nextInt();
        sc.close();

        boolean bisiesto;
       if(ano % 4 == 0 && !(ano % 100 == 0) || ano % 400 == 0 ){
           bisiesto = true;
           }
       else {
           bisiesto=false;
       }
        int dias = switch (mes){
            case 0,1,3,5,7,8,10,12 ->{
                yield 31;
            }
            case 2 -> {
                if (bisiesto) yield 29;
                else yield 28;
            }
            case 4,6,9,11 -> {
                yield 30;
            }
            default -> {
                System.out.println("Error: tu valor de mes no es correcto");
                yield -1;
            }
        };
        int dias2 =-1;
        switch (mes){
            case 0,1,3,5,7,8,10,12 ->dias2 = 31;
            case 2 -> {
                if(bisiesto) dias2 =29;
                else dias2 = 28;
            }
            case 4,6,9,11 ->dias2 =30;
        };
        if (dias!=-1){
        System.out.println("Tu mes tiene "+dias+ " dias");
        }
        if (dias2!=-1){
            System.out.println("Tu mes tiene "+dias+ " dias");
        }
    }
}