
package Conexion;
import java.sql.*;


public class Conexion {

 
    static final String DRIVER = "com.mysql.jdbc.Driver";
    Statement instruccion=null;

    //public static Connection conn;
    public static Statement sentencia;
    public static boolean buscarUsuario;
    public static boolean buscarCliente;
    public static boolean buscarBanco;
    public static boolean buscarSaldo;
    
    public Conexion() {
        String canal;
    
    }
   

     public Connection abrirConeccionBd ( String pUsuario, String pClave )
     {
        String lUrl = " ";
        Connection objConectar = null;

        //lUrl = "jdbc:mysql://localhost/videoclub";
        String lMensaje = " ";

        try {
             Class.forName(DRIVER);
             try {
                  //objConectar=DriverManager.getConnection( lUrl ,pUsuario,pClave);
                  objConectar=DriverManager.getConnection("jdbc:mysql://localhost/RedBancFinal","root","");
                 //objConectar=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
                  instruccion = objConectar.createStatement();
                 } catch (SQLException e) {
                  if (objConectar == null) {
                      lMensaje = "objConectar NULO " ;
                    }
                  else {
                      lMensaje = "objConectar  " + objConectar ;
                 }
                  throw new NullPointerException("ERROR ... NO SE PUDO EFECTUAR CONECCION A LA BASE DE DATOS " + lUrl + " " + pUsuario + " " + pClave + " " + lMensaje);
             }
        } catch ( ClassNotFoundException ex){  System.out.println(ex +"Error...");
                 throw new NullPointerException("ERROR ... ClassNotFoundException ");

        }
        return objConectar;
    }

/**************************************************************************************
 *  Metodo que ejecuta sentencia SQL correspondiente a una consulta a la Base de Datos.
 *  El resultado de la consultado es almacenado en una variable de tipo ResultSet
***************************************************************************************/
    public ResultSet ejecutarConsulta(String pSql,  Connection pConectar, PreparedStatement pSentencia) {
        ResultSet objResultado = null;
        try {
             objResultado = pSentencia.executeQuery();
             
        } catch (SQLException e) {
        }
        return objResultado;
    }


/**************************************************************************************
 *  Metodo que ejecuta sentencia SQL correspondiente a una transaccion de Base de Datos
 * (update, delete, insert)
 *  Este metodo NO retorna resultado
***************************************************************************************/
    public void ejecutarTransaccion(String pSql,  Connection pConectar){
       Statement objSentencia = null;
       try {
            objSentencia = pConectar.prepareStatement(pSql);
            try {
                 objSentencia.execute(pSql);
            } catch (SQLException e) {
            }
          } catch (SQLException e){
        }
    }

/**************************************************************************************
 * Metodo que Cierra la consulta (resultado del SQL ejecutado) que corresponde al
 * tipo ResultSet
***************************************************************************************/
    public void cerrarConsulta(ResultSet pResul){
        try {
            pResul.close();
        } catch (SQLException e) {
        }
    }

/**************************************************************************************
 *  Metodo que cierra la sentencia SQL ejecutada
***************************************************************************************/
    public void cerrarSentencia(PreparedStatement pSentencia){
        try {
            try {
                pSentencia.close();
            } catch (SQLException ex) {
            }
        } catch (NullPointerException  e) {
              throw new NullPointerException("ERROR EN SENTENCIA NULL");
        }
    }

/**************************************************************************************
 *  Metodo que cierra la conexion a la Base de datos
***************************************************************************************/
    public void cerrarConeccionBd(Connection pConexion ){
        try {
            pConexion.close();
        } catch (SQLException e) {
        }
    }

   

}