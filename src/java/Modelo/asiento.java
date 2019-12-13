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
public class asiento {
    private int idasiento;
    private int nroasiento;
    private sala sala;

    public asiento(int idasiento, int nroasiento, sala sala) {
        this.idasiento = idasiento;
        this.nroasiento = nroasiento;
        this.sala = sala;
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

    public sala getSala() {
        return sala;
    }

    public void setSala(sala sala) {
        this.sala = sala;
    }

    
}
