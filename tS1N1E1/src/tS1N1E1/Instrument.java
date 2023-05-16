package tS1N1E1;

public abstract class Instrument {
	private String name;
	private float preu;

	public Instrument(String name, float preu) {
		super();
		this.name = name;
		this.preu = preu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}

	public abstract void tocar();
}