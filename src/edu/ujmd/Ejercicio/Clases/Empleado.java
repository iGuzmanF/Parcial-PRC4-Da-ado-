/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.Ejercicio.Clases;

public class Empleado extends Persona {

  
      
    int cod;
    public double HorasTra;
    public double sueldoBase;
    public double sueldoLiquido;
    public double AFP = 0;
    public double ISSS = 0;
    public double Renta = 0;

    
    public Empleado() 
    {
      HorasTra = 0;
      cod = 0;
      sueldoBase = 0;
    }
    
 public Empleado (int cod, String Nombre, String Apellido, String CargoE, double HorasTra, double sueldoBase,double sueldoLiquido, double AFP, double ISSS, double Renta) {
         this.cod = cod;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.CargoE = CargoE;
        this.HorasTra = HorasTra;
        this.sueldoBase = sueldoBase;
        this.sueldoLiquido = sueldoLiquido;
        this.AFP = AFP;
        this.ISSS = ISSS;
        this.Renta = Renta;
    }
 
    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getCod() {
        return cod;
    }
    public void setHorasTra(double HorasTra) {
        this.HorasTra = HorasTra;
    }

    public double getHorasTra() {
        return HorasTra;
    }
 
    public double getSueldoBase() {
        return sueldoBase;
    }

  
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
   
    public double getSueldoLiquido() {
        return sueldoLiquido;
    }


    public void setSueldoLiquido(double sueldoLiquido) {
        this.sueldoLiquido = sueldoLiquido;
    }

    public double getAFP() {
        return AFP;
    }

    public void setAFP(double AFP) {
        this.AFP = AFP;
    }


    public double getISSS() {
        return ISSS;
    }

    public void setISSS(double ISSS) {
        this.ISSS = ISSS;
    }


    public double getRenta() {
        return Renta;
    }


    public void setRenta(double Renta) {
        this.Renta = Renta;
    }
    
    
}
