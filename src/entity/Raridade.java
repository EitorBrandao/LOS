package entity;

public enum Raridade {
	COMUM(1), RARA(2), EPICA(3), LENDARIA(4), MITICA(5);

	private int cod;

	private Raridade(int value) {
		this.cod = value;
	}
}
