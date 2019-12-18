/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Modelo.Asiento;
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
public class AsientoDao {
        public static ArrayList<Asiento> listar(int sala,int funcion){
                Conexion pos;
                Connection co =null;
		PreparedStatement pst= null;
		ResultSet rs=null;
                
                String consulta="select * from asiento where idsala="+sala+";";
                ArrayList<Asiento> listaAsientos=new ArrayList();
                pos=Conexion.getConexion();
                
            try {
                
                 pos.ConexionPostgres();
                pst=pos.getCon().prepareStatement(consulta,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
                rs=pst.executeQuery();
                
                while (rs.next()) {
				Asiento c=new Asiento(rs.getInt(1),rs.getInt(2));
				listaAsientos.add(c);
			}
                
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(CineDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            AsientoDao.Revisar(listaAsientos, sala);;
            return listaAsientos;
            }
        
        
        public static void Revisar(ArrayList<Asiento> asientos,int sala){
                Conexion pos;
                Connection co =null;
		PreparedStatement pst= null;
		ResultSet rs=null;
                
                String consulta="select * from asiento inner join reserva on reserva.idasiento=asiento.idasiento where asiento.idsala=? and asiento.idasiento=?";
                pos=Conexion.getConexion();
                
            try {
                
                 pos.ConexionPostgres();
                pst=pos.getCon().prepareStatement(consulta,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
                
                for (Asiento a : asientos) {
                     pst.setString(1, String.valueOf(sala));
                     pst.setString(2, String.valueOf(a.getIdasiento()));
                     rs=pst.executeQuery();
                        if(rs.absolute(1)){
                            a.setEstado(true);
                        }
                     
                }
                
                
                
                
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(CineDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            }
        
            
}
