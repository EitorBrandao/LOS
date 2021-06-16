package entity;

public enum Idolos {
	JORMUNGANDR("J"), VIDAR("V"), SLEPNIR("S"), TYR("T"), MUNINN("M");

	private String cod;

	Idolos(String string) {
		cod = string;
	}

	public String getCod() {
		return cod;
	}

	// retorna o nome do item
	public static String getNome(int value) {
		return Idolos.values()[value - 1].name();

	}
}
