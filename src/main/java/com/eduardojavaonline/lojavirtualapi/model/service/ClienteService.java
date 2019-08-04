package com.eduardojavaonline.lojavirtualapi.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardojavaonline.lojavirtualapi.model.entity.Cliente;
import com.eduardojavaonline.lojavirtualapi.model.repository.ClienteRepository;
import com.eduardojavaonline.lojavirtualapi.model.service.exception.ObjectNotFoundException;
import com.eduardojavaonline.lojavirtualapi.util.Messages;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente findById(Long id) {
		Optional<Cliente> clienteRetornado = clienteRepository.findById(id);
		return clienteRetornado.orElseThrow(
				() -> new ObjectNotFoundException(Messages.MSG_OBJECT_NOT_FOUND.replace("?", "Cliente")));
	}
}
