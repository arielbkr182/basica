/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.calculadora;

import java.io.Serializable;

/**
 * Clase constructura para todas las variables a utilizar
 *
 * @author Sebastián
 */
public class Operacion implements Serializable {

    //Atributos
    /**
     * este numero representa el primer numero a operar
     */
    private double num1;
    /**
     * este numero representa el segundo numero a operar
     */
    private double num2;
    /**
     * este numero representa el resultado de la operacion
     */
    private double res;
    /**
     * representa la operacion a ejecutarse
     */
    private char ope;
    /**
     * Guarda un mensaje para dar informacion de la operación
     */
    private String info;

    //constructoras
    /**
     * constructora por defecto que limpia los atributos
     */
    public Operacion() {
        this.num1 = 0.0;
        this.num2 = 0.0;
        this.res = 0.0;
        this.ope = 'w';
    }

    /**
     * constructora que da los valores num1 y num2 y la operacion ope a
     * realizar.
     *
     * @param num1 representa el primer numero
     * @param num2 representa el segundo numero
     * @param ope representa la operacion
     */
    public Operacion(double num1, double num2, char ope, String info) {
        this.num1 = num1;
        this.num2 = num2;
        this.res = 0.0;
        this.ope = ope;
        this.info = info;
    }

    //Metodos Getters and Setters
    /**
     * Metodo para obtener el primer numero
     *
     * @return el valor del primer numero
     */
    public double getNum1() {
        return num1;
    }

    /**
     * Cambiar el valor del primer numero
     *
     * @param num1 el nuevo valor del primer numero
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * Metodo para obtener el segundo numero
     *
     * @return el valor del segundo numero
     */
    public double getNum2() {
        return num2;
    }

    /**
     * Cambiar el valor del segundo numero
     *
     * @param num2 el nuevo valor del segundo numero
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    /**
     * Metodo para obtener el valor del resultado entre dos numero
     *
     * @return el valor del resultado de uuna operacion
     */
    public double getRes() {
        return res;
    }

    /**
     * Cambia el valor del resultado
     *
     * @param res el nuevo valor del resultado
     */
    public void setRes(double res) {
        this.res = res;
    }

    /**
     * Metodo para obtener el simbolo de la operacion
     *
     * @return el simbolo de la operacion
     */
    public char getOpe() {
        return ope;
    }

    /**
     * Cambia el simbolo de la operacion
     *
     * @param ope el nuevo simbolo de la operacion
     */
    public void setOpe(char ope) {
        this.ope = ope;
    }

    /**
     * Metodo para obtener la información de la operación
     *
     * @return la información de la operación
     */
    public String getInfo() {
        return info;
    }

    /**
     * Cambia la información de la opoeración
     *
     * @param info
     */
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    /**
     * Metodo para mostrar el objeto
     *
     * @return un objeto que contiene las variables de la operacion realizada
     */
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + ", res=" + res + ", ope=" + ope + ", Informacion=" + info + '}';
    }

}
