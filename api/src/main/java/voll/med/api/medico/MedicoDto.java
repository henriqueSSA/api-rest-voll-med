package voll.med.api.medico;

import voll.med.api.endereco.EnderecoDto;

public record MedicoDto(String nome,
		String email,
		String crm,
		Especialidade especialidade,
		EnderecoDto endereco) {

}
