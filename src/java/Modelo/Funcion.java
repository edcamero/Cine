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
public class Funcion {
    private int idfuncion;
    private Pelicula pelicula;
    private Sala sala;
    private String horainicio;
    private Date fecha;
    private int precio;

    public Funcion(int idfuncion ,String horainicio,String fechastring,int precio) {
        this.idfuncion = idfuncion;
        this.horainicio = horainicio;
        this.fecha = FechaP.ParseFecha(fechastring);
        this.precio = precio;
        
    }

    public int getIdfuncion() {
        return idfuncion;
    }

    public void setIdfuncion(int idfuncion) {
        this.idfuncion = idfuncion;
    }

    
    
    
    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    
}
