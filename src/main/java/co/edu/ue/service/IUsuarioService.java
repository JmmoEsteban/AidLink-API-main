package co.edu.ue.service;

import java.util.List;
import co.edu.ue.entity.Usuario;

public interface IUsuarioService {
    List<Usuario> addUser(Usuario user);
    Usuario UpdateDato(Usuario user);
    Usuario desactivarUsuario(int id);
    List<Usuario> listAll();
    List<Usuario> listActivos();
    Usuario FindID(int id);
    Usuario FindCorreo(String correo);
}
