package proyectoEjemplo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {
	String msg = "Bienvenido a Spring MVC!";
 
	@RequestMapping("/hola")
	public ModelAndView showMessage(
			@RequestParam(value = "nombre", required = false, defaultValue = "mundo") String nombre) {
		System.out.println("en el controlador");
 
		ModelAndView mv = new ModelAndView("holamundo");
		mv.addObject("msg", msg);
		mv.addObject("nombre", nombre);
		return mv;
	}
}