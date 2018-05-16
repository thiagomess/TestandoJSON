package br.com.google.gson;
import java.util.ArrayList;

import com.google.gson.Gson;

public class GravandoJson {

	public static void main(String[] args) {
		
		//Tutorial: https://www.devmedia.com.br/json-tutorial/25275
		
		
		//USADO A API GSON DO GOOGLE
		
		// converte objeto Filme para uma string JSON
		// instancia um filme e preenche suas propriedades
		Filme f = new Filme();
		f.titulo = "JSON x XML";
		f.ano = 2012;
		f.generos = new ArrayList<>();
		f.generos.add("Aventura");
		f.generos.add("Ação");
		f.generos.add("Ficção");

		// instancia um objeto da classe Gson
		Gson gson = new Gson();

		// pega os dados do filme, converte para JSON e armazena em string
		String aux = gson.toJson(f);

		// imprime os resultados
		System.out.println(aux);
		
		//lendo o json da variavel aux
		Filme e = gson.fromJson(aux, Filme.class);
		
		System.out.println("");
		System.out.println(e.titulo);
		System.out.println(e.ano);
		System.out.println(e.generos.toString());


	}

}
