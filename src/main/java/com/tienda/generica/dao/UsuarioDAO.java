package com.tienda.generica.dao;

import org.springframework.data.repository.CrudRepository;

import com.tienda.generica.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Long>{

}
