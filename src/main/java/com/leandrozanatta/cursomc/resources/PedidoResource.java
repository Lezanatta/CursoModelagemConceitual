package com.leandrozanatta.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leandrozanatta.cursomc.domain.Pedido;
import com.leandrozanatta.cursomc.services.PedidoService;

//CLASSE RESPONSÁVEL POR CONTROLAR AS INSTANCIAS 
@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	//DEPENDENCIA PARA ACESSAR OS SERVICOS
	@Autowired
	private PedidoService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

		//UTILIZANDO O METODO DA CLASSE DE SERVICOS PARA BUSCAR OS DADOS
		Pedido obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);

	}

}
