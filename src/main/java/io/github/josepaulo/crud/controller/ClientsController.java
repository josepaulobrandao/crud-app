package io.github.josepaulo.crud.controller;

import java.util.List;

import io.github.josepaulo.crud.DTO.ClientDTO;
import io.github.josepaulo.crud.model.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.github.josepaulo.crud.repositories.ClientRepository;

@RestController
@RequestMapping("clients")
public class ClientsController {

	private ClientRepository clientRepository;

	public ClientsController(ClientRepository clientRepository) {
		super();
		this.clientRepository = clientRepository;
	}
	@GetMapping
	public List<Client> getClient() {
		return clientRepository.findAll();
	}

	@PostMapping
	public ResponseEntity<ClientDTO> create(@RequestBody ClientDTO clientDTO) {
	return ResponseEntity.ok().body(new ClientDTO(clientDTO, HttpStatus.CREATED));

	}
	
}
