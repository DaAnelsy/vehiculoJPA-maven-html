/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vehiculo.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author da_an
 */
@Entity
@Table(name = "vehiculo")
@NamedQueries({
    @NamedQuery(name = "Vehiculo.findAll", query = "SELECT v FROM Vehiculo v")})
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "placa")
    private String placa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "color")
    private String color;
    @Basic(optional = false)
    @NotNull
    @Column(name = "puertas")
    private int puertas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cilindro")
    private int cilindro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "tipocombustible")
    private String tipocombustible;

    public Vehiculo() {
    }

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public Vehiculo(String placa, String modelo, String color, int puertas, int cilindro, String tipocombustible) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.puertas = puertas;
        this.cilindro = cilindro;
        this.tipocombustible = tipocombustible;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getCilindro() {
        return cilindro;
    }

    public void setCilindro(int cilindro) {
        this.cilindro = cilindro;
    }

    public String getTipocombustible() {
        return tipocombustible;
    }

    public void setTipocombustible(String tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (placa != null ? placa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.placa == null && other.placa != null) || (this.placa != null && !this.placa.equals(other.placa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", modelo=" + modelo + ", color=" + color + ", puertas=" + puertas + ", cilindro=" + cilindro + ", tipocombustible=" + tipocombustible + '}';
    }

    
    
}
