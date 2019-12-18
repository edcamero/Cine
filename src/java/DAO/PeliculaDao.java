/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;

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
public class PeliculaDao {
    public static ArrayList<Pelicula> listar(int idcine){
                Conexion pos;
                Connection co =null;
		PreparedStatement pst= null;
		ResultSet rs=null;
                
                String consulta="select * from pelicula as p inner join cine_pelicula as cp on cp.idpelicula=p.idpelicula  where cp.idcine="+idcine;
                ArrayList<Pelicula> listaPelicula=new ArrayList();
                pos=Conexion.getConexion();
                
            try {
                
                 pos.ConexionPostgres();
                pst=pos.getCon().prepareStatement(consulta,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
                rs=pst.executeQuery();
                
                while (rs.next()) {
				Pelicula c=new Pelicula(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				
				listaPelicula.add(c);
			}
                
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(CineDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return listaPelicula;
            }
    
    
    
    public static void main(String[] args){
        for(Pelicula a:PeliculaDao.listar(2)){
             System.out.println(a.getTitulo()+"\n");
        }
       
    }
}
