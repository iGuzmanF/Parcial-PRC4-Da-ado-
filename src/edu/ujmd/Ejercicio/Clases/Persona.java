/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.Ejercicio.Clases;

/**
 *
 * @author chele
 */
public class Persona {

    private String Nombre;
    private String Apellido;
    private String CargoE;
    private int Edad;
    private String Direccion;
    public String getNombre;
    public String getApellido;

    public Persona() {
        Nombre = "";
        Apellido = "";
        Edad = 0;
        CargoE = "";

    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }
      public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getApellido() {
        return Apellido;
    }
  
      public void setCargoE(String CargoE) {
        this.CargoE = CargoE;
    }
    public String getCargoE() {
        return CargoE;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getDireccion() {
        return Direccion;      
    }
       
}
