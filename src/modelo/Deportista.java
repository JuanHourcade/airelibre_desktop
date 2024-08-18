package modelo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Deportista extends Usuario{

	boolean esProfesional;
	@OneToMany(mappedBy = "deportista")
	private List<Inscripcion> inscripciones;
}
