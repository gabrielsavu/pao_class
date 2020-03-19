package lab4_pao.imutabilitate;

public final class Adresa {

	final private String numeStrada;
	final private int nrStrada;
	
	
	public Adresa(String numeStrada, int nrStrada) {
		super();
		this.numeStrada = numeStrada;
		this.nrStrada = nrStrada;
	}


	public String getNumeStrada() {
		return numeStrada;
	}


	public int getNrStrada() {
		return nrStrada;
	}
	
	
}
