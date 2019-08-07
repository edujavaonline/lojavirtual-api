package com.eduardojavaonline.lojavirtualapi.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.eduardojavaonline.lojavirtualapi.model.entity.Categoria;
import com.eduardojavaonline.lojavirtualapi.model.repository.CategoriaRepository;
import com.eduardojavaonline.lojavirtualapi.model.service.exception.ObjectNotFoundException;
import com.eduardojavaonline.lojavirtualapi.util.Messages;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria findById(Long id) {
		Optional<Categoria> categoriaRetornada = categoriaRepository.findById(id);
		return categoriaRetornada.orElseThrow(
				() -> new ObjectNotFoundException(Messages.MSG_OBJECT_NOT_FOUND.replace("?", "Categoria")));
	}
	
	public Categoria save(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	public Categoria update(Categoria categoria) {
		findById(categoria.getId());
		return categoriaRepository.save(categoria);
	}
	
	public void delete(Long id) {
		findById(id);
		try {
			categoriaRepository.deleteById(id);
		}catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException(Messages.MSG_DATA_INTEGRITY.replace("?", "categoria").replace("!", "produto"));
		}		
	}
	
	public List<Categoria> findAll() {
		List<Categoria> categorias = categoriaRepository.findAll();
		return categorias;
	}
	
	public Page<Categoria> findAllByPage(Integer page, Integer linesByPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesByPage, Direction.valueOf(direction), orderBy);
		return categoriaRepository.findAll(pageRequest);
	}
}
