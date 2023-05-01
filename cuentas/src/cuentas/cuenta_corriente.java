/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author Rentadvisor
 */
public class cuenta_corriente {


     private String nombre;
     private String apellidos;
     private int edad;  
     private String número_de_cuenta;
     private long saldo; 
     
    public void ingresar(long cantidad){
        saldo += cantidad;
    }
    
    public void reintegro(long cantidad){
          saldo -= cantidad;
    }
    
    public String concatenar (){
         return "Número de cuenta: " + número_de_cuenta + ", Saldo: " + saldo;
    }
     
    public cuenta_corriente(String nombre, String apellidos, int edad, String número_de_cuenta, long saldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.número_de_cuenta = número_de_cuenta;
        this.saldo = saldo;
    }
     
    public cuenta_corriente(String número_de_cuenta, long saldo) {
        this.número_de_cuenta = número_de_cuenta;
        this.saldo = saldo;
    }
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNúmero_de_cuenta() {
        return número_de_cuenta;
    }

    public void setNúmero_de_cuenta(String número_de_cuenta) {
        this.número_de_cuenta = número_de_cuenta;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
    
}
