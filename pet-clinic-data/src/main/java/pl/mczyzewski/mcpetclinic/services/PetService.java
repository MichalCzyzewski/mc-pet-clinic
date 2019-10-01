package pl.mczyzewski.mcpetclinic.services;

import pl.mczyzewski.mcpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet  > findAll();
}
