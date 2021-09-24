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

     public String Nombre;
     public String Apellido;
     public String CargoE;
     
     public Persona() 
     {

     }
        public Persona(String Nombre, String Apellido, String CargoE) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.CargoE = CargoE;
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
  
      public void setCargoE(String Cargo) {
        this.CargoE = Cargo;
    }
    public String getCargoE() {
        return CargoE;
    }    
}
