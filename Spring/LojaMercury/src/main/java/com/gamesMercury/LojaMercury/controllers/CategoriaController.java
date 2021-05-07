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

import com.gamesMercury.LojaMercury.model.Categoria;
import com.gamesMercury.LojaMercury.repository.CategoriaRepository;

@RestController // Define o controller
@RequestMapping("/categoria") // Define o caminho
@CrossOrigin(origins = "*", allowedHeaders = "*") // Define quem pode acessar
public class CategoriaController {

	@Autowired // define a instância do repository
	private CategoriaRepository repository; 
	
	@GetMapping // pega todos os dados
	public ResponseEntity<List<Categoria>> GetAll () {
		
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/id{id}") // Pega dados pelo id
	public ResponseEntity<Categoria> GetById(@PathVariable long id) {
		
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}") // pega dados pelo nome
	public ResponseEntity<List<Categoria>> GetByNome(@PathVariable String nome) {
		
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> post (@RequestBody Categoria categoria) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> put (@RequestBody Categoria categoria) {
		
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}
	
	@DeleteMapping("/delete/{id}") // Deleta o dado pelo id
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	} 
}
