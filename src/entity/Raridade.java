package entity;

public enum Raridade {
	COMUM(1), RARA(2), EPICA(3), LENDARIA(4), MITICA(5);

	private int cod;

	private Raridade(int value) {
		this.setCod(value);
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	// retorna o nome do item
	public String getTipo(int value) {
		return Raridade.values()[value].name();

	}
}
