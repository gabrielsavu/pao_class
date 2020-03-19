package lab4_pao.asociere;

public class Main {

	public static void main(String[] args) {
		Profesor profesorPrincipalMate = new Profesor(1, "Popescu");
		Profesor profesorSecundarMate = new Profesor(2, "Ionescu");
		Profesor profesorInfo = new Profesor(3, "Anghel");
		Profesor profesorMateSiInfo = new Profesor(4, "Petrescu");
		Profesor profesorInfosiMate = new Profesor(5, "Andrei");

		Departament info = new Departament("Info");
		info.setProfesori(new Profesor[] { profesorInfo, profesorInfosiMate, profesorMateSiInfo });

		Departament mate = new Departament("Mate");
		mate.setProfesori(new Profesor[] { profesorPrincipalMate, profesorSecundarMate, profesorInfosiMate, profesorMateSiInfo });

		Universitate unibuc = new Universitate("Unibuc", new Departament[] { info, mate });

		
		System.out.println(unibuc);
		
		info = null;
		
		System.out.println(unibuc);
		
		mate.getProfesori()[1] = null;
		
		System.out.println(mate);
		
		System.out.println(profesorSecundarMate);
		
	}

}
