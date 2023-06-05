package io.github.josepaulo.crud.repositories;

import io.github.josepaulo.crud.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long>  {

}
