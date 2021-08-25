package com.leandrozanatta.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leandrozanatta.cursomc.domain.Categoria;
import com.leandrozanatta.cursomc.services.CategoriaService;

//CLASSE RESPONSÁVEL POR CONTROLAR AS INSTANCIAS 
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	//DEPENDENCIA PARA ACESSAR OS SERVICOS
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		//UTILIZANDO O METODO DA CLASSE DE SERVICOS PARA BUSCAR OS DADOS
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

}
