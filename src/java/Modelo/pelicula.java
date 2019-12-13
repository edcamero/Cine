/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author blade
 */
public class pelicula {
    private int idpelicula;
    private String titulo;
    private String duracion;
    private String genero;
    private String portada;

    public pelicula(int idpelicula, String titulo, String duracion, String genero, String portada) {
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
    
    
}
