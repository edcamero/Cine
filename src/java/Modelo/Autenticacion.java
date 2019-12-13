/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jdt.internal.compiler.batch.Main;

/**
 *
 * @author blade
 */
public class Autenticacion {
    
    public boolean autenticacion(String usuario,String password){
        PreparedStatement pst=null;
        ResultSet rs=null;
        Conexion conexion = null;
        try{
            String consulta="Select * from usuario where username = ? and pass= ?";
            conexion=Conexion.getConexion();
            conexion.ConexionPostgres();
            pst=conexion.getCon().prepareStatement(consulta,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, usuario);
            pst.setString(2, password);
            rs=pst.executeQuery();
            if(rs.absolute(1)){
                return true;
            }
            
        }catch(Exception e){
             Logger.getLogger(Autenticacion.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            try {
            if(conexion.getCon()!=null){
                
                    conexion.cerrar();}
            if(pst!=null){
            pst.close();
            }
            if(rs!=null){
              rs.close();
              
            }
                } catch (SQLException ex) {
                    Logger.getLogger(Autenticacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        return false;
        
        }
        
//  public  static  void main(String arg[])
//	{Autenticacion control=new Autenticacion();
//            System.out.println(control.autenticacion("enyer", "enyer"));
//                
//        
//        }
    
}
