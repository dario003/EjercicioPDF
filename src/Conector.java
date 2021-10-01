import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

    Connection conexion;
    String error;

    public Conector(String host, String usuario, String pw, String base){

        String driver = "com.mysql.cj.jdbc.Driver";
        //String url = "127.0.0.1:3306";

        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection("jdbc:mysql://"+host+"/"+base, usuario,pw);

        }
        catch (ClassNotFoundException ex){
            error=ex.getMessage();
        }
        catch (SQLException e){
            error = e.getSQLState();
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void cierraConexion(){
        try {
            conexion.close();
        }
        catch (Exception ex){
            error = ex.getMessage();
        }
    }

    //Este método devuelve el error que impide la conexión
    public String getMensajeError(){
        return error;
    }
}
