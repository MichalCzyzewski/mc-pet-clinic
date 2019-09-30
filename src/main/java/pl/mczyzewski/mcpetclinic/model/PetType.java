package pl.mczyzewski.mcpetclinic.model;

import org.springframework.context.annotation.Primary;

public class PetType {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
