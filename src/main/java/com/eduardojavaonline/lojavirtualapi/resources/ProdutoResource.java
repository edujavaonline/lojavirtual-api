package com.eduardojavaonline.lojavirtualapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eduardojavaonline.lojavirtualapi.model.entity.Produto;
import com.eduardojavaonline.lojavirtualapi.model.service.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Produto> findById(@PathVariable Long id) {
		Produto produtoRetornado = produtoService.findById(id);
		return ResponseEntity.ok().body(produtoRetornado);
	}
}
