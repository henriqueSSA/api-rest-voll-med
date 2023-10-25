package voll.med.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import voll.med.api.medico.Especialidade;
import voll.med.api.medico.Medico;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
	private String logradouro;
	private String bairro;
	private String cidade;
	private String cep;
	private String numero;
	private String complemento;
	private String uf;
	
	public Endereco(EnderecoDto dados) {
		this.logradouro = dados.logradouro();
		this.bairro = dados.bairro();
		this.cidade = dados.cidade();
		this.cep = dados.cep();
		this.numero = dados.numero();
		this.complemento = dados.complemento();
		this.uf = dados.uf();
	}
	

}
