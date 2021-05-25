package boundary;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.widgets.Text;

public class Main {

	protected Shell shell;
	private Text tbNivel;
	private Text tbBonus;
	private Text tbGemas;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Main window = new Main();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(600, 400);
		shell.setText("LoS Helper");
		shell.setLayout(null);
		
		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		tabFolder.setBounds(5, 5, 579, 356);
		
		TabItem Criaturas = new TabItem(tabFolder, SWT.NONE);
		Criaturas.setText("Criaturas");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		Criaturas.setControl(composite);
		
		Label lblFiltros = new Label(composite, SWT.NONE);
		lblFiltros.setBounds(10, 10, 55, 15);
		lblFiltros.setText("Filtros");
		
		Group grpCores = new Group(composite, SWT.NONE);
		grpCores.setText("CORES");
		grpCores.setBounds(10, 31, 103, 139);
		
		Button rbVermelho = new Button(grpCores, SWT.RADIO);
		rbVermelho.setBounds(10, 20, 90, 16);
		rbVermelho.setText("VERMELHA");
		
		Button rbAmarela = new Button(grpCores, SWT.RADIO);
		rbAmarela.setText("AMARELA");
		rbAmarela.setBounds(10, 42, 90, 16);
		
		Button rbVerde = new Button(grpCores, SWT.RADIO);
		rbVerde.setText("VERDE");
		rbVerde.setBounds(10, 64, 90, 16);
		
		Button rbRoxa = new Button(grpCores, SWT.RADIO);
		rbRoxa.setText("ROXA");
		rbRoxa.setBounds(10, 86, 90, 16);
		
		Button rbTodas = new Button(grpCores, SWT.RADIO);
		rbTodas.setText("TODAS");
		rbTodas.setBounds(10, 108, 90, 16);
		
		ListViewer listViewer = new ListViewer(composite, SWT.BORDER | SWT.V_SCROLL);
		List list = listViewer.getList();
		list.setBounds(119, 37, 147, 281);
		
		Label lblNomeDaCriatura = new Label(composite, SWT.NONE);
		lblNomeDaCriatura.setBounds(274, 39, 147, 15);
		lblNomeDaCriatura.setText("Nome da criatura");
		
		Label lblNivel = new Label(composite, SWT.NONE);
		lblNivel.setBounds(272, 60, 40, 15);
		lblNivel.setText("Nivel");
		
		Label lblBonus = new Label(composite, SWT.NONE);
		lblBonus.setText("Bonus");
		lblBonus.setBounds(318, 60, 40, 15);
		
		Label lblGemas = new Label(composite, SWT.NONE);
		lblGemas.setBounds(364, 60, 55, 15);
		lblGemas.setText("Gemas");
		
		tbNivel = new Text(composite, SWT.BORDER);
		tbNivel.setBounds(272, 81, 40, 21);
		
		tbBonus = new Text(composite, SWT.BORDER);
		tbBonus.setBounds(318, 81, 40, 21);
		
		tbGemas = new Text(composite, SWT.BORDER);
		tbGemas.setBounds(364, 81, 40, 21);
		
		TabItem Calculadora = new TabItem(tabFolder, SWT.NONE);
		Calculadora.setText("Calculadora");
		
		TabItem Desbloqueados = new TabItem(tabFolder, SWT.NONE);
		Desbloqueados.setText("Desbloqueados");

	}
}
