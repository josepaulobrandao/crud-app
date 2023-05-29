package io.github.josepaulo.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	
}
