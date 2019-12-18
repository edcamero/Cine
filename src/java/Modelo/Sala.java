/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author blade
 */
public class Sala {
    private int idsala;
    private Cine cine;
    private String nombre;
    private String descripcion;
    private int cantAsientos;
    private ArrayList<Asiento> asientos;

    public Sala(int idsala, String nombre, String descripcion,int cantAsientos) {
        this.idsala = idsala;
        this.nombre = nombre;
        this.cantAsientos=cantAsientos;
        this.descripcion = descripcion;
        
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

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }

    

    
    
    
}
