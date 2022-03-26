package com.rafael.ProjetoFinalEtapa3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.ProjetoFinalEtapa3.dao.ContaCorrenteDao;
import com.rafael.ProjetoFinalEtapa3.model.ContaCorrente;

@RestController
public class ContaController {
	@Autowired
	private ContaCorrenteDao dao;

	@GetMapping(path = "/conta/{numero}")
	public ContaCorrente recuperar(@PathVariable int numero) {
		return dao.findById(numero).orElse(null);
	}

	@GetMapping(path = "/contas")
	public List<ContaCorrente> RecuperarTodas() {
		return (List<ContaCorrente>) dao.findAll();
	}

}
