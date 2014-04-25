
package Clases;

/**
 *
 * @author admin
 */

import java.sql.*;
import Conexion.Conexion;
import javax.swing.JOptionPane;

public class Usuario {
    public int Cliente_Rut;
    public String Contraseña = "1234";

//Login
       
    static Statement consulta = null;
    static ResultSet tabla = null;
    static int cont=0;
    
    //Abrir conexion
    private Connection objConexion=null;
    private Connection objResultado=null;
    private String usuario="root";
    private String clave="";
    
    public Usuario(){
        System.out.println("Usuario");
    }
    public Usuario(int Cliente_Rut, String Contraseña){
        this.Cliente_Rut = Cliente_Rut;
        this.Contraseña = Contraseña;        
    }
   

   public void usuarioNuevo (int Cliente_Rut, String Contraseña){
       this.Cliente_Rut = Cliente_Rut;
       this.Contraseña = Contraseña;
       Conexion conec = new Conexion();
       String nuevaContraseña = Contraseña.substring(0, 4);
       try
       {  objConexion=conec.abrirConeccionBd(usuario, clave);
          String sql="INSERT INTO Usuario (Cliente_Rut, Contraseña) VALUES("+Cliente_Rut+",'"+nuevaContraseña+"')";
          conec.ejecutarTransaccion(sql, objConexion);
          try
            {System.out.println("Transaccion realizada a Usuario");
            } catch (Exception e){    }
    }
    catch(Exception e){    }
   } 
 /** 
   public void agregarUsuario(int Cliente_Rut, String Contraseña){

        this.Cliente_Rut = Cliente_Rut;
        this.Contraseña = Contraseña;
        
        System.out.println("Datos desde la Interfaz : "+Cliente_Rut+" "+Contraseña+" ");
        Conexion conec = new Conexion();
    try
       {  objConexion=conec.abrirConeccionBd(usuario, clave);
          String sql="INSERT INTO Usuario (Cliente_Rut, Contraseña) VALUES("+Cliente_Rut+",'"+Contraseña+"')";
          conec.ejecutarTransaccion(sql, objConexion);
          try
            {System.out.println("Transaccion realizada a Usuario");
            } catch (Exception e){    }
    }
    catch(Exception e){    }
}
**/
   public void buscarUsuario(){
        try{
           Conexion.buscarUsuario=false;
           Conexion conec = new Conexion();

            String sql="SELECT * FROM Usuario WHERE Cliente_Rut="+Cliente_Rut+"";

            objConexion=conec.abrirConeccionBd(usuario, clave);
            Conexion.sentencia=objConexion.prepareStatement(sql);
            ResultSet objRes=Conexion.sentencia.executeQuery(sql);
            if(objRes.next()){
                Conexion.buscarUsuario=true;
                Cliente_Rut=Integer.parseInt(objRes.getString(1));
                Contraseña=objRes.getString(2);
            }
            //Conexion.desconectar();
        }catch(Exception e){
            System.out.println("Fallo metodo buscar");
        }
    }
   
   public void modificarUsuario(){
        try{
        Conexion conec = new Conexion();
        objConexion = conec.abrirConeccionBd(usuario, clave);
        String sql = "UPDATE Usuario SET Contraseña='"+Contraseña+"' WHERE Cliente_Rut = "+Cliente_Rut+"";

        Conexion.sentencia=objConexion.prepareStatement(sql);
            conec.ejecutarTransaccion(sql, objConexion);
            System.out.println("Actualización realizada");
        }catch(Exception e){
            System.out.println("Fallo metodo actualizar");
        }
    }
   public void borrarUsuario(){
        try{
            String sql = "DELETE FROM Usuario WHERE Cliente_Rut="+Cliente_Rut+"";
            Conexion conec = new Conexion();
            objConexion = conec.abrirConeccionBd(usuario, clave);
            Conexion.sentencia=objConexion.prepareStatement(sql);
            conec.ejecutarTransaccion(sql, objConexion);
            System.out.println("Usuario eliminado");
       }catch (Exception e){
           System.out.println("Fallo metodo borrar");
       }
    }
  /**
   public String[] buscarDatosUsuario(String Cliente_Rut) throws Exception
    {    String[] user=new String[2];
        Conexion conec = new Conexion();
        consulta=conec.abrirConeccionBd(usuario, clave).createStatement();
        tabla=consulta.executeQuery("SELECT Cliente_Rut,Contraseña FROM usuario WHERE (Cliente_Rut="+Cliente_Rut+")");
        if (tabla.next())
        {  user[0]=new String(tabla.getString(1));
           user[1]=new String(tabla.getString(2));
          // user[2]=new String(tabla.getString(3));
        }
        else
        {  user[0]=new String("");
           user[1]=new String("");
           //user[2]=new String("");
        }
        return user;
    }
**/
  
}
