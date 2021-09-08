package com.leandrozanatta.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandrozanatta.cursomc.domain.Pedido;
import com.leandrozanatta.cursomc.repositories.*;

//PACOTE RESPONSÁVEL POR ATENDER O CONTROLADOR QUE ESTÁ RELACIONADO A CLASSE DE DOMINIO
@Service
public class PedidoService {
	//DEPENDENCIA PARA ACESSAR OS DADOS
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id){
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new com.leandrozanatta.cursomc.services.exceptions.ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
