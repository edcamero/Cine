/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author blade
 */
public class sala {
    private int idsala;
    private Cine cine;
    private String nombre;
    private String descripcion;
    private asiento asientos;

    public sala(int idsala, Cine cine, String nombre, String descripcion, asiento asientos) {
        this.idsala = idsala;
        this.cine = cine;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.asientos = asientos;
    }

    public int getIdsala() {
        return idsala;
    }

    public void setIdsala(int idsala) {
        this.idsala = idsala;
    }

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public asiento getAsientos() {
        return asientos;
    }

    public void setAsientos(asiento asientos) {
        this.asientos = asientos;
    }

    
    
    
}
