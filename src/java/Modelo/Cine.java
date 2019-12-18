/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author blade
 */
public class Cine {
    private int idcine;
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Pelicula> peliculas;

    public Cine(int idcine, String nombre, String direccion,String telefono) {
        this.idcine = idcine;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono=telefono;
    }

    public int getIdcine() {
        return idcine;
    }

    public void setIdcine(int idcine) {
        this.idcine = idcine;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "Cine{" + "idcine=" + idcine + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + "\n}";
    }
    
    
}
