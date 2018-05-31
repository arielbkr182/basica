/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.cliente.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 204
 */
@Entity
@Table(catalog = "calculadora", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historial.findAll", query = "SELECT h FROM Historial h")
    , @NamedQuery(name = "Historial.findById", query = "SELECT h FROM Historial h WHERE h.id = :id")
    , @NamedQuery(name = "Historial.findByOperacion", query = "SELECT h FROM Historial h WHERE h.operacion = :operacion")
    , @NamedQuery(name = "Historial.findByNum1", query = "SELECT h FROM Historial h WHERE h.num1 = :num1")
    , @NamedQuery(name = "Historial.findByNum2", query = "SELECT h FROM Historial h WHERE h.num2 = :num2")
    , @NamedQuery(name = "Historial.findByRes", query = "SELECT h FROM Historial h WHERE h.res = :res")})
public class Historial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(nullable = false, length = 20)
    private String operacion;
    @Basic(optional = false)
    @Column(nullable = false)
    private double num1;
    @Basic(optional = false)
    @Column(nullable = false)
    private double num2;
    @Basic(optional = false)
    @Column(nullable = false)
    private double res;
    @JoinColumn(name = "us", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Usuario us;

    public Historial() {
    }

    public Historial(Integer id) {
        this.id = id;
    }

    public Historial(Integer id, String operacion, double num1, double num2, double res) {
        this.id = id;
        this.operacion = operacion;
        this.num1 = num1;
        this.num2 = num2;
        this.res = res;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historial)) {
            return false;
        }
        Historial other = (Historial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.usbbog.is.cliente.modelo.entidades.Historial[ id=" + id + " ]";
    }
    
}
