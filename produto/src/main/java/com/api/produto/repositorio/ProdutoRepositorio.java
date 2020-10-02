package com.api.produto.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.api.produto.modelo.ProdutoModelo;

public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo,Integer>{
	
	//Listar todos os produtos
	List<ProdutoModelo> findAll();

	//Pesquisar por cógigo
	ProdutoModelo findByCodigo(int codigo);
	
	//Remover produto
	void delete (ProdutoModelo produto);
	
	//Cadastrar/Alterar Produto
	//ProdutoModelo save(ProdutoModelo produto);
	<ProdMod extends ProdutoModelo> ProdMod save(ProdMod produto);
}
