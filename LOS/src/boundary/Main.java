package boundary;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.wb.swt.SWTResourceManager;

public class Main {

	protected Shell shell;
	private Text tbNivel;
	private Text tbBonus;
	private Text tbGemas;
	private Text tb1PODER;
	private Text tb0ESPERA;
	private Text tb2FORCA;
	private Text tb3CRESCIMENTO;
	private Text tb4FUSAO;
	private Text tb5SINCRONIA;
	private Text tb6TAMANHO;
	private Text tb7FORMATO;
	private Text tb9BLOQUEIO;
	private Text tb8CRITICO;
	private Text tbNivelSol;
	private Text tbNivelLua;
	private Text tbPESQUISA;

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
		
		Button btnIdioma = new Button(shell, SWT.NONE);
		btnIdioma.setBounds(509, 0, 75, 25);
		btnIdioma.setText("Idioma");
		
		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		tabFolder.setBounds(5, 5, 580, 356);
		
		TabItem Criaturas = new TabItem(tabFolder, SWT.NONE);
		Criaturas.setText("Criaturas");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		Criaturas.setControl(composite);
		composite.setLayout(null);
		
		Label lblFiltros = new Label(composite, SWT.NONE);
		lblFiltros.setFont(SWTResourceManager.getFont("Times", 12, SWT.NORMAL));
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
		lblBonus.setBounds(318, 60, 40, 15);
		lblBonus.setText("Bonus");
		
		Label lblGemas = new Label(composite, SWT.NONE);
		lblGemas.setBounds(364, 60, 40, 15);
		lblGemas.setText("Gemas");
		
		tbNivel = new Text(composite, SWT.BORDER);
		tbNivel.setBounds(272, 81, 40, 18);
		
		tbBonus = new Text(composite, SWT.BORDER);
		tbBonus.setBounds(318, 81, 40, 18);
		
		tbGemas = new Text(composite, SWT.BORDER);
		tbGemas.setBounds(364, 81, 40, 18);
		
		tb1PODER = new Text(composite, SWT.BORDER);
		tb1PODER.setBounds(410, 81, 40, 18);
		
		Label lblPoder = new Label(composite, SWT.NONE);
		lblPoder.setAlignment(SWT.CENTER);
		lblPoder.setBounds(410, 60, 40, 15);
		lblPoder.setText("Poder");
		
		Canvas imgESPERA = new Canvas(composite, SWT.NONE);
		imgESPERA.setBounds(456, 81, 18, 18);
		
		tb0ESPERA = new Text(composite, SWT.BORDER);
		tb0ESPERA.setEnabled(false);
		tb0ESPERA.setEditable(false);
		tb0ESPERA.setBounds(474, 81, 40, 18);
		
		Canvas imgFORCA = new Canvas(composite, SWT.NONE);
		imgFORCA.setBounds(272, 124, 18, 18);
		
		tb2FORCA = new Text(composite, SWT.BORDER);
		tb2FORCA.setBounds(290, 124, 40, 18);
		
		Canvas imgCRESCIMENTO = new Canvas(composite, SWT.NONE);
		imgCRESCIMENTO.setBounds(336, 124, 18, 18);
		
		tb3CRESCIMENTO = new Text(composite, SWT.BORDER);
		tb3CRESCIMENTO.setBounds(354, 124, 40, 18);
		
		Canvas imgFUSAO = new Canvas(composite, SWT.NONE);
		imgFUSAO.setBounds(400, 124, 18, 18);
		
		tb4FUSAO = new Text(composite, SWT.BORDER);
		tb4FUSAO.setBounds(418, 124, 40, 18);
		
		Canvas imgSINCRONIA = new Canvas(composite, SWT.NONE);
		imgSINCRONIA.setBounds(469, 124, 18, 18);
		
		tb5SINCRONIA = new Text(composite, SWT.BORDER);
		tb5SINCRONIA.setBounds(487, 124, 40, 18);
		
		Canvas imgTAMANHO = new Canvas(composite, SWT.NONE);
		imgTAMANHO.setBounds(272, 148, 18, 18);
		
		tb6TAMANHO = new Text(composite, SWT.BORDER);
		tb6TAMANHO.setBounds(290, 148, 40, 18);
		
		Canvas imgFORMATO = new Canvas(composite, SWT.NONE);
		imgFORMATO.setBounds(336, 148, 18, 18);
		
		tb7FORMATO = new Text(composite, SWT.BORDER);
		tb7FORMATO.setBounds(354, 148, 40, 18);
		
		Canvas imgCRITICO = new Canvas(composite, SWT.NONE);
		imgCRITICO.setBounds(400, 148, 18, 18);
		
		tb8CRITICO = new Text(composite, SWT.BORDER);
		tb8CRITICO.setBounds(418, 148, 40, 18);
		
		Canvas imgBLOQUEIO = new Canvas(composite, SWT.NONE);
		imgBLOQUEIO.setBounds(469, 148, 18, 18);
		
		tb9BLOQUEIO = new Text(composite, SWT.BORDER);
		tb9BLOQUEIO.setBounds(487, 148, 40, 18);
		
		Label lblNivelSOL = new Label(composite, SWT.NONE);
		lblNivelSOL.setText("Nivel Idolo Sol");
		lblNivelSOL.setBounds(292, 178, 83, 18);
		
		tbNivelSol = new Text(composite, SWT.BORDER);
		tbNivelSol.setBounds(272, 177, 18, 18);
		
		Group grpIdoloSOL = new Group(composite, SWT.NONE);
		grpIdoloSOL.setBounds(272, 195, 130, 73);
		
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
		grpIdoloLUA.setBounds(424, 195, 130, 73);
		
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
		lblNivelIdoloLua.setBounds(444, 178, 83, 18);
		
		tbNivelLua = new Text(composite, SWT.BORDER);
		tbNivelLua.setBounds(424, 177, 18, 18);
		
		Button cbMostrarBloqueados = new Button(composite, SWT.CHECK);
		cbMostrarBloqueados.setBounds(272, 274, 132, 18);
		cbMostrarBloqueados.setText("Mostrar Bloqueados");
		
		Button cbSAVE = new Button(composite, SWT.CHECK);
		cbSAVE.setText("N\u00E3o exibir mensagem ao salvar");
		cbSAVE.setBounds(272, 298, 186, 18);
		
		Button btnSalvar = new Button(composite, SWT.NONE);
		btnSalvar.setBounds(479, 293, 75, 25);
		btnSalvar.setText("Salvar");
		
		tbPESQUISA = new Text(composite, SWT.BORDER);
		tbPESQUISA.setBounds(190, 10, 76, 18);
		tbPESQUISA.setFont(SWTResourceManager.getFont("Tahoma", 9, SWT.NORMAL));
		
		Label lblPesquisa = new Label(composite, SWT.NONE);
		lblPesquisa.setBounds(119, 10, 65, 18);
		lblPesquisa.setFont(SWTResourceManager.getFont("Times", 11, SWT.NORMAL));
		lblPesquisa.setText("Pesquisa->");
		
		TabItem Calculadora = new TabItem(tabFolder, SWT.NONE);
		Calculadora.setText("Calculadora");
		
		TabItem Desbloqueados = new TabItem(tabFolder, SWT.NONE);
		Desbloqueados.setText("Desbloqueados");

	}
}
