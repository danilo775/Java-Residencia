package com.springAngular.springAngular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springAngular.springAngular.model.ClienteModel;
import com.springAngular.springAngular.repository.ClienteRepository;

@CrossOrigin(origins = "*")
@RestController
public class ClienteController {
	
	@Autowired
	private  ClienteRepository repository;
	
	
	
	@PostMapping("/")
	public ClienteModel cadastrar(@RequestBody ClienteModel c) {	
		return repository.save(c);
	}
	
//	@GetMapping("/")
//	public String test() {
//		return "Greetings from Spring Boot!";
//	}
	
	@GetMapping("/")
	public Iterable<ClienteModel> listar() {
		return repository.findAll();
	}
	@GetMapping("/listar/{id}")
	public ClienteModel buscar(@RequestBody long id) {
		return repository.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/")
	public void atualizar( @RequestBody ClienteModel c) {		
		repository.save(c);
	}
}
