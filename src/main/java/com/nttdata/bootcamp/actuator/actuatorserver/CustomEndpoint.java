package com.nttdata.bootcamp.actuator.actuatorserver;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "customEndPoint")
/**
 * Clase CustomEndPoint
 * @author jramlope
 *
 */
public class CustomEndpoint {

	@GetMapping("/random")
	/**
	 * Método customEndpoint
	 * @return
	 */
	public ResponseEntity<String> customEndpoint(){
		return new ResponseEntity<>("Something from my controller", HttpStatus.OK);
	}
	
}
