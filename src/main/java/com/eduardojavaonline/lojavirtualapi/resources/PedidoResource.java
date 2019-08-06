package com.eduardojavaonline.lojavirtualapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eduardojavaonline.lojavirtualapi.model.entity.Pedido;
import com.eduardojavaonline.lojavirtualapi.model.service.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

	@Autowired
	private PedidoService pedidoService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Pedido> findById(@PathVariable Long id) {
		Pedido pedidoRetornado = pedidoService.findById(id);
		return ResponseEntity.ok().body(pedidoRetornado);
	}
}
