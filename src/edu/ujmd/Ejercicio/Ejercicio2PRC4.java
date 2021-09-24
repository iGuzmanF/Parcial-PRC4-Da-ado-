/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.Ejercicio;

import edu.ujmd.Ejercicio.Clases.Empleado;
import java.util.Scanner;

/**
 *
 * @author chele
 */
public class Ejercicio2PRC4 {

    public static void main(String[] args) {
        int cod = 0;
        String Nombre;
        String Apellido;
        String CargoE;
        double HorasTra;
        double sueldoBase = 0;
        double AFP = 0;
        double ISSS = 0;
        double Renta = 0;
        double sueldoLiquido = 0;
        double numMayor = 0;
        double numMenor = 0;
        double gananMas= 0;
        int cont = 0;
        // Construimos el arrelgo 
        Empleado[] Empleados = new Empleado[5];
   
        //Llenamos los slots del arreglo
        for (int i = 0; i < Empleados.length; i++) {

            Scanner reader = new Scanner(System.in);
            System.out.println("-Ingrese los empleados-");
            System.out.println("--------------------------------");

            System.out.println("Digite el codigo del empleado:");
            cod = reader.nextInt();
            System.out.println("Digite el nombre del empleado:");
            Nombre = reader.next();
            System.out.println("Digite el Apellido del empleado:");
            Apellido = reader.next();
            System.out.println("Digite el cargo del empleado:");
            CargoE = reader.next();
            System.out.println("Digite la Horas del empleado:");
            HorasTra = reader.nextDouble();

            Empleados[i] = new Empleado(cod, Nombre, Apellido, CargoE, HorasTra, sueldoBase, sueldoLiquido, AFP, ISSS, Renta);

            if (HorasTra <= 160 && HorasTra > 0) {
                Empleados[i].sueldoBase = HorasTra * 9.75;
            } else {
                if (HorasTra > 160 && HorasTra > 0) {
                    Empleados[i].sueldoBase = (160 * 9.75) + ((HorasTra - 160) * 11.75);
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("Debe colocar horas trabajadas mayores a 0");
                    System.out.println("--------------------------------");
                }
            }

            Empleados[i].AFP = (Empleados[i].sueldoBase * 0.0525);
            Empleados[i].ISSS = (Empleados[i].sueldoBase * 0.0688);
            Empleados[i].Renta = (Empleados[i].sueldoBase * 0.10);
            Empleados[i].sueldoLiquido = (Empleados[i].sueldoBase - Empleados[i].AFP - Empleados[i].ISSS - Empleados[i].Renta);

            if (Empleados[i].sueldoLiquido > numMayor) {

                numMayor = Empleados[i].sueldoLiquido;
            }
            if (Empleados[i].sueldoLiquido < numMenor);
            {
                numMenor = Empleados[i].sueldoLiquido;
            }
            if (Empleados[i].sueldoLiquido > 300) {
                gananMas = Empleados[i].sueldoLiquido;
                cont++;
            }
        }

        for (int i = 0; i < Empleados.length; i++) {
            System.out.println("--------------------------------");
            System.out.println("Codigo: " + Empleados[i].getCod());
            System.out.println("Nombre: " + Empleados[i].getNombre());
            System.out.println("Apellido: " + Empleados[i].getApellido());
            System.out.println("Cargo: " + Empleados[i].getCargoE());
            System.out.println("Horas trabajadas: " + Empleados[i].getHorasTra());
            System.out.println("Sueldo liquido del empleado es: " + Empleados[i].getSueldoLiquido());
            System.out.println("AFP es: " + Empleados[i].getAFP());
            System.out.println("ISSS es: " + Empleados[i].getISSS());
            System.out.println("Renta es: " + Empleados[i].getRenta());
        }
        System.out.println("--------------------------------");
        System.out.println("El salario mayor es:" + numMayor);
        System.out.println("El salario menor es:" + numMenor);
        
        
        
        for (int i = 0; i < cont; i++){
      System.out.println("--------------------------------");
      System.out.println("Los que ganan mas de 300 son: " + Empleados[i].getNombre() );
      System.out.println("Cuenta con un sueldo de:" + Empleados[i].getSueldoLiquido() );
        } 
        
        
    }
    
          
}
    

