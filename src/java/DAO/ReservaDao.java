/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Modelo.Asiento;
import Modelo.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blade
 */
public class ReservaDao {
    
    
    
   
    
    public  static void AgregarReserva(Reserva reserva){
                Conexion pos;
                Connection co =null;
		PreparedStatement pst= null;
		ResultSet rs=null;
        if(reserva!=null){
            String sql = "INSERT INTO public.reserva(\n" +
                            "             idfuncion, idcliente, idasiento)\n" +
                            "    VALUES ( ?, ?, ?);";
            
            pos=Conexion.getConexion();
                    try {
                        pos.ConexionPostgres();
                        pst=pos.getCon().prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
                        for(Asiento a:reserva.getAsientos()){
                            pst.setInt(1, reserva.getFuncion().getIdfuncion());
                            pst.setInt(2, reserva.getCliente().getId());
                            pst.setInt(3,a.getIdasiento());
                        }
                        
                        
                       
                    } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                        Logger.getLogger(ReservaDao.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
        }
    }
    
    
    
    
}
