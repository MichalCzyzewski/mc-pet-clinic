package pl.mczyzewski.mcpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.mczyzewski.mcpetclinic.model.Owner;
import pl.mczyzewski.mcpetclinic.model.Vet;
import pl.mczyzewski.mcpetclinic.services.OwnerService;
import pl.mczyzewski.mcpetclinic.services.VetService;
import pl.mczyzewski.mcpetclinic.services.map.OwnerServiceMap;
import pl.mczyzewski.mcpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Matt");
        owner1.setLastName("Scott");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setLastName("Tom");
        owner2.setLastName("Philips");

        ownerService.save(owner2);

        System.out.println("Loading Owners ...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Monica");
        vet1.setLastName("Foo");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setLastName("Vanessa");
        vet2.setLastName("Mea");

        vetService.save(vet2);

        System.out.println("Loading Vets ...");
    }
}
