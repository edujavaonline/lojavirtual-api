package com.eduardojavaonline.lojavirtualapi.model.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.eduardojavaonline.lojavirtualapi.model.entity.enums.EstadoPagamento;

@Entity
@Table(name = "tb_pagamento_boleto")
public class PagamentoComBoleto extends Pagamento{
	
	private static final long serialVersionUID = 1L;

	private Date dataPagamento;
	
	private Date dataVencimento;
	
	public PagamentoComBoleto() {}	

	public PagamentoComBoleto(Long id, EstadoPagamento estadoPagamento, Pedido pedido, Date dataPagamento, Date dataVencimento) {
		super(id, estadoPagamento, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
		
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
}
