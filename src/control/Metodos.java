package control;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableItem;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import boundary.Main;

public class Metodos {

	Gson gson = new Gson();

	public void salvar() {
		System.out.println("classe metodos, metodo salvar");
	}

	public void carregaCriaturas() {

		if (Main.tabCriaturas.getItemCount() > 0) {
			Main.tabCriaturas.removeAll();
		}
		
		try (JsonReader reader = new JsonReader(new FileReader("data/data.json"))) {

			reader.beginArray();
			while (reader.hasNext()) {
				reader.beginObject();

				while (reader.hasNext()) {
					String name = reader.nextName();
					if (name.equals("ID")) {
						System.out.println(reader.nextString());
					} else if (name.equals("stats")) {
						carregaStats(reader);
					} else {
						reader.skipValue(); // avoid some unhandle events
					}
				}
				reader.endObject();
			}
			reader.endArray();
		} catch (

		FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void carregaStats(JsonReader reader) throws IOException {
		TableItem tabItem = new TableItem(Main.tabCriaturas, SWT.NONE);
		String nome;
		int raridade;
		
		reader.beginObject();
		
		while (reader.hasNext()) {
			String name = reader.nextName();
			if (name.equals("NOME")) {
				nome = reader.nextString();
				System.out.println(nome);
				tabItem.setText(0, nome);
			} else if (name.equals("RARIDADE")) {
				raridade = reader.nextInt();
				System.out.println(raridade);
				tabItem.setText(1, String.valueOf(raridade));
			} else {
				reader.skipValue();
			}
		}
		reader.endObject();

		for (int i = 0; i <= 1; i++) {
			Main.tabCriaturas.getColumn(i).pack();
		}
	}
//		int count = 100;
//		
//				
//		for (int i = 0; i < count; i++) {
//
//			TableItem item = new TableItem(Main.tabCriaturas, SWT.NONE);
//			item.setText(0, "VALQUIRIA ASHEN");
//			item.setText(1, "RARIDADE");
//		}
//		

//
//	}
}
