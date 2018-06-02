/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.paciente.vista;

import java.awt.Image;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author Sebastian
 * @author Jose
 */
public class Ventana extends JDialog {
    /**
     * 
     */
    private Principal principal;/**
     * 
     */
    private JPanel jPanel;
    /**
     * 
     * @param principal
     * @param jPanel
     * @param titulo
     * @param modal
     * @param marco
     * @param opcionDeCerrado 
     */
    public Ventana(Principal principal, JPanel jPanel, String titulo, boolean modal, boolean marco,  int opcionDeCerrado) {
        super(principal, titulo, modal);
        this.setDefaultCloseOperation(opcionDeCerrado);
        this.setUndecorated(marco);
        this.principal = principal;
        this.jPanel = jPanel;
        this.jPanel.setVisible(true);
        this.add(this.jPanel);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(this.principal);
    }

}
