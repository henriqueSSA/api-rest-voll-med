package voll.med.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import voll.med.api.medico.MedicoDto;

@RestController
@RequestMapping("/medico")
public class MedicoController {
	
	@PostMapping
	public void cadastrar(@RequestBody MedicoDto dados) {
		System.out.println(dados);
	}
	
	
}
