package com.gamesMercury.LojaMercury.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamesMercury.LojaMercury.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

	public List<Produtos> findAllBySinopseContainingIgnoreCase(String sinopse);
}
