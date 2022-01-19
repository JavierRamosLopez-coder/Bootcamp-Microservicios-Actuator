package com.nttdata.bootcamp.actuator.actuatorserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
/**
 * Clase TestController
 * 
 * @author jramlope
 *
 */
public class TestController {

	/** Creación de un objeto de la clase Counter **/
	private Counter counter;

	/**
	 * Constructor TestController encargado de inicializar la variable previamente
	 * creada
	 * 
	 * @param registry
	 */
	public TestController(MeterRegistry registry) {
		this.counter = Counter.builder("invocaciones.hello").description("Invocaciones totales").register(registry);

	}

	@GetMapping(path = "/helloWorld")
	/**
	 * Método que devolverá una cadena de caracteres
	 * 
	 * @return
	 */
	public String helloWorld() {

		// Llamada al método increment de la clase Counter para su incrementación
		counter.increment();
		return "Hello world";
	}

}
