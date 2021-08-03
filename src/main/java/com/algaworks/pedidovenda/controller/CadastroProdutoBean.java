package com.algaworks.pedidovenda.controller;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.algaworks.pedidovenda.model.Produto;

@ManagedBean
@ViewScoped
public class CadastroProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Produto produto;
	
	
	public CadastroProdutoBean() {
		produto = new Produto();
	}
	
		
	public void salvar() {
		
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
	