package lab4_pao.imutabilitate;

public final class Persoana {
	
	private final int id;
	
	private final String name;
	
	private final Adresa adresa;

	public Persoana(int id, String name, Adresa adresa) {
		super();
		this.id = id;
		this.name = name;
		this.adresa = adresa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Adresa getAdresa() {
		return adresa;
	}
	
}
