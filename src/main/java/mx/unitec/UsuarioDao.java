package mx.unitec;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioDao extends CrudRepository<Usuario, Integer> {

    List<Usuario> findAll();


}
