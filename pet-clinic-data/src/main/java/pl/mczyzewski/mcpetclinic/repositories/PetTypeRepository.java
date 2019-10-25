package pl.mczyzewski.mcpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mczyzewski.mcpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
