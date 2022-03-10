package com.desafio.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.apirest.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
		
	Aluno findById(long id);
	
	Aluno deleteById(long id);
}
