/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Modelo.Funcion;
import Modelo.Pelicula;
import Modelo.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blade
 */
public class SalaDao {
    
    
    
      public static Sala listar(int idsala,int funcion){
                Conexion pos;
                Connection co =null;
		PreparedStatement pst= null;
		ResultSet rs=null;
                
                String consulta="select * from sala where idsala="+idsala+";";
                
                pos=Conexion.getConexion();
                
            try {
                
                 pos.ConexionPostgres();
                pst=pos.getCon().prepareStatement(consulta,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
                rs=pst.executeQuery();
                
                while (rs.next()) {
				Sala c=new Sala(rs.getInt(1),rs.getString(3),rs.getString(4),rs.getInt(5));
                                c.setAsientos(AsientoDao.listar(idsala, funcion));
				return c;
			}
                
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(CineDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
            }
    
}
