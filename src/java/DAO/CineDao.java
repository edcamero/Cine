/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Modelo.Cine;
import Modelo.Pelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blade
 */
public class CineDao {
    
    
    
	public static ArrayList<Cine> listar(){
                Conexion pos;
                Connection co =null;
		PreparedStatement pst= null;
		ResultSet rs=null;
                
                String consulta="SELECT * FROM CINE";
                ArrayList<Cine> listaCines=new ArrayList();
                pos=Conexion.getConexion();
                
            try {
                pos.ConexionPostgres();
                pst=pos.getCon().prepareStatement(consulta,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
                rs=pst.executeQuery();
                
                
                
                while (rs.next()) {
				Cine c=new Cine(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				c.setPeliculas(PeliculaDao.listar(c.getIdcine()));
				listaCines.add(c);
			}
                
                
                
                
                        pst.close();
			rs.close();
                        pos.cerrar();
			
                
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(CineDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return listaCines;
                
        }
        
        
//        public static void main(String arg[]){
//        CineDao cd= new CineDao();
//            for (Cine a : cd.listar()) {
//                System.out.println(a.toString());
//                System.out.println("peliculas en este cine");
//                
//                for (Pelicula p : a.getPeliculas()) {
//                    System.out.println("   "+p.toString()+"\n");
//                }
//            }
//    }
        
       
}
