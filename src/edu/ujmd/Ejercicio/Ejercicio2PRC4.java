/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.Ejercicio;
import edu.ujmd.Ejercicio.Clases.Persona;
import java.util.Scanner;

/**
 *
 * @author chele
 */
public class Ejercicio2PRC4 {


    public static void main(String[] args) {
     Persona p;
     p = new Persona(); 
     Scanner reader = new Scanner(System.in);          
        System.out.println("Digite el nombre de la Persona:");
          p.getNombre = reader.nextLine();
          System.out.println("Digite el Apellido de la Persona:");
          p.getApellido = reader.nextLine();
          System.out.println("Digite el Apellido de la Persona:");
    }
}
