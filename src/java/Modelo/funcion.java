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
public class funcion {
    private int idfuncion;
    private pelicula pelicula;
    private sala sala;
    private String horainicio;
    private Date fecha;
    private int precio;

    public funcion(int idfuncion, pelicula pelicula, sala sala, String horainicio, Date fecha, int precio) {
        this.idfuncion = idfuncion;
        this.pelicula = pelicula;
        this.sala = sala;
        this.horainicio = horainicio;
        this.fecha = fecha;
        this.precio = precio;
    }

    public int getIdfuncion() {
        return idfuncion;
    }

    public void setIdfuncion(int idfuncion) {
        this.idfuncion = idfuncion;
    }

    public pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public sala getSala() {
        return sala;
    }

    public void setSala(sala sala) {
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
