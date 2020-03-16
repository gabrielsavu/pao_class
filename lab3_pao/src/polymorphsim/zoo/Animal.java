package polymorphsim.zoo;

public abstract class Animal {
	private int nrIdentificare;
	private String nume;
	private int varsta;
	protected String tipHrana;
	protected String sunetSpecific;

	public Animal(String nume, int varsta) {
		this.nrIdentificare = hashCode();
		this.nume = nume;
		this.varsta = varsta;
	}

	public abstract void seHraneste();

	public abstract void scoateSunet();

	public void afiseazaDetalii() {
		System.out.println("Aceasta este " + this.toString());
	}

	@Override
	public String toString() {
		return "Animal [nrIdentificare=" + nrIdentificare + ", nume=" + nume + ", varsta=" + varsta + ", tipHrana="
				+ tipHrana + ", sunetSpecific=" + sunetSpecific + "]";
	}

	
}
