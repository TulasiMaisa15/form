package javascript.form.service;

import java.util.List;

import javascript.form.model.Register;
import javascript.form.model.Technologies;

public interface RegisterService {

	public List<Register> findAll();

	public Register saveForm(Register register);
	
	public List<Technologies> getAll();
	
//	public Technologies saveTech(Technologies technologies);

}
