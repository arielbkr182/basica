/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.potencia.controlador;

import co.edu.usbbog.is.calculadora.Operacion;

/**
 *
 * @author jofa7
 */
public class Operador {
    /**
     * Metodo operacion el cual valida la operacion seleccionada y realiza el proceso
     * @param o
     * @return 
     */
    public Operacion operar(Operacion o){
        if(o.getOpe()=='w'){
            return null;
        }else{
            switch(o.getOpe()){
                case 'e':
                    o.setRes(potencia(o.getNum1(),o.getNum2()));
                    break;
                case 'r':
                    o.setRes(raiz(o.getNum1(),o.getNum2()));
                    break;
                default:
                    System.out.println("operacion no valida");
                    return null;
            }
        }
        return o;
    }

    /**
     * Se genera el método potencia el cual se encarga de hacer el calculo de:
     * base^exp que se puede ver como a^b
     * @param base
     * @param exp
     * @return 
     */
    private double potencia(double base, double exp) {
        return Math.pow(base, exp);
    }

    /**
     * Se genera el método raiz el cual se encarga de hacer el calculo de:
     * exp√base que se puede ver como b√a
     * @param base
     * @param exp
     * @return 
     */
    private double raiz(double base, double exp) {
        return Math.pow(base, 1/exp);
    }
}
