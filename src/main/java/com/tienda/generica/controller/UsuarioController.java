package com.tienda.generica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tienda.generica.model.Usuario;
import com.tienda.generica.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping("/usuario")
	public String index(Model model) {
		model.addAttribute("list", usuarioService.getAll());
		return "usuario";
	}
	
	@PostMapping("/save-usuario")
	public String save(Usuario usuario, Model model) {
		usuarioService.save(usuario);
		return "redirect:/usuario";
	}
	
	@GetMapping("/save-usuario/{id}")
	public String showSave(@PathVariable("id") Long id, Model model) {
		if(id != null && id != 0) {
			model.addAttribute("usuario", usuarioService.get(id));
		}else {
			model.addAttribute("usuario", new Usuario());
		}
		return "save-usuario";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		usuarioService.delete(id);
		return "redirect:/usuario";
	}
}
