package com.desafio.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.apirest.models.Endereco;


public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
		
	Endereco findById(long id);
	
	Endereco deleteById(Endereco id);
	
}
