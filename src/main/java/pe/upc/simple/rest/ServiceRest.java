package pe.upc.simple.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServiceRest {

	@GetMapping("/hola")
	public String obtenerDato() {
		return "Hello World";
	}
}
