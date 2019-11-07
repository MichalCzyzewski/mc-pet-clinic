package pl.mczyzewski.mcpetclinic.services.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.mczyzewski.mcpetclinic.model.Owner;
import pl.mczyzewski.mcpetclinic.repositories.OwnerRepository;
import pl.mczyzewski.mcpetclinic.repositories.PetRepository;
import pl.mczyzewski.mcpetclinic.repositories.PetTypeRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRepository petTypeRepository;
    @InjectMocks
    OwnerSDJpaService ownerService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByLastName() {

        Owner returnOwner = Owner.builder().id(1L).lastName("Kowalsky").build();
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);
        Owner kowalsky = ownerService.findByLastName("kowalsky");

        assertEquals("kowalsky",kowalsky.getLastName());
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