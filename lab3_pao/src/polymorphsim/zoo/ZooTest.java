package polymorphsim.zoo;

import java.util.Scanner;

import polymorphism.zoo.carnivor.Leu;
import polymorphism.zoo.carnivor.Pisica;
import polymorphism.zoo.ierbivor.Cal;
import polymorphism.zoo.ierbivor.Elefant;
import polymorphism.zoo.omnivor.Caine;
import polymorphism.zoo.omnivor.Urs;

public class ZooTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nrAnimaleZoo = scanner.nextInt();
		scanner.close();


		Zoo zooBucuresti = new Zoo(nrAnimaleZoo);
		adaugaAnimaleLaZoo(zooBucuresti);
		
		for (Animal animal : zooBucuresti.animaleZoo) {
			animal.afiseazaDetalii();
			animal.seHraneste();
			animal.scoateSunet();
		}

	}

	private static void adaugaAnimaleLaZoo(Zoo zooBucuresti) {
		Leu leu = new Leu("Simba", 7);
		zooBucuresti.adaugaAnimal(leu);
		Elefant elefant = new Elefant("Eli", 10);
		zooBucuresti.adaugaAnimal(elefant);
		Urs urs = new Urs("Fram", 4);
		zooBucuresti.adaugaAnimal(urs);
		Pisica pisica = new Pisica("Tom", 2);
		zooBucuresti.adaugaAnimal(pisica);
		Caine caine = new Caine("Toto", 3);
		zooBucuresti.adaugaAnimal(caine);
		Cal cal = new Cal("Thunder", 3);
		zooBucuresti.adaugaAnimal(cal);
	}

}
