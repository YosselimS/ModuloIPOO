package pe.hamp.eurekaapp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @Patron Singleton
 */
public final class AccesoDB {

  private AccesoDB() {
  }

  /**
   * Permite obtener un objeto Connection.
   * 
   * @return Retorna un objeto Connection con la conexión establecida a la base de datos.
   * @throws SQLException Si se produce error lanza un SQLException con el mensaje respectivo.
   */
  public final static Connection getConnection() throws SQLException {
    // Objeto Connection
    Connection cn = null;
    // Parametros para la conexión con JDBC
    String driver = "oracle.jdbc.OracleDriver";
    String urlDB = "jdbc:oracle:thin:@172.16.30.71:1521:xe";
    String user = "EUREKA";
    String pass = "admin";
    //String user = "system";
    //String pass = "oracle";
    // Proceso
    try {
      // Cargar el driver
      Class.forName(driver).newInstance();
      // Realizar la conexión
      cn = DriverManager.getConnection(urlDB, user, pass);      
    } catch (ClassNotFoundException e) {
      throw new SQLException("No se ha encontrado el driver.");
    } catch (Exception e) {
      e.printStackTrace();
      throw new SQLException("No se tiene acceso al servidor.");
    }    
    // Retornar conexión
    return cn;
  }

}
