package entity;

public enum Idolos {
	JORMUNGANDR("J"), VIDAR("V"), SLEPNIR("S"), TYR("T"), MUNINN("M");

	private String cod;

	Idolos(String string) {
		this.cod = string;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

}
