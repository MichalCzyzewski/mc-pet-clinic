package pl.mczyzewski.mcpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mczyzewski.mcpetclinic.model.Owner;
import pl.mczyzewski.mcpetclinic.model.PetType;
import pl.mczyzewski.mcpetclinic.services.OwnerService;
import pl.mczyzewski.mcpetclinic.services.PetService;
import pl.mczyzewski.mcpetclinic.services.PetTypeService;

import java.util.Collection;


@Controller
@RequestMapping("/owners/{")
public class PetController {

    private static final String VIEWS_PETS_CREATE_OR_UPDATE_FORM = "pets/createOrUpdatePetForm";

    private final PetService petService;

    private final OwnerService ownerService;

    private final PetTypeService petTypeService;

    public PetController(PetService petService, OwnerService ownerService, PetTypeService petTypeService) {
        this.petService = petService;
        this.ownerService = ownerService;
        this.petTypeService = petTypeService;
    }

    @ModelAttribute("types")
    public Collection <PetType> populatePetType(){
        return this.petTypeService.findAll();
    }
@ModelAttribute("owner")
    public Owner findOwner(@PathVariable("owner") Long ownerId){
        return this.ownerService.findById(ownerId);
    }
@ModelAttribute("owner")
    public void initOwnerBinder(WebDataBinder dataBinder){
        dataBinder.setDisallowedFields();
    }
}

