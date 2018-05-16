package br.com.google.json.simple;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class JSONWrite {
	
	public static void main(String[] args) {
		
		
		
		//Tutorial: https://www.devmedia.com.br/leitura-e-escrita-de-arquivos-json-em-java/27663
		
		//Criando um objeto JSON usando a biblioteca json-simple do google
		JSONObject jsonObject = new JSONObject();
		
		FileWriter writeFile = null;
		
		//Armazena dados em um Objeto JSON
		jsonObject.put("nome", "Thiago");
		jsonObject.put("sobrenome", "Gomes");
		jsonObject.put("idade", "25");
		jsonObject.put("pais", "Brasil");
		jsonObject.put("estado", "SP");
		
		try {
			
			writeFile = new FileWriter("saida.json");
			//Escreve no arquivo conteudo do Objeto JSON
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//Imprimne na Tela o Objeto JSON para vizualiza��o
				System.out.println(jsonObject);

		
	}

}
