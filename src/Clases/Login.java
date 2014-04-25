/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaz.CajeroAutomatico;
import Interfaz.frmLogin;
import Conexion.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author admin
 */
public class Login {
    static int cont=0;
//Abrir conexion
    private Connection objConexion=null;
    private String usuario="root";
    private String clave="";
    
public void acceso(String Cliente_Rut ,String Contraseña){
Conexion conec = new Conexion();
Statement consulta=null;
ResultSet tabla=null;

try{
    objConexion=conec.abrirConeccionBd(usuario, clave);
    consulta = objConexion.createStatement();
    tabla=consulta.executeQuery("select Cliente_Rut , Contraseña from usuario where Cliente_Rut='"+Cliente_Rut+"'and Contraseña='"+Contraseña+"'");
    
    if(tabla.next()){
        
        CajeroAutomatico cajero= new CajeroAutomatico();
        cajero.setVisible(true);
        new frmLogin().setVisible(false);
     }else{
          cont++;
           if(cont==3){
              JOptionPane.showMessageDialog(
              null,"Se ha superado el número máximo de intentos.", "AVISO DE ENLACE",
              JOptionPane.PLAIN_MESSAGE);
              System.exit(0);
           }else{
              JOptionPane.showMessageDialog(
              null,"Usuario y/o Contraseña incorrectos.\n "+cont+"º intento", "AVISO DE ENLACE",
              JOptionPane.PLAIN_MESSAGE);                
           }
    }  
}catch(Exception e){}
}
}
