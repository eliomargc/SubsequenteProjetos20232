package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class UsuarioDAO {

    // CRUD
    // Create
    // Read
    // Update
    // Delete
    private static ConexaoMySql con = ConexaoMySql.getInstance();
    
    public static boolean insert(Usuario usuario){
        return con.atualizar("INSERT INTO usuario (login, senha) VALUES ('"+usuario.getLogin()+"', '"+usuario.getSenha()+"')");
    }
    
    public static boolean update(Usuario usuario){
        return con.atualizar("UPDATE usuario SET login='"+usuario.getLogin()+"', senha='"+usuario.getSenha()+"' WHERE id=" + usuario.getId());
    }
    
    public static boolean delete(Usuario usuario){
       return con.atualizar("DELETE FROM usuario WHERE id=" + usuario.getId());
    }
    
    public static List<Usuario> getAll() {
        
        con.selecionar("SELECT * FROM softvendas.usuario;");

        List<Usuario> lista = new ArrayList<>();

        try {
            while (con.getResultset().next()) {
                Usuario usu = new Usuario();
                usu.setId(con.getResultset().getInt("usuario_id"));
                usu.setLogin(con.getResultset().getString("usuario_login"));
                usu.setSenha(con.getResultset().getString("usuario_senha"));

                lista.add(usu);
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao percorrer o resultset: "
                    + ex.getMessage());
        }
        return lista;
    }
}
