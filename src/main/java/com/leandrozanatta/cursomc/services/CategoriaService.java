package com.leandrozanatta.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandrozanatta.cursomc.domain.Categoria;
import com.leandrozanatta.cursomc.repositories.*;

//PACOTE RESPONSÁVEL POR ATENDER O CONTROLADOR QUE ESTÁ RELACIONADO A CLASSE DE DOMINIO
@Service
public class CategoriaService {
	//DEPENDENCIA PARA ACESSAR OS DADOS
	@Autowired
	private CategoriaRepository repo;
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
