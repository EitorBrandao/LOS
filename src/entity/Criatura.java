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
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCor() {
		return cor;
	}
	public void setCor(int cor) {
		this.cor = cor;
	}
	public int getRaridade() {
		return raridade;
	}
	public void setRaridade(int raridade) {
		this.raridade = raridade;
	}
	public int getEspera() {
		return espera;
	}
	public void setEspera(int espera) {
		this.espera = espera;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getDesbloqueado() {
		return desbloqueado;
	}
	public void setDesbloqueado(String desbloqueado) {
		this.desbloqueado = desbloqueado;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getCod_nivel() {
		return cod_nivel;
	}
	//o código do nivel é um valor não definido pelo usuário
	public void setCod_nivel(int raridade, int nivel) {
		this.cod_nivel = Integer.parseInt(String.valueOf(raridade)+String.valueOf(nivel));
	}
	public int getGemas() {
		return gemas;
	}
	public void setGemas(int gemas) {
		this.gemas = gemas;
	}
	public int getNxt_lvl() {
		return nxt_lvl;
	}
	public void setNxt_lvl(int nxt_lvl) {
		this.nxt_lvl = nxt_lvl;
	}
	public int getPoder() {
		return poder;
	}
	public void setPoder(int poder) {
		this.poder = poder;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getCrescimento() {
		return crescimento;
	}
	public void setCrescimento(int crescimento) {
		this.crescimento = crescimento;
	}
	public int getFusao() {
		return fusao;
	}
	public void setFusao(int fusao) {
		this.fusao = fusao;
	}
	public int getSincronia() {
		return sincronia;
	}
	public void setSincronia(int sincronia) {
		this.sincronia = sincronia;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getFormato() {
		return formato;
	}
	public void setFormato(int formato) {
		this.formato = formato;
	}
	public int getCritico() {
		return critico;
	}
	public void setCritico(int critico) {
		this.critico = critico;
	}
	public int getBloqueio() {
		return bloqueio;
	}
	public void setBloqueio(int bloqueio) {
		this.bloqueio = bloqueio;
	}
	public char getIdoloSol() {
		return idoloSol;
	}
	public void setIdoloSol(char idoloSol) {
		this.idoloSol = idoloSol;
	}
	public char getIdoloLua() {
		return idoloLua;
	}
	public void setIdoloLua(char idoloLua) {
		this.idoloLua = idoloLua;
	}
	public int getIdoloSolNivel() {
		return idoloSolNivel;
	}
	public void setIdoloSolNivel(int idoloSolNivel) {
		this.idoloSolNivel = idoloSolNivel;
	}
	public int getIdoloLuaNivel() {
		return idoloLuaNivel;
	}
	public void setIdoloLuaNivel(int idoloLuaNivel) {
		this.idoloLuaNivel = idoloLuaNivel;
	}
	
	
}
