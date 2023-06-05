package io.github.josepaulo.crud.repositories;

import io.github.josepaulo.crud.DTO.ClientDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import io.github.josepaulo.crud.model.Client;

public interface ClientRepository extends JpaRepository<ClientDTO, Long>  {

}
