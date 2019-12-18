/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.google.gson.Gson;
import java.util.ArrayList;

/**
 *
 * @author blade
 */
public class Pelicula {
    private int idpelicula;
    private String titulo;
    private String duracion;
    private String genero;
    private String portada;
    private ArrayList<Funcion> funciones;

    public Pelicula(int idpelicula, String titulo, String duracion, String genero, String portada) {
        this.idpelicula = idpelicula;
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.portada = portada;
    }

    public int getIdpelicula() {
        return idpelicula;
    }

    public void setIdpelicula(int idpelicula) {
        this.idpelicula = idpelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(ArrayList<Funcion> funciones) {
        this.funciones = funciones;
    }

    
    
    
    @Override
    public String toString() {
        return "Pelicula:{" + "idpelicula=" + idpelicula + ", titulo=" + titulo + ", duracion=" + duracion + ", genero=" + genero + ", portada=" + portada + '}';
    }
    
    
    public String Json(){
        Gson gson =new Gson();
        
        return gson.toJson(this);
    }
    
}
