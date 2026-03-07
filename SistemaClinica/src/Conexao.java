import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar(){

        Connection conn = null;

        try{

            String url = "jdbc:mysql://localhost:3306/clinica";
            String user = "root";
            String password = "";

            conn = DriverManager.getConnection(url, user, password);

        }catch(Exception e){
            System.out.println("Erro: " + e);
        }

        return conn;
    }
}