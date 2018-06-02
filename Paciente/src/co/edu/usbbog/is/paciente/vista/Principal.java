/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.paciente.vista;

import co.edu.usbbog.is.paciente.controlador.logica.Operar;
import javax.swing.JFrame;

/**
 *
 * @author Sebastian
 * @author Jose
 */
public class Principal extends JFrame {
    //relaciones
    private Ventana ventana;
    private Login login;
    private Pantalla_inicial_paciente p;
    private Registro registro;
    private Operar operar;
    private Pantalla_inicial_admin pa;
    private Usuarios_lista ul;
    private Servicios s;
    private Foro f;
    private PQR pqr;
    private Eps eps;
    private Punto_atencion pt;
    private Reportes r;
    private Ver_Perfil vp;
    private Historial h;
    private ForoPaciente fp;
    private Punto_atencion_paciente pp;
    

    //componentes

    /**
     * metodo main
     *
     * @param args argumentos del programa
     */
    public static void main(String[] args) {
        Principal principal = new Principal();
    }

    /**
     * Metodo Constructor
     */
    public Principal() {
        operar = new Operar();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Calculadora");
        this.setResizable(false);
        this.setVisible(false);
        //inicia caracteristicas del Frame
        this.irAInicioDeSesion();
    }

    /**
     * inicia los componentes del frame, en este caso el menu bar y sus botones
     * y sus eventos.
     */
    private void iniciarComponentesDePrincipal() {
        
    }

    //metodos de eventos del menu bar    

    //metodos de navegacion
    /**
     * Metodo para salir de la aplicación
     */
    protected void salir() {
        System.exit(0);
    }
    /**
     * Metodo para quitar el panel actual del marco
     */
    private void quitarPanelesDelMarco() {
        setVisible(false);
        if (p!=null) {
            remove(p);
            p=null;
        }
        if (registro!=null) {
            remove(registro);
            registro=null;
        }
        if(pa!=null){
            remove(pa);
            pa=null;
        }
        if(ul!=null){
            remove(ul);
            ul=null;
        }
        if(s!=null){
            remove(s);
            s=null;
        }
        if(pt!=null){
            remove(pt);
            pt=null;
        }
        if(f!=null){
            remove(f);
            f=null;
        }
        if(eps!=null){
            remove(eps);
            eps=null;
        }
        if(pqr!=null){
            remove(pqr);
            pqr=null;
        }
        if(r!=null){
            remove(r);
            r=null;      
        }
        if(vp!=null){
            remove(vp);
            vp=null;      
        }
        if(h!=null){
            remove(h);
            h=null;      
        }
        if(fp!=null){
            remove(fp);
            fp=null;      
        }
        if(pp!=null){
            remove(pp);
            pp=null;
        }
        //hacer lo anterior parra cada panel que este en el marco
    }
    /**
     * Metodo para iniciar el marco
     */
    protected  void iniciarMarco(){
        //inicia los componentes del frame
        this.quitarPanelesDelMarco();
        this.iniciarComponentesDePrincipal();
        this.setVisible(true);
    }
    /**
     * Metodo para cerrar la ventana
     */
    protected void cerrarVentana() {
        ventana.setVisible(false);
        ventana = null;
    }
    /**
     * Metodo para abrir la ventana
     */
    private void iniciarVentana() {
        if (ventana!=null) {
            cerrarVentana();
        } 
        setVisible(false);
    }
    //metodos de navegacion
    /**
     * Metodo para pasar al panel de la calculadora
     */
    protected void irAPantalla() {
        cerrarVentana();
        iniciarMarco();
        //agrega el panelinicial
         p = new Pantalla_inicial_paciente(this);
        p.setVisible(true);
        add(p);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }
    /**
     * Metodo para ir al panel de registrar
     */
    protected  void irARegistrar() {
        cerrarVentana();
        iniciarMarco();
        //agrega el panelinicial
        registro = new Registro(this);
        registro.setVisible(true);
        add(registro);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }
    /**
     * Metodo para ir al inicio de sesion
     */
    protected void irAInicioDeSesion() {
        operar.cerrarSesion();
        iniciarVentana();
        login = new Login(this);
        ventana = new Ventana(this, login, "Ventana", false, false, DO_NOTHING_ON_CLOSE);
    }
    protected void irAPantallaAdmin() {
        cerrarVentana();
        iniciarMarco();
        //agrega el panelinicial
        pa = new Pantalla_inicial_admin(this);
        pa.setVisible(true);
        add(pa);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    protected void irAUsuarios() {
        iniciarMarco();
        ul = new Usuarios_lista(this);
        ul.setVisible(true);
        add(ul);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    protected void IrAServicios() {
        iniciarMarco();
        s = new Servicios(this);
        s.setVisible(true);
        add(s);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    protected void IrAPunto() {
        iniciarMarco();
        pt = new Punto_atencion(this);
        pt.setVisible(true);
        add(pt);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    protected void IrAEps() {
        iniciarMarco();
        eps = new Eps(this);
        eps.setVisible(true);
        add(eps);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    protected void IrAReportes() {
        iniciarMarco();
        r = new Reportes(this);
        r.setVisible(true);
        add(r);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    protected void IrAForo() {
        iniciarMarco();
        f = new Foro(this);
        f.setVisible(true);
        add(f);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    protected void IrAPqr() {
        iniciarMarco();
        pqr = new PQR(this);
        pqr.setVisible(true);
        add(pqr);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }
    protected void IrADashBoard() {
        iniciarMarco();
        pa = new Pantalla_inicial_admin(this);
        pa.setVisible(true);
        add(pa);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }
    
    protected void IrAVerPerfil(){
        iniciarMarco();
        vp = new Ver_Perfil(this);
        vp.setVisible(true);
        add(vp);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }
    protected void IrAHistorial(){
        iniciarMarco();
        h = new Historial(this);
        h.setVisible(true);
        add(h);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }
    protected void  IrAForoPaciente(){
        iniciarMarco();
        fp = new ForoPaciente(this);
        fp.setVisible(true);
        add(fp);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }
   protected void  IrAPuntoPaciente(){
        iniciarMarco();
        pp = new Punto_atencion_paciente(this);
        pp.setVisible(true);
        add(pp);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }
    //metodos de logica
    /**
     * Metodo para validar el inicio de sesion de un usuario
     * @param usuario valor del usuario
     * @param pass valor contraseña
     * @return un verdadero o falso segun la condicion
     */
    protected  boolean validar(String usuario, String pass) {
        return operar.iniciarSesion(usuario, pass);
    }/**
     * Metodo para validad el resgistro y agregar el nuevo usuario
     * @param nombre nombre del usuario
     * @param usuario valor del usuario
     * @param pass valor de la contraseña
     * @param confirPass valor de la constraseña para confirmarlo
     * @return un verdadero o falso segun la condicion
     */
    protected boolean validarRegistro(String nombre, String usuario, String pass, String confirPass){
        return true;
    }
}
