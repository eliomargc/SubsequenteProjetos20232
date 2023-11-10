package testes;

import controller.ConexaoMySql;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ListarUsuarios {
    public static void main(String[] args) {
        ConexaoMySql con = ConexaoMySql.getInstance();
        con.selecionar("SELECT * FROM usuario");
        try {
            while(con.getResultset().next()){
                System.out.println("ID: " + con.getResultset().getString("id"));
                System.out.println("Login: " + con.getResultset().getString("login"));
                System.out.println("Senha: " + con.getResultset().getString("senha"));
                System.out.println("---------------------------");
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao percorrer o resultset: " 
                    + ex.getMessage());
        }
                
        
    }
}
