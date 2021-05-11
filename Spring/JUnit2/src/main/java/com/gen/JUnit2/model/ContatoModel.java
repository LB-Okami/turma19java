package com.gen.JUnit2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "tb_contato")
public class ContatoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	
	@NotEmpty(message = "Insira um nome")
	private String nome;
	
	@NotEmpty(message = "Insira um cpf")
	private String cpf;
	
	@NotEmpty(message = "Insira um telefone")
	private String telefone;

	// Construtores
	
	public ContatoModel(String nome, String cpf, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public ContatoModel() {
	}

	// Getters/Setters
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}	
}
