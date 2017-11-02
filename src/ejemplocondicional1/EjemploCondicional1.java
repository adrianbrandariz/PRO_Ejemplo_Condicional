package ejemplocondicional1;

import java.util.Scanner;
/**
 *
 * @author abrandarizdominguez
 */
public class EjemploCondicional1 {

    public static void main(String[] args) {
        // Pedimos dos números enteros
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        //Añado el valor de num1 + texto
        System.out.println("Introduce el valor de num1:");
        num1 = scan.nextInt();
        //Añado el valor de num2 + texto
        System.out.println("Introduce el valor de num2:");
        num2 = scan.nextInt();
        //Condición de num1>num2:
        if (num1>num2){
            System.out.println("El primer número = "+num1+" es mayor. "+num1+" > "+num2);
        }
        else if (num1<num2){
            System.out.println("El segundo número = "+num2+" es mayor. "+num2+" > "+num1);
        }
        else {
        System.out.println("Ambos números son iguales. "+num1+" = "+num2);
        }  
        //También se puede de la siguiente manera:
//        String respuesta = (num1>num2)?"El numero 1 es mayor"+num1:"El numero 2 es mayor"+num2;
//            System.out.println(respuesta);
    }
    
}
