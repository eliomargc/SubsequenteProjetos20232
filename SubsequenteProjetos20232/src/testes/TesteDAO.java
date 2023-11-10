package testes;

import controller.UsuarioDAO;
import java.util.List;
import model.Usuario;

public class TesteDAO {

    public static void main(String[] args) {
        List<Usuario> lista = UsuarioDAO.getAll();
        for (Usuario u : lista) {
            System.out.println("ID: " + u.getId());
            System.out.println("Login: " + u.getLogin());
            System.out.println("Senha: " + u.getSenha());
            System.out.println("-----------------------\n");
        }
        
        //TESTANDO o DELETE
        Usuario u = new Usuario(2, "eliomar", "31231");
//        boolean retorno = UsuarioDAO.delete(u);
//        if(retorno == false){
//            System.out.println("Não deletou!!!");
//        }else{
//            System.out.println("Deletado com sucesso!!!");
//        }

        //TESTANDO UPDATE
        //UsuarioDAO.update(u);

        //TESTANDO INSERT
//        Usuario u2 = new Usuario(0, "Maria", "887272");
//        UsuarioDAO.insert(u2);
    }
}
