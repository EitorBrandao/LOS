package boundary;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

import control.Metodos;

public class Main {
	Metodos m = new Metodos();
	protected Shell shell;
	public Text tbNivel;
	public Text tbBonus;
	public Text tbGemas;
	public Text tb1PODER;
	public Text tb0ESPERA;
	public Text tb2FORCA;
	public Text tb3CRESCIMENTO;
	public Text tb4FUSAO;
	public Text tb5SINCRONIA;
	public Text tb6TAMANHO;
	public Text tb7FORMATO;
	public Text tb9BLOQUEIO;
	public Text tb8CRITICO;
	public Text tbNivelSol;
	public Text tbNivelLua;
	public Text tbPESQUISA;
	public static Table tabCriaturas;

	/**
	 * Launch the application.
	 * 
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
		shell.setSize(722, 400);
		shell.setText("LoS Helper");
		shell.setLayout(null);

		Image ESPERA = new Image(null, "data/icones/ESPERA.bmp");
		Image FORCA = new Image(null, "data/icones/FORCA.bmp");
		Image FORMATO = new Image(null, "data/icones/formato.bmp");
		Image FUSAO = new Image(null, "data/icones/fusao.bmp");
		Image SINCRONIA = new Image(null, "data/icones/sincronia.bmp");
		Image CRITICO = new Image(null, "data/icones/crit.bmp");
		Image BLOQUEIO = new Image(null, "data/icones/bloq.bmp");
		Image CRESCIMENTO = new Image(null, "data/icones/crescimento.bmp");
		Image TAMANHO = new Image(null, "data/icones/tamanho.bmp");

		Button btnIdioma = new Button(shell, SWT.NONE);
		btnIdioma.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				m.carregaTabCriaturas();
			}
		});
		btnIdioma.setBounds(624, 0, 75, 25);
		btnIdioma.setText("Idioma");

		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		tabFolder.setBounds(5, 10, 698, 351);

		TabItem Criaturas = new TabItem(tabFolder, SWT.NONE);
		Criaturas.setText("Criaturas");

		Composite composite = new Composite(tabFolder, SWT.NONE);
		Criaturas.setControl(composite);
		composite.setLayout(null);

		Label lblFiltros = new Label(composite, SWT.NONE);
		lblFiltros.setFont(org.eclipse.wb.swt.SWTResourceManager.getFont("Times", 12, SWT.NORMAL));
		lblFiltros.setBounds(10, 10, 103, 15);
		lblFiltros.setText("Filtros");

		Group grpCores = new Group(composite, SWT.NONE);
		grpCores.setBounds(10, 31, 103, 139);
		grpCores.setText("CORES");

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
		rbRoxa.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				m.verificaCores(4);
			}
		});
		rbRoxa.setText("ROXA");
		rbRoxa.setBounds(10, 86, 90, 16);

		Button rbTodas = new Button(grpCores, SWT.RADIO);
		rbTodas.setSelection(true);
		rbTodas.setText("TODAS");
		rbTodas.setBounds(10, 108, 90, 16);

		Label lblNomeDaCriatura = new Label(composite, SWT.NONE);
		lblNomeDaCriatura.setBounds(402, 39, 147, 15);
		lblNomeDaCriatura.setText("Nome da criatura");

		Label lblNivel = new Label(composite, SWT.NONE);
		lblNivel.setBounds(400, 60, 40, 15);
		lblNivel.setText("Nivel");

		tbNivel = new Text(composite, SWT.BORDER);
		tbNivel.setBounds(400, 81, 40, 18);

		Label lblBonus = new Label(composite, SWT.NONE);
		lblBonus.setBounds(446, 60, 40, 15);
		lblBonus.setText("Bonus");

		tbBonus = new Text(composite, SWT.BORDER);
		tbBonus.setBounds(446, 81, 40, 18);

		Label lblGemas = new Label(composite, SWT.NONE);
		lblGemas.setBounds(492, 60, 40, 15);
		lblGemas.setText("Gemas");

		tbGemas = new Text(composite, SWT.BORDER);
		tbGemas.setBounds(492, 81, 40, 18);

		Label lblPoder = new Label(composite, SWT.NONE);
		lblPoder.setAlignment(SWT.CENTER);
		lblPoder.setBounds(538, 60, 40, 15);
		lblPoder.setText("Poder");

		tb1PODER = new Text(composite, SWT.BORDER);
		tb1PODER.setBounds(538, 81, 40, 18);

		Label imgESPERA = new Label(composite, SWT.BORDER);
		imgESPERA.setBounds(584, 81, 18, 18);
		imgESPERA.setImage(ESPERA);

		tb0ESPERA = new Text(composite, SWT.BORDER);
		tb0ESPERA.setEnabled(false);
		tb0ESPERA.setEditable(false);
		tb0ESPERA.setBounds(602, 81, 40, 18);

		Label imgFORCA = new Label(composite, SWT.BORDER);
		imgFORCA.setBounds(400, 124, 18, 18);
		imgFORCA.setImage(FORCA);

		tb2FORCA = new Text(composite, SWT.BORDER);
		tb2FORCA.setBounds(418, 124, 40, 18);

		Label imgCRESCIMENTO = new Label(composite, SWT.BORDER);
		imgCRESCIMENTO.setBounds(464, 124, 18, 18);
		imgCRESCIMENTO.setImage(CRESCIMENTO);

		tb3CRESCIMENTO = new Text(composite, SWT.BORDER);
		tb3CRESCIMENTO.setBounds(482, 124, 40, 18);

		Label imgFUSAO = new Label(composite, SWT.BORDER);
		imgFUSAO.setBounds(528, 124, 18, 18);
		imgFUSAO.setImage(FUSAO);

		tb4FUSAO = new Text(composite, SWT.BORDER);
		tb4FUSAO.setBounds(546, 124, 40, 18);

		Label imgSINCRONIA = new Label(composite, SWT.BORDER);
		imgSINCRONIA.setBounds(597, 124, 18, 18);
		imgSINCRONIA.setImage(SINCRONIA);

		tb5SINCRONIA = new Text(composite, SWT.BORDER);
		tb5SINCRONIA.setBounds(615, 124, 40, 18);

		Label imgTAMANHO = new Label(composite, SWT.BORDER);
		imgTAMANHO.setBounds(400, 148, 18, 18);
		imgTAMANHO.setImage(TAMANHO);

		tb6TAMANHO = new Text(composite, SWT.BORDER);
		tb6TAMANHO.setBounds(418, 148, 40, 18);

		Label imgFORMATO = new Label(composite, SWT.BORDER);
		imgFORMATO.setBounds(464, 148, 18, 18);
		imgFORMATO.setImage(FORMATO);

		tb7FORMATO = new Text(composite, SWT.BORDER);
		tb7FORMATO.setBounds(482, 148, 40, 18);

		Label imgCRITICO = new Label(composite, SWT.BORDER);
		imgCRITICO.setBounds(528, 148, 18, 18);
		imgCRITICO.setImage(CRITICO);

		tb8CRITICO = new Text(composite, SWT.BORDER);
		tb8CRITICO.setBounds(546, 148, 40, 18);

		Label imgBLOQUEIO = new Label(composite, SWT.BORDER);
		imgBLOQUEIO.setBounds(597, 148, 18, 18);
		imgBLOQUEIO.setImage(BLOQUEIO);

		tb9BLOQUEIO = new Text(composite, SWT.BORDER);
		tb9BLOQUEIO.setBounds(615, 148, 40, 18);

		Label lblNivelSOL = new Label(composite, SWT.NONE);
		lblNivelSOL.setText("Nivel Idolo Sol");
		lblNivelSOL.setBounds(420, 178, 83, 18);

		tbNivelSol = new Text(composite, SWT.BORDER);
		tbNivelSol.setBounds(400, 177, 18, 18);

		Group grpIdoloSOL = new Group(composite, SWT.NONE);
		grpIdoloSOL.setBounds(400, 195, 130, 73);

		Button rbEXCLUSIVOSOL = new Button(grpIdoloSOL, SWT.RADIO);
		rbEXCLUSIVOSOL.setText("EXCLUSIVO");
		rbEXCLUSIVOSOL.setBounds(10, 10, 112, 16);

		Button rbMUNINN = new Button(grpIdoloSOL, SWT.RADIO);
		rbMUNINN.setText("MUNINN");
		rbMUNINN.setBounds(10, 32, 90, 16);

		Button rbSLEIPNIR = new Button(grpIdoloSOL, SWT.RADIO);
		rbSLEIPNIR.setText("SLEIPNIR");
		rbSLEIPNIR.setBounds(10, 54, 90, 16);

		Group grpIdoloLUA = new Group(composite, SWT.NONE);
		grpIdoloLUA.setBounds(552, 195, 130, 73);

		Button rbEXCLUSIVOSOL_1 = new Button(grpIdoloLUA, SWT.RADIO);
		rbEXCLUSIVOSOL_1.setText("EXCLUSIVO");
		rbEXCLUSIVOSOL_1.setBounds(10, 10, 112, 16);

		Button rbMUNINN_1 = new Button(grpIdoloLUA, SWT.RADIO);
		rbMUNINN_1.setText("MUNINN");
		rbMUNINN_1.setBounds(10, 32, 90, 16);

		Button rbSLEIPNIR_1 = new Button(grpIdoloLUA, SWT.RADIO);
		rbSLEIPNIR_1.setText("SLEIPNIR");
		rbSLEIPNIR_1.setBounds(10, 54, 90, 16);

		Label lblNivelIdoloLua = new Label(composite, SWT.NONE);
		lblNivelIdoloLua.setText("Nivel Idolo Lua");
		lblNivelIdoloLua.setBounds(572, 178, 83, 18);

		tbNivelLua = new Text(composite, SWT.BORDER);
		tbNivelLua.setBounds(552, 177, 18, 18);

		Button cbMostrarBloqueados = new Button(composite, SWT.CHECK);
		cbMostrarBloqueados.setBounds(400, 274, 132, 18);
		cbMostrarBloqueados.setText("Mostrar Bloqueados");

		Button cbSAVE = new Button(composite, SWT.CHECK);
		cbSAVE.setText("N\u00E3o exibir mensagem ao salvar");
		cbSAVE.setBounds(400, 298, 186, 18);

		Button btnSalvar = new Button(composite, SWT.NONE);
		btnSalvar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				m.salvar();
			}
		});
		btnSalvar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				m.salvar();
			}
		});
		btnSalvar.setBounds(607, 293, 75, 25);
		btnSalvar.setText("Salvar");

		tbPESQUISA = new Text(composite, SWT.BORDER);
		tbPESQUISA.setBounds(190, 10, 76, 18);
		tbPESQUISA.setFont(org.eclipse.wb.swt.SWTResourceManager.getFont("Tahoma", 9, SWT.NORMAL));

		Label lblPesquisa = new Label(composite, SWT.NONE);
		lblPesquisa.setBounds(119, 10, 65, 18);
		lblPesquisa.setFont(org.eclipse.wb.swt.SWTResourceManager.getFont("Times", 11, SWT.NORMAL));
		lblPesquisa.setText("Pesquisa->");

		tabCriaturas = new Table(composite, SWT.BORDER | SWT.FULL_SELECTION | SWT.HIDE_SELECTION);
		tabCriaturas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				m.trazStatus();
			}
		});
		tabCriaturas.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				m.trazStatus();
			}
		});
		tabCriaturas.setBounds(119, 37, 245, 281);
		tabCriaturas.setHeaderVisible(true);
		tabCriaturas.setLinesVisible(true);
		String[] titles = { "Criatura", "Raridade" };
		for (String title : titles) {
			TableColumn column = new TableColumn(Main.tabCriaturas, SWT.NONE);
			column.setText(title);
		}
		m.carregaTabCriaturas();

		TabItem Calculadora = new TabItem(tabFolder, SWT.NONE);
		Calculadora.setText("Calculadora");

		TabItem Desbloqueados = new TabItem(tabFolder, SWT.NONE);
		Desbloqueados.setText("Desbloqueados");

	}
}
