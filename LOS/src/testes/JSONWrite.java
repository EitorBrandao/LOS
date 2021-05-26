package testes;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class JSONWrite {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//Cria um Objeto JSON
		JSONObject jsonObject = new JSONObject();

		FileWriter writeFile = null;

		//Armazena dados em um Objeto JSON
		jsonObject.put(null, 0);
		jsonObject.put("AJUDANTE", 1);
		jsonObject.put("ATACANTE", 2);
		jsonObject.put("DEFENSOR", 3);

		try{
			writeFile = new FileWriter("saida.json");
			//Escreve no arquivo conteudo do Objeto JSON
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}

		//Imprimne na Tela o Objeto JSON para vizualiza��o
		System.out.println(jsonObject);

	}

}

