package pl.mczyzewski.mcpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mczyzewski.mcpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
