package entity;

public enum Tipos {
	AJUDANTE(1), ATACANTE(2), DEFENSOR(3);

	private int cod;

	private Tipos(int value) {
		this.setCod(value);
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	// retorna o nome do item
	public String getNome(int value) {
		return Tipos.values()[value].name();

	}
}
