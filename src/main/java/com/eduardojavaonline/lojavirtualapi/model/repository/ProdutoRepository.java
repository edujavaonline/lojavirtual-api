package com.eduardojavaonline.lojavirtualapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardojavaonline.lojavirtualapi.model.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
