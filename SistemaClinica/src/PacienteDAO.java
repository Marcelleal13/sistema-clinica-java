import java.sql.Connection;
import java.sql.PreparedStatement;

public class PacienteDAO {

    public void cadastrar(Paciente p){

        String sql = "INSERT INTO paciente (nome,telefone,email) VALUES (?,?,?)";

        try{

            Connection conn = Conexao.conectar();

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getTelefone());
            stmt.setString(3, p.getEmail());

            stmt.execute();

        }catch(Exception e){
            System.out.println(e);
        }

    }
}