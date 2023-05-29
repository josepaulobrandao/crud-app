package io.github.josepaulo.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.josepaulo.crud.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>  {

}
