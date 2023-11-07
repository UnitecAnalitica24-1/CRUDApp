package mx.unitec;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "docente_usuarios")
public class Usuario {
    @Id  // @Id especifica que este campo es la llave primaria
    private int idUsuario;
}