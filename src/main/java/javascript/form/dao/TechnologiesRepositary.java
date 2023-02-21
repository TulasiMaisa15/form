package javascript.form.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import javascript.form.model.Technologies;

public interface TechnologiesRepositary extends JpaRepository<Technologies, Long> {

}
