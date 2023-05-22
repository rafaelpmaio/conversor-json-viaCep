package br.com.praticajava.requisicaoapi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import br.com.praticajava.modelos.Endereco;
import br.com.praticajava.modelos.EnderecoViaCep;

public class ConexaoApiViacep {

	public static Endereco buscarCep(String cep) {

		URI uri = URI.create("https://viacep.com.br/ws/" + cep + "/json");

		try {
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder().uri(uri).build();
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

			Gson gson = new GsonBuilder().create();

			try {
				EnderecoViaCep enderecoViaCep = gson.fromJson(response.body(), EnderecoViaCep.class);
				Endereco endereco = new Endereco(enderecoViaCep);
				return endereco;

			} catch (JsonSyntaxException e) {
				System.out.println("Cep inválido, digite um número válido");
				e.getMessage();
			}

		} catch (IOException | InterruptedException | JsonSyntaxException e) {
			e.printStackTrace();
		}

		return null;
	}

}
