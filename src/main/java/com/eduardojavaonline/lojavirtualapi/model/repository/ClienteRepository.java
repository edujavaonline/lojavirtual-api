package com.eduardojavaonline.lojavirtualapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardojavaonline.lojavirtualapi.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
