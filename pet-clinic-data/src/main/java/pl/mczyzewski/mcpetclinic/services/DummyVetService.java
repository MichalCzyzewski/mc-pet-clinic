package pl.mczyzewski.mcpetclinic.services;

import org.springframework.stereotype.Component;
import pl.mczyzewski.mcpetclinic.model.Vet;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Component
public class DummyVetService implements VetService {

    private Long curId = 1L;
    private Map<Long, Vet> vets;

    @PostConstruct
    private void init() {
        vets = new HashMap<>();

        Vet vet1 = new Vet("Dr", "Doolittle");
        vet1.setId(curId++);

        Vet vet2 = new Vet("Mr", "Crabs");
        vet2.setId(curId++);

        vets.put(vet1.getId(), vet1);
        vets.put(vet2.getId(), vet2);
    }

    @Override
    public Set<Vet> findAll() {
        return new HashSet<>(vets.values());
    }

    @Override
    public Vet findById(Long aLong) {
        return vets.get(aLong);
    }

    @Override
    public Vet save(Vet object) {
        Long id = curId++;
        vets.put(curId, object);
        object.setId(id);

        return object;
    }

    @Override
    public void delete(Vet object) {
        vets.remove(object.getId());
    }

    @Override
    public void deleteById(Long aLong) {
        vets.remove(aLong);
    }
}
