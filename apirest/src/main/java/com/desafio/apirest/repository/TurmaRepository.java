package com.desafio.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.apirest.models.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long>{
		
	Turma findById(long id);
	
	Turma deleteById(long id);
}
