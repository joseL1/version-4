package Clases;

import Conexion.Conexion;
import java.sql.*;;
import Clases.Transaccion;

public class CuentaCorriente {
 
    public int NumeroCuenta;
    public int Cliente_Rut;
    public int Banco_Codigo;
    public int MontoTotal;
  
    
    //Abrir conexion
    private Connection objConexion=null;
    private String usuario="root";
    private String clave="";
    
    public CuentaCorriente(int NumeroCuenta,int Cliente_Rut,int Banco_Codigo,int MontoTotal) {
        this.NumeroCuenta = NumeroCuenta;
        this.Cliente_Rut = Cliente_Rut;
        this.Banco_Codigo = Banco_Codigo;
        this.MontoTotal = MontoTotal;
    }

    public CuentaCorriente() {
        System.out.println("Cuenta Corriente");
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public int getMontoTotal() {
        return MontoTotal;
    }

    public void setMontoTotal(int MontoTotal) {
        this.MontoTotal = MontoTotal;
    }

    public int getCliente_Rut() {
        return Cliente_Rut;
    }

    public void setCliente_Rut(int Cliente_rut) {
        this.Cliente_Rut = Cliente_rut;
    }

    public int getBanco_Codigo() {
        return Banco_Codigo;
    }

    public void setBanco_Codigo(int Banco_codigo) {
        this.Banco_Codigo = Banco_codigo;
    }
    
    public void crearCuenta(int NumeroCuenta,int Cliente_Rut,int Banco_Codigo,int MontoTotal) {
        this.NumeroCuenta = NumeroCuenta;
        this.Cliente_Rut = Cliente_Rut;
        this.Banco_Codigo = Banco_Codigo;
        this.MontoTotal = MontoTotal;
    
         System.out.println("Datos desde la Interfaz : "+NumeroCuenta+" "+Cliente_Rut+" "+Banco_Codigo+" "+MontoTotal+"");
         Conexion conec = new Conexion();
    try
       {  objConexion=conec.abrirConeccionBd(usuario, clave);
          String sql="INSERT INTO CuentaCorriente (NumeroCuenta, Cliente_Rut, Banco_Codigo, MontoTotal) VALUES("+NumeroCuenta+","+Cliente_Rut+","+Banco_Codigo+","+MontoTotal+")";
          conec.ejecutarTransaccion(sql, objConexion);
          try
            {System.out.println("Transaccion realizada a Cuenta Corriente");
            } catch (Exception e){    }
    }
    catch(Exception e){    }

    }
    public void consultarSaldo(){
        try{
           Conexion.buscarSaldo=false;
           Conexion conec = new Conexion();
           String sql="SELECT MontoTotal FROM cuentacorriente WHERE NumeroCuenta="+NumeroCuenta+"";
            objConexion=conec.abrirConeccionBd(usuario, clave);
            Conexion.sentencia=objConexion.prepareStatement(sql);
            ResultSet objRes=Conexion.sentencia.executeQuery(sql);
            if(objRes.next()){
                Conexion.buscarSaldo=true;
                MontoTotal=Integer.parseInt(objRes.getString(1));              
            }
            //Conexion.desconectar();
        }catch(Exception e){
            System.out.println("Fallo metodo buscar");
        }
    }
    
}
