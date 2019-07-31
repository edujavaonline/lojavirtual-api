package com.eduardojavaonline.lojavirtualapi.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eduardojavaonline.lojavirtualapi.model.entity.Categoria;
import com.eduardojavaonline.lojavirtualapi.model.service.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Categoria> findById(@PathVariable Long id) {
		Categoria categoriaRetornada = categoriaService.findById(id);		
		return ResponseEntity.ok().body(categoriaRetornada);
	}

}
