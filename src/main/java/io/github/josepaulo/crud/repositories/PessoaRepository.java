package io.github.josepaulo.crud.repositories;

import io.github.josepaulo.crud.DTO.ClientDTO;
import io.github.josepaulo.crud.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>  {

}
