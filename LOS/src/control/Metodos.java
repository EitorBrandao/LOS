package control;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import boundary.Main;

public class Metodos {

	public void salvar() {
		System.out.println("classe metodos, metodo salvar");
	}

	public void carregaCriaturas() {
		if (Main.tabCriaturas.getItemCount() > 0) {
			Main.tabCriaturas.removeAll();
		}
		int count = 100;
		for (int i = 0; i < count; i++) {
			TableItem item = new TableItem(Main.tabCriaturas, SWT.NONE);
			item.setText(0, "CRIATURA");
			item.setText(1, "RARIDADE");
		}
		for (int i = 0; i <= 1; i++) {
			Main.tabCriaturas.getColumn(i).pack();
		}
	}

}
