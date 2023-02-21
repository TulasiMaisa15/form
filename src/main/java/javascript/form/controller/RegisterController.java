 package javascript.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javascript.form.model.Register;
import javascript.form.model.Technologies;
import javascript.form.service.RegisterService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/form")
public class RegisterController {

	@Autowired
	private RegisterService registerService;

	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public ResponseEntity<List<Register>> getAll() {
		List<Register> register = null;
		register = registerService.findAll();
		return ResponseEntity.ok(register);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<Register> saveForm(@RequestBody Register register) {
		 register = registerService.saveForm(register);
		return new ResponseEntity<Register>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/dropdown", method=RequestMethod.GET)
	public ResponseEntity<List<Technologies>> findAll(){
		List<Technologies> tech=null;
		tech=registerService.getAll();
		return ResponseEntity.ok(tech);
		}
	
}
