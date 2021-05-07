package org.generation.BlogPessoal.controllers;

import java.util.List;

import org.generation.BlogPessoal.model.Postagem;
import org.generation.BlogPessoal.repository.PostagemRepository;
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

@RestController // define um controller
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*") // recebe de qualquer coisa
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping // pega todos os dados
	public ResponseEntity<List<Postagem>> GetAll() {
		
		return ResponseEntity.ok(repository.findAll());
	};
	
	@GetMapping("/id/{id}") // pega os dados do id
	public ResponseEntity<Postagem> GetById(@PathVariable long id) {
		
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}") // pega os dados pelo titulo
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo) {
		
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping // posta pelo body
	public ResponseEntity<Postagem> post (@RequestBody Postagem postagem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	
	@PutMapping // atualiza o dado pelo body
	public ResponseEntity<Postagem> put (@RequestBody Postagem put) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(put));
	}
	
	@DeleteMapping("/delete/{id}") // Deleta o dado pelo id
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
}
