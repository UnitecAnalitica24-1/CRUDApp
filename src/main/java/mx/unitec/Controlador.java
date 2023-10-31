package mx.unitec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Controlador {

    @Autowired
    private UsuarioDao usuarioDao;

}
