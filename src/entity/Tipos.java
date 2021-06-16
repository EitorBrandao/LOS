package entity;

public enum Tipos {
	AJUDANTE(1), ATACANTE(2), DEFENSOR(3);

	private int cod;

	Tipos(int value) {
		cod = value;
	}

	public int getCod() {
		return cod;
	}

	// retorna o nome do item
	public static String getNome(int value) {
		return Tipos.values()[value - 1].name();

	}
}
