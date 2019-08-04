package com.eduardojavaonline.lojavirtualapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardojavaonline.lojavirtualapi.model.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
