package Clases;

import java.sql.*;
import Conexion.Conexion;


public class Banco {
   public int Codigo;
   public String Nombre; 
   public String Sucursal; 
   public String Direccion; 
   public String Comuna;
   
   //Abrir conexion
    private Connection objConexion=null;
    private String usuario="root";
    private String clave = "";

    public Banco(int Codigo, String Nombre, String Sucursal, String Direccion, String Comuna) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Sucursal = Sucursal;
        this.Direccion = Direccion;
        this.Comuna = Comuna;
    }

    public Banco() {
       // throw new UnsupportedOperationException("Not yet implemented");
        System.out.println("Banco");
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
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
    
    public void agregarBanco(int Codigo, String Nombre, String Sucursal, String Direccion, String Comuna ){

        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Sucursal = Sucursal;
        this.Direccion = Direccion;
        this.Comuna = Comuna;
        
        System.out.println("Datos desde la Interfaz : "+Codigo+" "+Nombre+" "+Sucursal+" "+Direccion+" "+Comuna+" ");
        Conexion conec = new Conexion();
    try{
        objConexion=conec.abrirConeccionBd(usuario, clave);
       
          String sql="INSERT INTO Banco (Codigo, Nombre, Sucursal, Direccion, Comuna) VALUES("+Codigo+",'"+Nombre+"','"+Sucursal+"','"+Direccion+"','"+Comuna+"')";
          conec.ejecutarTransaccion(sql, objConexion);
          try{
              System.out.println("Transaccion realizada a Banco");
            } catch (Exception e){    }
    }    catch(Exception e){    }
    }
    
    public void buscarBanco(){
        try{
           Conexion.buscarBanco=false;
           Conexion conec = new Conexion();

            String sql="SELECT * FROM Banco WHERE Codigo="+Codigo+"";

            objConexion=conec.abrirConeccionBd(usuario, clave);
            Conexion.sentencia=objConexion.prepareStatement(sql);
            ResultSet objRes=Conexion.sentencia.executeQuery(sql);
            if(objRes.next()){
                Conexion.buscarBanco=true;
                Codigo=Integer.parseInt(objRes.getString(1));
                Nombre = objRes.getString(2);
                Sucursal = objRes.getString(3);
                Direccion = objRes.getString(4);
                Comuna = objRes.getString(5);
                
            }
            //Conexion.desconectar();
        }catch(Exception e){
            System.out.println("Fallo metodo buscar");
        }
    }
    public void modificarBanco(){
        try{
        Conexion conec = new Conexion();
        objConexion = conec.abrirConeccionBd(usuario, clave);
        String sql = "UPDATE Banco SET Nombre='"+Nombre+"',Sucursal='"+Sucursal+"',Direccion='"+Direccion+"',Comuna='"+Comuna+"' WHERE Codigo="+Codigo+"";

        Conexion.sentencia=objConexion.prepareStatement(sql);
            conec.ejecutarTransaccion(sql, objConexion);
            System.out.println("Actualización realizada");
        }catch(Exception e){
            System.out.println("Fallo metodo actualizar");
        }
    }
   public void borrarBanco(){
        try{
            String sql = "DELETE FROM Banco WHERE Codigo="+Codigo+"";
            Conexion conec = new Conexion();
            objConexion = conec.abrirConeccionBd(usuario, clave);
            Conexion.sentencia=objConexion.prepareStatement(sql);
            conec.ejecutarTransaccion(sql, objConexion);
            System.out.println("Banco eliminado");
       }catch (Exception e){
           System.out.println("Fallo metodo borrar");
       }
   }
    
    }