package com.tienda.generica.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.tienda.generica.commons.GenericServiceImp;
import com.tienda.generica.dao.UsuarioDAO;
import com.tienda.generica.model.Usuario;
import com.tienda.generica.service.UsuarioService;

@Service
public class UsuarioServiceImpl extends GenericServiceImp<Usuario, Long> implements UsuarioService{

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Override
	public CrudRepository<Usuario, Long> getDao() {
		return usuarioDAO;
	}

}
