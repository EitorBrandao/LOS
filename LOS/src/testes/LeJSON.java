package testes;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LeJSON {

	public static void main(String[] args) throws JSONException {

		/* -------------------------------------------------------
		 * TESTE 4
		 * manipula��o de array
		 * -------------------------------------------------------*/

		//string json: cont�m array com tr�s elementos
		String json_str = "{\"TIPOS\":[{\"null\":0,\"ATACANTE\":2,\"AJUDANTE\":1,\"DEFENSOR\":3}]}";

		//instancia um novo JSONObject passando a string como entrada
		JSONObject my_obj = new JSONObject(json_str);

		//recupera o array "elenco"
		JSONArray elenco = my_obj.getJSONArray("TIPOS");

		//imprime cada ator/atriz do elenco com o uso dos m�todos
		System.out.println("Elenco Original");
		for (int i = 0; i < elenco.length(); i++) {
			System.out.println("(" + i + ") " + elenco.get(i));
		}
		System.out.println();

		//-- insere um novo ator no array
		elenco.put("Michael Java Fox");

		System.out.println("Elenco com o novo ator");
		for (int i = 0; i < elenco.length(); i++) {
			System.out.println("(" + i + ") " + elenco.get(i));
		}
		System.out.println();

		//-- troca o nome da primeira atriz
		elenco.put(0, "Jennifer Json Leigh");

		System.out.println("Elenco com o nome da primeira atriz modificado");
		for (int i = 0; i < elenco.length(); i++) {
			System.out.println("(" + i + ") " + elenco.get(i));
		}
		System.out.println();

		//-- remove o terceiro ator
		elenco.remove(2);

		System.out.println("Elenco com o ator David Makupovny removido");
		for (int i = 0; i < elenco.length(); i++) {
			System.out.println("(" + i + ") " + elenco.get(i));
		}
	}

}
