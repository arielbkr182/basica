/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.basico.controlador;

import co.edu.usbbog.is.calculadora.Operacion;

/**
 * Clase para realizar las respectivas operaciones, que en este caso son
 * operacion basicas como sumar, resta y multiplicar
 *
 * @author Sebastián
 */
public class Operador {

    /**
     * Metodo para identificar que tipon de operacion se va a realizar
     *
     * @param o objeto que contiene las partes de una operacion
     * @return el objeto co su partes
     */
    public Operacion operar(Operacion o) {
        // Los casos posibles y no posibles
        if (o.getOpe() == 'w') {
            return null;
        } else {
            switch (o.getOpe()) {
                case '+':
                    o.setRes(sumar(o.getNum1(), o.getNum2()));
                    o.setInfo("Operación exitosa");
                    break;
                case '-':
                    o.setRes(restar(o.getNum1(), o.getNum2()));
                    o.setInfo("Operación exitosa");
                    break;
                case '*':
                    o.setRes(multiplicar(o.getNum1(), o.getNum2()));
                    o.setInfo("Operación exitosa");
                    break;
                default:
                    System.out.println("operacion no valida");
                    return null;
            }
        }
        return o;
    }

    /**
     * Metodo privado para sumar dos numeros
     *
     * @param num1 primer numero a sumar
     * @param num2 segundo numero a sumar
     * @return el resultado de la suma de los dos numeros
     */
    private double sumar(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Metodo privado para restar dos numeros
     *
     * @param num1 primer numero a restar
     * @param num2 segundo numeros a restar
     * @return el resultado de la resta de los dos numeros
     */
    private double restar(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Metodo privado para multiplicar dos numeros
     *
     * @param num1 primer numero a multiplicar
     * @param num2 segundo numero a multiplicar
     * @return el resultado de la multiplcacion de los dos numeros
     */
    private double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

}
