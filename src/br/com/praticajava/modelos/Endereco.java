package br.com.praticajava.modelos;

public class Endereco {
	
	private String cep;
	private String rua;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	
	public Endereco(EnderecoViaCep endereco) {
		super();
		this.cep = endereco.cep();
		this.rua = endereco.logradouro();
		this.complemento = endereco.complemento();
		this.bairro = endereco.bairro();
		this.cidade = endereco.localidade();
		this.uf = endereco.uf();
	}

	
	public String getCep() {
		return cep;
	}

	
	public String getRua() {
		return rua;
	}

	
	public String getComplemento() {
		return complemento;
	}

	
	public String getBairro() {
		return bairro;
	}

	
	public String getCidade() {
		return cidade;
	}

	
	public String getUf() {
		return uf;
	}


	
	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", rua=" + rua + ", complemento=" + complemento + ", bairro=" + bairro
				+ ", cidade=" + cidade + ", uf=" + uf + "]";
	}

	
	

}
