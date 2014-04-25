package Clases;

import Conexion.Conexion;
import java.sql.Connection;


public class Transaccion {
    
    private int NumeroTransaccion;
    private int Cliente_Rut;
    private int Banco_Codigo;
    private int CuentaCorriente_NumeroCuenta;
    private String TipoTransaccion;
    private int MontoTransaccion;
    public String Giro= "Giro";
    public String Deposito="Deposito";
    
    //Abrir conexion
    private Connection objConexion=null;
    private String usuario="root";
    private String clave="";
    
    public Transaccion(int NumeroTransaccion, int Cliente_Rut, int Banco_Codigo, int CuentaCorriente_NumeroCuenta, String TipoTransaccion, int MontoTransaccion) {
        this.NumeroTransaccion = NumeroTransaccion;
        this.Cliente_Rut = Cliente_Rut;
        this.Banco_Codigo = Banco_Codigo;
        this.CuentaCorriente_NumeroCuenta = CuentaCorriente_NumeroCuenta;
        this.TipoTransaccion = TipoTransaccion;
        this.MontoTransaccion = MontoTransaccion;
    }

    public Transaccion() {
        System.out.println("Transaccion");
    }

    public int getNumeroTransaccion() {
        return NumeroTransaccion;
    }

    public void setNumeroTransaccion(int NumeroTransaccion) {
        this.NumeroTransaccion = NumeroTransaccion;
    }

    public int getCliente_Rut() {
        return Cliente_Rut;
    }

    public void setCliente_Rut(int Cliente_Rut) {
        this.Cliente_Rut = Cliente_Rut;
    }

    public int getBanco_Codigo() {
        return Banco_Codigo;
    }

    public void setBanco_Codigo(int Banco_Codigo) {
        this.Banco_Codigo = Banco_Codigo;
    }

    public int getCuentaCorriente_NumeroCuenta() {
        return CuentaCorriente_NumeroCuenta;
    }

    public void setCuentaCorriente_NumeroCuenta(int CuentaCorriente_NumeroCuenta) {
        this.CuentaCorriente_NumeroCuenta = CuentaCorriente_NumeroCuenta;
    }

    public int getMontoTransaccion() {
        return MontoTransaccion;
    }

    public void setMontoTransaccion(int MontoTransaccion) {
        this.MontoTransaccion = MontoTransaccion;
    }

    public String getTipoTransaccion() {
        return TipoTransaccion;
    }

    public void setTipoTransaccion(String TipoTransaccion) {
        this.TipoTransaccion = TipoTransaccion;
    }
    
    public void realizarGiro(int NumeroTransaccion, int Cliente_Rut, int Banco_Codigo, int CuentaCorriente_NumeroCuenta, String TipoTransaccion, int MontoTransaccion){
        
        this.NumeroTransaccion = NumeroTransaccion;
        this.Cliente_Rut = Cliente_Rut;
        this.Banco_Codigo = Banco_Codigo;
        this.CuentaCorriente_NumeroCuenta = CuentaCorriente_NumeroCuenta;
        this.TipoTransaccion = TipoTransaccion;
        this.MontoTransaccion = MontoTransaccion;
        System.out.println("Datos desde la Interfaz : "+NumeroTransaccion+" "+Cliente_Rut+" "+Banco_Codigo+" "+CuentaCorriente_NumeroCuenta+" "+TipoTransaccion+" "+MontoTransaccion+"");
        Conexion conec = new Conexion();
    try{
        objConexion=conec.abrirConeccionBd(usuario, clave);
       
          String sql="INSERT INTO Transaccion (NumeroTransaccion, Cliente_Rut, Banco_Codigo, CuentaCorriente_NumeroCuenta, TipoTransaccion, MontoTransaccion) VALUES("+NumeroTransaccion+","+Cliente_Rut+","+Banco_Codigo+","+CuentaCorriente_NumeroCuenta+",'"+Giro+"',"+MontoTransaccion+")";
          conec.ejecutarTransaccion(sql, objConexion);
          try{
              System.out.println("Giro realizado");
            } catch (Exception e){    }
    }    catch(Exception e){    }
    }
    
    public void realizarDeposito(int NumeroTransaccion, int Cliente_Rut, int Banco_Codigo, int CuentaCorriente_NumeroCuenta, String TipoTransaccion, int MontoTransaccion){
        
        this.NumeroTransaccion = NumeroTransaccion;
        this.Cliente_Rut = Cliente_Rut;
        this.Banco_Codigo = Banco_Codigo;
        this.CuentaCorriente_NumeroCuenta = CuentaCorriente_NumeroCuenta;
        this.TipoTransaccion = TipoTransaccion;
        this.MontoTransaccion = MontoTransaccion;
        System.out.println("Datos desde la Interfaz : "+NumeroTransaccion+" "+Cliente_Rut+" "+Banco_Codigo+" "+CuentaCorriente_NumeroCuenta+" "+TipoTransaccion+" "+MontoTransaccion+"");
        Conexion conec = new Conexion();
    try{
        objConexion=conec.abrirConeccionBd(usuario, clave);
       
          String sql="INSERT INTO Transaccion (NumeroTransaccion, Cliente_Rut, Banco_Codigo, CuentaCorriente_NumeroCuenta, TipoTransaccion, MontoTransaccion) VALUES("+NumeroTransaccion+","+Cliente_Rut+","+Banco_Codigo+","+CuentaCorriente_NumeroCuenta+",'"+Deposito+"',"+MontoTransaccion+")";
          conec.ejecutarTransaccion(sql, objConexion);
          try{
              System.out.println("Deposito realizado");
            } catch (Exception e){    }
    }    catch(Exception e){    }
    }
   
}

