package com.distribuida.dao;

import com.distribuida.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorDAO extends JpaRepository<Cliente, Integer> {


}
