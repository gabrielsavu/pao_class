package lab4_pao.asociere;

public class Profesor {

	private int id;

	private String nume;

	public Profesor(int id, String nume) {
		super();
		this.setId(id);
		this.setNume(nume);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nume=" + nume + "]";
	}

}
