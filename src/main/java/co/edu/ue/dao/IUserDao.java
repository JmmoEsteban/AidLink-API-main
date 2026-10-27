package co.edu.ue.dao;

import java.util.List;
import co.edu.ue.entity.Usuario;

public interface IUserDao {
    List<Usuario> GuardarUser(Usuario user);
    Usuario ActualizarUser(Usuario user);
    Usuario desactivarUsuario(int id);
    List<Usuario> listaCompleta();
    List<Usuario> listaActiva();
    Usuario BuscarID(int id);
    Usuario BuscarCorreo(String correo);
}
