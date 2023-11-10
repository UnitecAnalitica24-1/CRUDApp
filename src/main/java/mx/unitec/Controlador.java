package mx.unitec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Controlador {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping("/home")
    public ModelAndView home() {
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/guardarUsuario", method = RequestMethod.POST)
    public ModelAndView guardarUsuario(@ModelAttribute("usuarioFormulario") Usuario usuarioFormulario) {

        // Buscando si el usuario ya existe
        Usuario usuarioExistente = usuarioDao.findById(usuarioFormulario.getIdUsuario()).orElse(null);

        String respuesta;

        if(usuarioExistente == null) {
            // Guardo el usuario en la BD
            usuarioDao.save(usuarioFormulario);
            respuesta = "Usuario creado exitosamente";
        } else {
            // Mandar mensaje de error
            respuesta = "El ID de usuario ya está en uso, intente con otro";
        }

        // Agregar al modelo de la página, la variable que acabo de crear arriba
        ModelAndView view = new ModelAndView("guardarUsuario");
        view.addObject("respuesta", respuesta);
        return view;



    }

    @RequestMapping("/listaUsuarios")
    public ModelAndView listaUsuarios() {
        List<Usuario> listaUsuarios = usuarioDao.findAll();

        ModelAndView view = new ModelAndView("listaUsuarios");
        view.addObject("listaUsuarios", listaUsuarios);
        return view;
    }

}
