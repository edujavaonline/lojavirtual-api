package com.eduardojavaonline.lojavirtualapi.model.dto;

import java.io.Serializable;

import com.eduardojavaonline.lojavirtualapi.model.entity.Categoria;

public class CategoriaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String descricao;
	
	public CategoriaDTO() {}
	
	public CategoriaDTO(Categoria categoria) {
		this.id = categoria.getId();
		this.descricao = categoria.getDescricao();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
