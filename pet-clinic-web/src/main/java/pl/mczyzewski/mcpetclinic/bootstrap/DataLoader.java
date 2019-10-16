package pl.mczyzewski.mcpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.mczyzewski.mcpetclinic.model.*;
import pl.mczyzewski.mcpetclinic.services.OwnerService;
import pl.mczyzewski.mcpetclinic.services.PetTypeService;
import pl.mczyzewski.mcpetclinic.services.SpecialtyService;
import pl.mczyzewski.mcpetclinic.services.VetService;

import java.time.LocalDate;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatType = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty savedRadiology =  specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        radiology.setDescription("Surgery");
        Specialty savedSurgery =  specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        radiology.setDescription("Dentistry");
        Specialty savedDentistry =  specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 HopeStreet");
        owner1.setCity("London");
        owner1.setTelephone("666777888");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(saveDogType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Fluffy");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("33 BoomAvenue");
        owner2.setCity("London");
        owner2.setTelephone("666777888");

        Pet fionaCat = new Pet();
        fionaCat.setName("Fetch");
        fionaCat.setPetType(saveCatType);
        fionaCat.setOwner(owner2);
        fionaCat.setBirthDate(LocalDate.now());
        owner2.getPets().add(fionaCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialties().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialties().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
