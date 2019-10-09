package pl.mczyzewski.mcpetclinic.services;

import pl.mczyzewski.mcpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
