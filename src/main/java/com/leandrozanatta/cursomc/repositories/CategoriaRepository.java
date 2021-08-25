package com.leandrozanatta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leandrozanatta.cursomc.domain.Categoria;

//INTERFACE RESPONSÁVEL POR ACESSADO A DADOS 
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer>{

}
