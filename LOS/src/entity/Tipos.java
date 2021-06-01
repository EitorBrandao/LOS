package entity;

public enum Tipos {
	AJUDANTE(1), ATACANTE(2), DEFENSOR(3);

	private int cod;

	private Tipos(int value) {
		this.cod = value;
	}

}

