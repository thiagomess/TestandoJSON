package br.com.google.json.simple;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonParser;

public class JSONRead {

	public static void main(String[] args) {

		JSONObject jsonObject;

		// Criando o parse de tratamento com as variaveis que receberam os dados

		JSONParser parser = new JSONParser();

		String nome;
		String sobrenome;
		String idade;
		String estado;
		String pais;

		try {
			// Salva no Objeto JSONObject o que o parse tratou do arquivo

			jsonObject = (JSONObject) parser.parse(new FileReader("saida.json"));

			// Salvando os dados retirados do arquivo nas variaveis

			nome = (String) jsonObject.get("nome");
			sobrenome = (String) jsonObject.get("sobrenome");
			idade = (String) jsonObject.get("idade");
			estado = (String) jsonObject.get("estado");
			pais = (String) jsonObject.get("pais");

			System.out.printf("Nome: %s\nSobrenome: %s\nIdade: %s\nEstado: %s\nPais: %s\n", nome, sobrenome, idade, estado, pais);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
