package javascript.form.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javascript.form.dao.RegisterRepositary;
import javascript.form.dao.TechnologiesRepositary;
import javascript.form.model.Register;
import javascript.form.model.Technologies;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterRepositary registerRepositary;

	@Autowired
	private TechnologiesRepositary technolgiesRepositary;

	@Override
	public List<Register> findAll() {
		return registerRepositary.findAll();

	}

	@Override
	public Register saveForm(Register register) {
		Register reg = registerRepositary.findByEmail(register.getEmail());
		if (reg == null) {
			return registerRepositary.save(register);
		} else {
			return null;
		}
	}

	@Override
	public List<Technologies> getAll() {
		return technolgiesRepositary.findAll();
	}

}
