package javascript.form.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import javascript.form.model.Register;

public interface RegisterRepositary extends JpaRepository<Register, Long> {
	
	 Register findByEmail(String email);

}
		