package com.eduardojavaonline.lojavirtualapi.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardojavaonline.lojavirtualapi.model.entity.Produto;
import com.eduardojavaonline.lojavirtualapi.model.repository.ProdutoRepository;
import com.eduardojavaonline.lojavirtualapi.model.service.exception.ObjectNotFoundException;
import com.eduardojavaonline.lojavirtualapi.util.Messages;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto findById(Long id) {
		Optional<Produto> produtoRetornado = produtoRepository.findById(id);
		return produtoRetornado.orElseThrow(
				() -> new ObjectNotFoundException(Messages.MSG_OBJECT_NOT_FOUND.replace("?", "Produto")));
	}

}
