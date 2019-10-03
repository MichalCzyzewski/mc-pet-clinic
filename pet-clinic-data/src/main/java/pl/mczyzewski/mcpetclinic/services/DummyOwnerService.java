package pl.mczyzewski.mcpetclinic.services;

import org.springframework.stereotype.Component;
import pl.mczyzewski.mcpetclinic.model.Owner;

import javax.annotation.PostConstruct;
import java.util.*;

@Component
public class DummyOwnerService implements OwnerService {

    private Long curId = 1L;
    private Map<Long, Owner> owners;

    @PostConstruct
    private void init() {
        owners = new HashMap<>();

        Owner owner1 = new Owner("Max", "Smith");
        owner1.setId(curId++);

        Owner owner2 = new Owner("John", "Doe");
        owner2.setId(curId++);

        owners.put(owner1.getId(), owner1);
        owners.put(owner2.getId(), owner2);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return owners.values().stream().filter(owner -> Objects.equals(owner.getLastName(), lastName)).findAny().orElse(null);
    }

    @Override
    public Set<Owner> findAll() {
        return new HashSet<>(owners.values());
    }

    @Override
    public Owner findById(Long aLong) {
        return owners.get(aLong);
    }

    @Override
    public Owner save(Owner object) {
        Long id = curId++;
        owners.put(curId, object);
        object.setId(id);

        return object;
    }

    @Override
    public void delete(Owner object) {
        owners.remove(object.getId());
    }

    @Override
    public void deleteById(Long aLong) {
        owners.remove(aLong);
    }
}
