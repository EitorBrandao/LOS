package entity;

public class Criatura {
	//dados da criatura que não mudam
	private String id;
	private String nome;
	private int cor;
	private int raridade;
	private int espera;
	private int tipo;
	
	//status da criatura
	private String desbloqueado;
	private int nivel;
	private int cod_nivel;
	private int gemas;
	private int excedente;
	private int nxt_lvl;
	
	//status da criatura também, mas relacionados a outra parte
	private int poder;
	private int forca;
	private int crescimento;
	private int fusao;
	private int sincronia;
	private int tamanho;
	private int formato;
	private int critico;
	private int bloqueio;
	private char idoloSol;
	private char idoloLua;
	private int idoloSolNivel;
	private int idoloLuaNivel;
}
