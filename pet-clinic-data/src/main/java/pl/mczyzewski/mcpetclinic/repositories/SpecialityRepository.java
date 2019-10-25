package pl.mczyzewski.mcpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mczyzewski.mcpetclinic.model.Specialty;

public interface SpecialityRepository extends CrudRepository<Specialty,Long> {
}
