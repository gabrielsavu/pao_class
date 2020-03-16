package polymorphism.zoo.omnivor;

public class Caine extends Omnivor {
	
	
	public Caine(String nume, int varsta) {
		super(nume, varsta);
		this.sunetSpecific = "ham";
	}

	@Override
	public void scoateSunet() {
		System.out.println("Caine " + this.sunetSpecific);
	}

}
