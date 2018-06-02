/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.paciente.controlador.logica;

import co.edu.usbbog.is.paciente.controlador.jpa.UsuarioJpaController;
import co.edu.usbbog.is.paciente.modelo.Usuario;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Persistence;

/**
 *
 * @author 204
 */
public class Operar {

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
    private Usuario currentUser;

    public boolean iniciarSesion(String user, String pass) {
        UsuarioJpaController ujc = new UsuarioJpaController(Persistence.createEntityManagerFactory("PacientePU"));
        Usuario u = ujc.findUsuarioByLogin(user);
        if (u != null) {
            if (u.getNombres().equals(user) && u.getContraseña().equals(pass)) {
                currentUser = u;
                return true;
            } else {
                currentUser = null;
                return false;
            }
        } else {   
            currentUser = null;
            return false;
        }
    }
    
    public void cerrarSesion(){
        currentUser= null;
    }
    /**public String operacion(String ecuacion){
        String ecu[]=ecuacion.split(" ");
        switch(ecu[1]){
            case "+":
                return sumar(ecu[0],ecu[2]);
                
        }
        return "hola";
    }
    public String sumar(String num1, String num2) {
        Operacion operacion = new Operacion(Double.parseDouble(num1), Double.parseDouble(num2), '+', "");
        Socket clienteSocket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        // Utilizamos un try and catch para manejar excepciones al utilizar sockets
        try {
            clienteSocket = new Socket(HOST, PUERTO_BASICAS);
            oos = new ObjectOutputStream(clienteSocket.getOutputStream());
            oos.writeObject(operacion);
            ois = new ObjectInputStream(clienteSocket.getInputStream());
            operacion = (Operacion) ois.readObject();
            System.out.println(operacion.toString());
            ois.close();
            oos.flush();
            oos.close();
            registrarHistorial(operacion.getOpe()+"",operacion.getNum1(),operacion.getNum2(), operacion.getRes());
            return operacion.getRes() + "";
        } catch (IOException e) {
            return "Error de Conexion";
        } catch (ClassNotFoundException ex) {
            return "Error de tipo de dato";
        }

    }

    private void registrarHistorial(String op, double num1, double num2, double res) {
        Historial registro = new Historial();
        registro.setOperacion(op);
        registro.setNum1(num1);
        registro.setNum2(num2);
        registro.setRes(res);
        registro.setUs(currentUser);
        HistorialJpaController hjc = new HistorialJpaController(Persistence.createEntityManagerFactory("clientePU"));
        hjc.create(registro);
        

    }*/
}
