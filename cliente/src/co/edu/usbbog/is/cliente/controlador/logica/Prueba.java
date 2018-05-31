/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.cliente.controlador.logica;

import co.edu.usbbog.is.calculadora.Operacion;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que me realiza la operacion que el usuario escoga
 *
 * @author Sebastián
 */
public class Prueba {

    /**
     * Variable que me guarda el puerto que se va a utilizar como puente entre
     * servidor y cliente para la operaciones basicas
     */
    public final static int PUERTO_BASICAS = 9990;
    /**
     * Variable que me guarda el puerto que se va a utilizar como puente entre
     * servidor y cliente para las operaciones de potencia
     */
    public final static int PUERTO_POTENCIA = 9992;
    /**
     * Variable que me guarda el puerto que se va a utilizar como puente entre
     * servidor y cliente para las operaciones de division
     */
    public final static int PUERTO_DIVISION = 9991;
    
    /**
     * Variable que me guarda la dirección ip que se va a utilizar como puente
     * entre servidor y cliente
     */
    public final static String HOST = "127.0.0.1";

    /**
     * Metodo principal que envia un objeto al servidor que es una operacion
     *
     * @param args
     */
    
    public  void hola() {
        Operacion operacion = new Operacion(15.0, 3.0, '/', "");
        Socket clienteSocket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        // Utilizamos un try and catch para manejar excepciones al utilizar sockets
        try {
            clienteSocket = new Socket(HOST, PUERTO_DIVISION);
            oos = new ObjectOutputStream(clienteSocket.getOutputStream());
            oos.writeObject(operacion);
            ois = new ObjectInputStream(clienteSocket.getInputStream());
            operacion = (Operacion) ois.readObject();
            System.out.println(operacion.toString());
            ois.close();
            oos.flush();
            oos.close();
        } catch (IOException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
