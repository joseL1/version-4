package Clases;

import java.sql.*;
import Conexion.Conexion;

/**
 *
 * @author admin
 */
public class Cliente {
  
    public int Rut; 
    public String Nombre; 
    public String Edad;
    public String Direccion;
    public String Comuna;

    //Abrir conexion
    private Connection objConexion=null;
    private String usuario="root";
    private String clave="";
    
    public Cliente(int Rut, String Nombre, String Edad, String Direccion, String Comuna) {
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Direccion = Direccion;
        this.Comuna = Comuna;
    }

    public Cliente() {
       // throw new UnsupportedOperationException("Not yet implemented");
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getComuna() {
        return Comuna;
    }

    public void setComuna(String Comuna) {
        this.Comuna = Comuna;
    }
    
    public void agregarCliente(int Rut, String Nombre, String Edad, String Direccion, String Comuna ){

        this.Rut = Rut;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Direccion = Direccion;
        this.Comuna = Comuna;
        
        System.out.println("Datos desde la Interfaz : "+Rut+" "+Nombre+" "+Edad+" "+Direccion+" "+Comuna+" ");
        Conexion conec = new Conexion();
    try
       {  objConexion=conec.abrirConeccionBd(usuario, clave);
          String sql="INSERT INTO Cliente (Rut, Nombre, Edad, Direccion, Comuna) VALUES("+Rut+",'"+Nombre+"','"+Edad+"','"+Direccion+"','"+Comuna+"')";
          conec.ejecutarTransaccion(sql, objConexion);
          try
            {System.out.println("Transaccion realizada a Cliente");
            } catch (Exception e){    }
    }
    catch(Exception e){    }
}
   public void buscarCliente(){
        try{
           Conexion.buscarCliente=false;
           Conexion conec = new Conexion();

            String sql="SELECT * FROM Cliente WHERE Rut="+Rut+"";

            objConexion=conec.abrirConeccionBd(usuario, clave);
            Conexion.sentencia=objConexion.prepareStatement(sql);
            ResultSet objRes=Conexion.sentencia.executeQuery(sql);
            if(objRes.next()){
                Conexion.buscarCliente=true;
                Rut=Integer.parseInt(objRes.getString(1));
                Nombre = objRes.getString(2);
                Edad = objRes.getString(3);
                Direccion = objRes.getString(4);
                Comuna = objRes.getString(5);
                
            }
            //Conexion.desconectar();
        }catch(Exception e){
            System.out.println("Fallo metodo buscar");
        }
    }
   
   public void modificarCliente(){
        try{
        Conexion conec = new Conexion();
        objConexion = conec.abrirConeccionBd(usuario, clave);
        String sql = "UPDATE Cliente SET Nombre='"+Nombre+"',Edad="+Edad+",Direccion='"+Direccion+"',Comuna='"+Comuna+"' WHERE Rut="+Rut+"";

        Conexion.sentencia=objConexion.prepareStatement(sql);
            conec.ejecutarTransaccion(sql, objConexion);
            System.out.println("Actualización realizada");
        }catch(Exception e){
            System.out.println("Fallo metodo actualizar");
        }
    }
   public void borrarCliente(){
        try{
            String sql = "DELETE FROM Cliente WHERE Rut="+Rut+"";
            Conexion conec = new Conexion();
            objConexion = conec.abrirConeccionBd(usuario, clave);
            Conexion.sentencia=objConexion.prepareStatement(sql);
            conec.ejecutarTransaccion(sql, objConexion);
            System.out.println("Cliente eliminado");
       }catch (Exception e){
           System.out.println("Fallo metodo borrar");
       }
   }
}
