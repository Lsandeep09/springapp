package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class Controller {
	
	@GetMapping("/wel")
	public ResponseEntity<String> showWelcomeMessage() {
		return new ResponseEntity<String>("welcome to spring Boot Rest",HttpStatus.OK);

	}

}
