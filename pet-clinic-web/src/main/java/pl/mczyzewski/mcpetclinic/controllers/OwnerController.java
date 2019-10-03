package pl.mczyzewski.mcpetclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mczyzewski.mcpetclinic.services.CrudService;
import pl.mczyzewski.mcpetclinic.services.OwnerService;

@Controller
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
    public String listOfOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }
}
