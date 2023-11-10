package mx.unitec;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


// Data Access Object
@Repository
public interface UsuarioDao extends CrudRepository<Usuario, Integer> {


    List<Usuario> findAll();


}
