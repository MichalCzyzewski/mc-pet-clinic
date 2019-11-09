package pl.mczyzewski.mcpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.mczyzewski.mcpetclinic.model.Owner;
import pl.mczyzewski.mcpetclinic.services.OwnerService;

import java.util.HashSet;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

    @Mock
    OwnerService ownerService;
    @InjectMocks
    OwnerController controller;

    Set<Owner> owners;

    @BeforeEach
    void setUp() {

        owners = new HashSet<>();
    }

    @Test
    void listOwners() {
    }

    @Test
    void findOwners() {
    }
}