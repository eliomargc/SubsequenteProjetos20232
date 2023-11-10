package testes;

import controller.ConexaoMySql;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class ListaUsuariosObjetos {
    public static void main(String[] args) {
        ConexaoMySql con = ConexaoMySql.getInstance();
        con.selecionar("SELECT * FROM usuario");
        
        List<Usuario> lista = new ArrayList<>();
        
        try {
            while(con.getResultset().next()){
                Usuario usu = new Usuario();
                usu.setId(con.getResultset().getInt("id")); 
                usu.setLogin(con.getResultset().getString("login")); 
                usu.setSenha(con.getResultset().getString("senha")); 
                
                lista.add(usu);
            }
        } catch (SQLException ex) {
           System.err.println("Erro ao percorrer o resultset: " 
                    + ex.getMessage());
        }
        
        for(Usuario u : lista){
            System.out.println("ID: " + u.getId());
            System.out.println("Login: " + u.getLogin());
            System.out.println("Senha: " + u.getSenha());
            System.out.println("-----------------------\n");
        }
        // UsuarioDAO
    }
}
