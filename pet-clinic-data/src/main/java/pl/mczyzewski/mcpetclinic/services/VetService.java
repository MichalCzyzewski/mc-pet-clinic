package pl.mczyzewski.mcpetclinic.services;

import pl.mczyzewski.mcpetclinic.model.Owner;
import pl.mczyzewski.mcpetclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet,Long>  {

    @Override
    default Set<Vet> findAll() {
        return null;
    }

    @Override
    default Vet findById(Long aLong) {
        return null;
    }

    @Override
    default Vet save(Vet object) {
        return null;
    }

    @Override
    default void delete(Vet object) {

    }

    @Override
    default void deleteById(Long aLong) {

    }
}
