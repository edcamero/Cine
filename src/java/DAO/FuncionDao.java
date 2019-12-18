/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Modelo.Funcion;
import Modelo.Pelicula;
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
public class FuncionDao {
    
    
    
    public static ArrayList<Funcion> listar(int idcine,Pelicula pelicula){
                Conexion pos;
                Connection co =null;
		PreparedStatement pst= null;
		ResultSet rs=null;
                
                String consulta="select f.* from funcion as f,sala where f.idpelicula ="+pelicula.getIdpelicula()+" and sala.idcine="+idcine+" and sala.idsala=f.idsala";
                ArrayList<Funcion> listaFunciones=new ArrayList();
                pos=Conexion.getConexion();
                
            try {
                
                 pos.ConexionPostgres();
                pst=pos.getCon().prepareStatement(consulta,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
                rs=pst.executeQuery();
                
                while (rs.next()) {
				Funcion c=new Funcion(rs.getInt(1),rs.getString(4),rs.getString(5),rs.getInt(6));
				c.setPelicula(pelicula);
                                c.setSala(SalaDao.listar(rs.getInt(3), rs.getInt(1)));
				listaFunciones.add(c);
			}
                
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(CineDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return listaFunciones;
            }
}
