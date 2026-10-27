package co.edu.ue.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.ue.entity.Usuario;

public interface IUsuarioJPA extends JpaRepository<Usuario, Integer> {
    Usuario findByCorreo(String correo);
    List<Usuario> findByEstado(int estado);
}
