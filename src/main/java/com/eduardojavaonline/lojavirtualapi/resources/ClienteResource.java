package com.eduardojavaonline.lojavirtualapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eduardojavaonline.lojavirtualapi.model.entity.Cliente;
import com.eduardojavaonline.lojavirtualapi.model.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET )
	public ResponseEntity<Cliente> findById(@PathVariable Long id) {
		Cliente clienteRetornado = clienteService.findById(id);
		return ResponseEntity.ok().body(clienteRetornado);
	}
}
