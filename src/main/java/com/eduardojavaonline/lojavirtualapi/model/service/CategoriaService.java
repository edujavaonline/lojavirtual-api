package com.eduardojavaonline.lojavirtualapi.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardojavaonline.lojavirtualapi.model.entity.Categoria;
import com.eduardojavaonline.lojavirtualapi.model.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria findById(Long id) {
		Optional<Categoria> categoriaRetornada = categoriaRepository.findById(id);
		return categoriaRetornada.orElse(null);
	}
}
