package entity;

public enum Raridade {
	COMUM(1), RARA(2), EPICA(3), LENDARIA(4), MITICA(5);

	private int cod;

	Raridade(int value) {
		cod = value;
	}

	public int getCod() {
		return cod;
	}

	// retorna o nome do item
	public static String getNome(int value) {
		return Raridade.values()[value - 1].name();

	}
}
