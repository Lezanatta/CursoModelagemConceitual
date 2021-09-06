package com.leandrozanatta.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandrozanatta.cursomc.domain.Categoria;
import com.leandrozanatta.cursomc.domain.Cliente;
import com.leandrozanatta.cursomc.repositories.*;

import javassist.tools.rmi.ObjectNotFoundException;

//PACOTE RESPONSÁVEL POR ATENDER O CONTROLADOR QUE ESTÁ RELACIONADO A CLASSE DE DOMINIO
@Service
public class ClienteService {
	//DEPENDENCIA PARA ACESSAR OS DADOS
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id){
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new com.leandrozanatta.cursomc.services.exceptions.ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
