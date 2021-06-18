package control;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TableItem;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import boundary.Main;
import entity.Cores;
import entity.Raridade;

public class Metodos {
	Display display = Display.getDefault();
	Gson gson = new Gson();
	Color VERMELHA = display.getSystemColor(SWT.COLOR_RED);
	Color AMARELA = display.getSystemColor(SWT.COLOR_YELLOW);
	Color VERDE = display.getSystemColor(SWT.COLOR_GREEN);
	Color ROXA = display.getSystemColor(SWT.COLOR_MAGENTA);
	Color CINZA = display.getSystemColor(SWT.COLOR_GRAY); // commun

	Color[] colors = new Color[] { new Color(display, new RGB(157, 101, 38)), // rare
			new Color(display, new RGB(182, 246, 254)), // epic
			new Color(display, new RGB(255, 216, 21)), // legendary
			new Color(display, new RGB(112, 84, 255)) };// mythical

	public void salvar() {
		System.out.println("classe metodos, metodo salvar");
	}

	public void trazStatus() {
		String selecionada = Main.tabCriaturas.getItem(Main.tabCriaturas.getSelectionIndex()).toString();
		selecionada = selecionada.replace("TableItem {", "");
		selecionada = selecionada.replace("}", "");
		System.out.println(selecionada);
	}

	public void carregaTabCriaturas() {
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
						reader.nextString();
					} else if (name.equals("stats")) {
						carregaTabCriaturasStats(reader);
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

	public void carregaTabCriaturasStats(JsonReader reader) throws IOException {
		TableItem tabItem = new TableItem(Main.tabCriaturas, SWT.NONE);
		String nome;
		int cor;
		int raridade;
		String desbloqueado;
		Color colorido = null;

		reader.beginObject();

		while (reader.hasNext()) {
			String name = reader.nextName();
			if (name.equals("NOME")) {
				nome = reader.nextString();
				System.out.print(nome);
				tabItem.setText(0, nome);

			} else if (name.equals("COR")) {
				cor = reader.nextInt();
				switch (cor) {
				case 1:
					colorido = VERMELHA;
					break;
				case 2:
					colorido = AMARELA;
					break;
				case 3:
					colorido = VERDE;
					break;
				case 4:
					colorido = ROXA;
					break;
				}
				tabItem.setBackground(0, colorido);

			} else if (name.equals("RARIDADE")) {
				raridade = reader.nextInt();
				switch (raridade) {
				case 1: // COMUM
					colorido = CINZA;
					break;
				case 2: // RARO
					colorido = colors[0];
					break;
				case 3: // EPICO
					colorido = colors[1];
					break;
				case 4: // LENDARIO
					colorido = colors[2];
					break;
				case 5: // MITICO
					colorido = colors[3];
					break;
				}
				tabItem.setText(1, Raridade.getNome(raridade));
				tabItem.setBackground(1, colorido);
			} else if (name.equals("DESBLOQUEADO")) {
				desbloqueado = reader.nextString();
				System.out.println(" " + desbloqueado);
				if (desbloqueado == "N") {
					reader.skipValue();
				}
			} else {
				reader.skipValue();
			}
		}
		reader.endObject();

		for (int i = 0; i <= 1; i++) {
			Main.tabCriaturas.getColumn(i).pack();
		}
	}

	public void verificaCores(int corFiltro) {
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
						reader.nextString();
					} else if (name.equals("stats")) {
						verificaCoresStats(reader, corFiltro);
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

	public void verificaCoresStats(JsonReader reader, int corFiltro) throws IOException {
		TableItem tabItem = new TableItem(Main.tabCriaturas, SWT.NONE);
		String nome;
		int cor;
		int raridade;
		String desbloqueado;
		Color colorido = null;

		reader.beginObject();

		while (reader.hasNext()) {
			int contador = 1;
			String name = reader.nextName();
			if (name.equals("NOME")) {
				nome = reader.nextString();
				System.out.print(nome);
				tabItem.setText(0, nome);

			} else if (name.equals("COR")) {
				cor = reader.nextInt();
				switch (cor) {
				case 1:
					colorido = VERMELHA;
					break;
				case 2:
					colorido = AMARELA;
					break;
				case 3:
					colorido = VERDE;
					break;
				case 4:
					colorido = ROXA;
					break;
				}
				tabItem.setBackground(0, colorido);

			} else if (name.equals("RARIDADE")) {
				raridade = reader.nextInt();
				switch (raridade) {
				case 1: // COMUM
					colorido = CINZA;
					break;
				case 2: // RARO
					colorido = colors[0];
					break;
				case 3: // EPICO
					colorido = colors[1];
					break;
				case 4: // LENDARIO
					colorido = colors[2];
					break;
				case 5: // MITICO
					colorido = colors[3];
					break;
				}
				tabItem.setText(1, Raridade.getNome(raridade));
				tabItem.setBackground(1, colorido);
			} else if (name.equals("DESBLOQUEADO")) {
				desbloqueado = reader.nextString();
				System.out.print(" " + desbloqueado);
				if (desbloqueado == "N") {
					reader.skipValue();
				}
			} else {
				reader.skipValue();
			}
			contador++;
			System.out.println(" " + contador);
		}
		reader.endObject();

		for (int i = 0; i <= 1; i++) {
			Main.tabCriaturas.getColumn(i).pack();
		}
	}

}