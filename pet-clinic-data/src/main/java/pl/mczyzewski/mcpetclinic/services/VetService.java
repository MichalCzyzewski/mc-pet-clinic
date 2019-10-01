package pl.mczyzewski.mcpetclinic.services;

import pl.mczyzewski.mcpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
