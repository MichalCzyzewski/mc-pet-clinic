package pl.mczyzewski.mcpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.mczyzewski.mcpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long  > {
}
