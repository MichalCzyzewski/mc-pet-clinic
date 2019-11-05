package pl.mczyzewski.mcpetclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.mczyzewski.mcpetclinic.model.Owner;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

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
        Owner owner = ownerMapService.findById(ownerId);
        assertEquals(ownerId,owner.getId());

    }

    @Test
    void saveExistingId() {
        Long id = 2L;
        Owner owner2 = Owner.builder().id(ownerId).build();
        Owner saveOwner = ownerMapService.save(owner2);

        assertEquals(id,saveOwner.getId());

    }

    @Test
    void saveNoId() {

        Owner ownerSave = ownerMapService.save(Owner.builder().build());
        assertNotNull(ownerSave);
        assertNotNull(ownerSave.getId());
    }

    @Test
    void delete() {

        ownerMapService.delete(ownerMapService.findById(ownerId));

        assertEquals(0,ownerMapService.findAll().size());
    }

    @Test
    void deleteById() {

        ownerMapService.deleteById(ownerId);
        assertEquals(0,ownerMapService.findAll().size());
    }

    @Test
    void findByLastName() {

        Owner kowalsky = ownerMapService.findByLastName(lastName);
        assertNotNull(kowalsky);
        assertEquals(ownerId,kowalsky.getId());
    }

    @Test
    void findByLastNameNotFound() {

        Owner kowalsky = ownerMapService.findByLastName("foo");
        assertNull(kowalsky);
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