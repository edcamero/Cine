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
public class Asiento {
    private int idasiento;
    private int nroasiento;
    private Boolean estado;

    public Asiento(int idasiento, int nroasiento) {
        this.idasiento = idasiento;
        this.nroasiento = nroasiento;
        this.estado=false;
        
        
        
    }

    public int getIdasiento() {
        return idasiento;
    }

    public void setIdasiento(int idasiento) {
        this.idasiento = idasiento;
    }

    public int getNroasiento() {
        return nroasiento;
    }

    public void setNroasiento(int nroasiento) {
        this.nroasiento = nroasiento;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

 


    
}
