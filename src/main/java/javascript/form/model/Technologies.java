package javascript.form.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="technologies")
public class Technologies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long techid;
	private String language;

}
