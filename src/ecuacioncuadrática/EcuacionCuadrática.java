/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacioncuadrática;

import static java.lang.Math.pow; //Libreria para elebar un numero a una potencia
import static java.lang.Math.sqrt; //Libreria para sacar la raiz de un numero 
import static java.lang.Math.abs; //Libreria para sacar el valor absoluto de un numero 
import java.util.Scanner;

/**
 *
 * @author ddera
 */
public class EcuacionCuadrática {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        double a = 0;
        double b = 0;
        double c = 0;
        double discriminante = 0;
        double R = 0;
        double I = 0;
        double X1 = 0;
        double X2 = 0;

        do {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Programa que calcula los valores de una ecuación cuadrática");
            Scanner reader = new Scanner(System.in);
            System.out.println("Ingrese el valor A: ");
            a = reader.nextDouble();
            System.out.println("Ingrese el valor B: ");
            b = reader.nextDouble();
            System.out.println("Ingrese el valor C: ");
            c = reader.nextDouble();

            //Calculo de discriminante para saber que tipo de solucion se le tiene que dar
            discriminante = pow(b, 2) - 4 * a * c;
            //Calculo del tipo de raiz para saber que camino tomar si reales o complejas 
            if (discriminante >= 0) {
                if (discriminante == 0) {
                    double x = -b / (2 * a);
                    System.out.println("La raíz es: " + x);
                } else {
                    //Calculo para raices reales 
                    X1 = (-b + sqrt(discriminante)) / (2 * a);
                    X2 = (-b - sqrt(discriminante)) / (2 * a);
                    System.out.println("La raíz de X1 es: " + X1);
                    System.out.println("La raíz de X2 es: " + X2);
                }
            } else {
                //Calculo para cuando son raices complejas
                discriminante = abs(discriminante);
                R = -b / (2 * a);//reales
                I = sqrt(discriminante) / (2 * a);//imaginarias
                System.out.println("La raíz de X1 es: " + R + " + " + I);
                System.out.println("La raíz de X2 es: " + R + " - " + I);
            }

            System.out.println("¿Desea realizar de nuevo la operación?");
            System.out.println("Presione 1 si quiere continuar la operacion;  Presione 2 si desea salir");
            contador = reader.nextInt();
        } while (contador == 1);
    }
}
