package com.eduardojavaonline.lojavirtualapi.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardojavaonline.lojavirtualapi.model.entity.Pedido;
import com.eduardojavaonline.lojavirtualapi.model.repository.PedidoRepository;
import com.eduardojavaonline.lojavirtualapi.model.service.exception.ObjectNotFoundException;
import com.eduardojavaonline.lojavirtualapi.util.Messages;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido findById(Long id) {
		Optional<Pedido> pedidoRetornado = pedidoRepository.findById(id);
		return pedidoRetornado.orElseThrow(
				() -> new ObjectNotFoundException(Messages.MSG_OBJECT_NOT_FOUND.replace("?", "Pedido")));
	}

}
