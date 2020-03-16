package polymorphsim.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private final int nrMaxAnimale;
	public List<Animal> animaleZoo;

	public Zoo(int nrMaximAnimale) {
		if (nrMaximAnimale > 0) {
			this.nrMaxAnimale = nrMaximAnimale;
			animaleZoo = new ArrayList<>(nrMaximAnimale);
		} else {
			throw new RuntimeException("Nu ati introdus un numar de animale.");
		}
	}

	public void adaugaAnimal(Animal animal) {
		if (animaleZoo.size() >= nrMaxAnimale) {
			return;
		}
		animaleZoo.add(animal);
		System.out.println("Adaugat animal " + animal.getClass().getSimpleName() + " la pozitia " + animaleZoo.size());

	}

}
