package io.github.josepaulo.crud.DTO;

import io.github.josepaulo.crud.model.Client;
import io.github.josepaulo.crud.model.Pessoa;


public class ClientDTO extends Pessoa {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String email;

    public ClientDTO () {

    }

    public ClientDTO(Client obj) {
        this.id = obj.getId();
        this.name = obj.getNome();
        this.email = obj.getEmail();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
