package pl.mczyzewski.mcpetclinic.services.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.mczyzewski.mcpetclinic.repositories.OwnerRepository;
import pl.mczyzewski.mcpetclinic.services.OwnerService;
@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    OwnerRepository ownerRepository;

    OwnerService ownerService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByLastName() {
    }

    @Test
    void findAll() {
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
}