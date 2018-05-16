package br.com.google.gson;
import com.google.gson.Gson;

public class LendoJSON {

	public static void main(String[] args) {

	    //string com informa��o representada em JSON 
		String aux = "{\"titulo\":\"JSON James\",\"ano\":2012,\"generos\":[\"Western\"]}";
		
		//instancia um objeto da classe Gson  
		Gson gson = new Gson();
		
	    //instancia um filme e preenche seus dados com a informa��o vinda
		//da string JSON		
		Filme f = gson.fromJson(aux, Filme.class);
	    //imprime os resultados		
		System.out.println(f.titulo);
		System.out.println(f.ano);
		System.out.println(f.generos.toString());

	}

}
