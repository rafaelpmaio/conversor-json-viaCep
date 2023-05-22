package br.com.praticajava.app;

import br.com.praticajava.modelos.Endereco;
import br.com.praticajava.requisicaoapi.ConexaoApiViacep;

public class Main {
	
	public static void main(String[] args) {
		
		Endereco endereco = ConexaoApiViacep.buscarCep("01001000");
		
		System.out.println(endereco);
		
		
	}

}
