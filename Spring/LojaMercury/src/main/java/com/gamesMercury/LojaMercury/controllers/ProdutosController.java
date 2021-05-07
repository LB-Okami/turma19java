package com.gamesMercury.LojaMercury.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gamesMercury.LojaMercury.model.Produtos;
import com.gamesMercury.LojaMercury.repository.ProdutosRepository;

@RestController // define o controller
@RequestMapping("/produtos") // define a URI
@CrossOrigin(origins = "*", allowedHeaders = "*") // Define por quem pode ser acessado
public class ProdutosController {
	
	@Autowired
	private ProdutosRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produtos>> GetAll () {
		
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/id/{id}") // Pega dados pelo id
	public ResponseEntity<Produtos> GetById(@PathVariable long id) {
		
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/sinopse/{sinopse}") // pega dados pelo nome
	public ResponseEntity<List<Produtos>> GetBySinopse(@PathVariable String sinopse) {
		
		return ResponseEntity.ok(repository.findAllBySinopseContainingIgnoreCase(sinopse));
	}
	
	@PostMapping
	public ResponseEntity<Produtos> post (@RequestBody Produtos produto) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<Produtos> put (@RequestBody Produtos produtos) {
		
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produtos));
	}
	
	@DeleteMapping("/delete/{id}") // Deleta o dado pelo id
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	} 
}
