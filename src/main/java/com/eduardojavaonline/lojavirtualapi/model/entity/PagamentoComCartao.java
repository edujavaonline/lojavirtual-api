package com.eduardojavaonline.lojavirtualapi.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.eduardojavaonline.lojavirtualapi.model.entity.enums.EstadoPagamento;

@Entity
@Table(name = "tb_pagamento_cartao")
public class PagamentoComCartao extends Pagamento{

	private static final long serialVersionUID = 1L;
	
	private Integer quantidadeParcelas;
	
	public PagamentoComCartao() {}	
	

	public PagamentoComCartao(Long id, EstadoPagamento estadoPagamento, Pedido pedido, Integer quantidadeParcelas) {
		super(id, estadoPagamento, pedido);
		this.quantidadeParcelas = quantidadeParcelas;
	}

	public Integer getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public void setQuantidadeParcelas(Integer quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}
}
