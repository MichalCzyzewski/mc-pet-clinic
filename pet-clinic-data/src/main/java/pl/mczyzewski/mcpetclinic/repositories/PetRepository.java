package pl.mczyzewski.mcpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mczyzewski.mcpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet , Long> {
}
