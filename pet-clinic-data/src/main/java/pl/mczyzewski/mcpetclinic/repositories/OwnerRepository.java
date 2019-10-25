package pl.mczyzewski.mcpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mczyzewski.mcpetclinic.model.Owner;

public interface OwnerRepository  extends CrudRepository<Owner,Long> {

    Owner findAllByLastName(String lastName);
}
