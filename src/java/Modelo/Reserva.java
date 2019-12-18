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
public class Reserva {
    private int id;
    private Funcion funcion;
    private Usuario Cliente;
    private ArrayList<Asiento> asientos;

    public Reserva(int id, Funcion funcion, Usuario Cliente) {
        this.id = id;
        this.funcion = funcion;
        this.Cliente = Cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public Usuario getCliente() {
        return Cliente;
    }

    public void setCliente(Usuario Cliente) {
        this.Cliente = Cliente;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }
    
    
    
    
    
}
