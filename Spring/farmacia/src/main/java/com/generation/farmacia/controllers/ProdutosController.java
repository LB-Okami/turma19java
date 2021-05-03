package com.generation.farmacia.controllers;

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

import com.generation.farmacia.model.Categoria;
import com.generation.farmacia.model.Produtos;
import com.generation.farmacia.repository.ProdutosRepository;

@RestController // Define um controller
@RequestMapping("/produtos") // Define o caminho
@CrossOrigin("*") // Define de qual origem irá aceitar
public class ProdutosController {
	
	@Autowired
	private ProdutosRepository repository;
	
	@GetMapping // pega todos os dados
	public ResponseEntity<List<Produtos>> GetAll() {
		
		return ResponseEntity.ok(repository.findAll());
	};
	
	@GetMapping("/id/{id}") // pega dados pelo id
	public ResponseEntity<Produtos> GetById(@PathVariable long id) {
		
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("{nome}") // pega dados pelo nome
	public ResponseEntity<List<Produtos>> GetByNome(@PathVariable String nome) {
		
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Produtos> post (@RequestBody Produtos produto) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<Produtos> put (@RequestBody Produtos put) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(put));
	}
	
	@DeleteMapping("/delete/{id}") // Deleta o dado pelo id
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	} 
}
