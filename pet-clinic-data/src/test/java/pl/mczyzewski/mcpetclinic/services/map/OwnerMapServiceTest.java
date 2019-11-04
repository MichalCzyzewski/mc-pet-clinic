package pl.mczyzewski.mcpetclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.mczyzewski.mcpetclinic.model.Owner;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

class OwnerMapServiceTest {


    OwnerMapService ownerMapService;


    final Long ownerId = 1L;
    final String lastName = "Kowalsky";

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());

        ownerMapService.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    void findAll() {

        Set<Owner> ownerSet = ownerMapService.findAll();
        assertEquals(1,ownerSet.size());
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void findByLastName() {
    }

    @Test
    void testFindAll() {
    }

    @Test
    void testFindById() {
    }

    @Test
    void testSave() {
    }

    @Test
    void testDelete() {
    }

    @Test
    void testDeleteById() {
    }

    @Test
    void testFindByLastName() {
    }
}