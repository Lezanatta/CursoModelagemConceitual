package com.leandrozanatta.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leandrozanatta.cursomc.domain.ItemPedido;

//INTERFACE RESPONSÁVEL POR ACESSADO A DADOS 
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido,Integer>{

}
