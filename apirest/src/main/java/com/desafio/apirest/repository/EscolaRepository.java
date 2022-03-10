package com.desafio.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.apirest.models.Escola;


public interface EscolaRepository extends JpaRepository<Escola, Long>{
		
	Escola findById(long id);
	
	Escola deleteById(long id);
}
