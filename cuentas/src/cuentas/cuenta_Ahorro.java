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
public class cuenta_Ahorro extends cuenta_corriente{
    
    private double interes;
    
   public cuenta_Ahorro(String cuenta, long saldo, double interes) {
        super(cuenta, saldo);
        this.interes = interes;
    }

    public cuenta_Ahorro(String cuenta, long saldo) {
        super(cuenta, saldo);
        this.interes = 15.3;
    }
    
       public void calcularInteres() {
        double interesCalculado = getSaldo() * (interes / 100);
        ingresar((long) interesCalculado);
    }
    
}
