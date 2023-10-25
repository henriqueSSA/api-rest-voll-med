package voll.med.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import voll.med.api.medico.Medico;
import voll.med.api.medico.MedicoDto;
import voll.med.api.medico.MedicoRepository;

@RestController
@RequestMapping("/medico")
public class MedicoController {
	
	@Autowired
	private MedicoRepository repository;
	
	@PostMapping
	@org.springframework.transaction.annotation.Transactional
	public void cadastrar(@RequestBody @Valid MedicoDto dados) {
		repository.save(new Medico(dados));
	}
	
	
}
