package com.eduardojavaonline.lojavirtualapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardojavaonline.lojavirtualapi.model.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
