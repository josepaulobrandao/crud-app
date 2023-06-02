package io.github.josepaulo.crud.controller;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.github.josepaulo.crud.model.Client;
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
	public ResponseEntity<Client> create(@RequestBody Client client) {
	Client newClient = clientRepository.save(client);
	return ResponseEntity.ok(newClient);

	}
	
}
