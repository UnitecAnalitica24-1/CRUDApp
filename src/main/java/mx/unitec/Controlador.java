package mx.unitec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping("/home")
    public ModelAndView home() {
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/guardarUsuario", method = RequestMethod.POST)
    public ModelAndView guardarUsuario() {
        return new ModelAndView("guardarUsuario");
    }


}
