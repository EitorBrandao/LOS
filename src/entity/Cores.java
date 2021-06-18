package entity;

public enum Cores {
	VERMELHA(1), AMARELA(2), VERDE(3), ROXA(4);

	private int cod;

	Cores(int value) {
		cod = value;
	}

	public int getCod() {
		return cod;
	}

	// retorna o nome do item
	public static String getNome(int value) {
		return Cores.values()[value - 1].name();

	}
}
