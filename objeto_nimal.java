package projeto_LPA.poo;

public class objeto_nimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();
		Animal animal4 = new Animal();
		Animal animal5 = new Animal();

		animal1.setEspecie("Vaca");
		animal1.setClasse("Mamífero");
		animal1.setCor("Preta e branca(manchada)");
		animal1.setIdade("4 anos");
		
		animal2.setEspecie("Cabrito");
		animal2.setClasse("Mamífero");
		animal2.setCor("Branco"); 
		animal2.setIdade("1 ano");
		
		animal3.setEspecie("Cachorro");
		animal3.setClasse("Mamífero");
		animal3.setCor("Preto");
		animal3.setIdade("7 ano");
		
		animal4.setEspecie("Coelho");
		animal4.setClasse("Mamífero");
		animal4.setCor("Bege");
		animal4.setIdade("3 anos");
		
		animal5.setEspecie("Galinha");
		animal5.setClasse("Ave");
		animal5.setCor("Marrom");
		animal5.setIdade("2 anos");
		
		

		System.out.println("------ ANIMAL 1 ------");
		System.out.println(animal1.getEspecie());
		System.out.println(animal1.getClasse());
		System.out.println(animal1.getCor());
		System.out.println(animal1.getIdade());
		
		System.out.println("------ ANIMAL 2 ------");
		System.out.println(animal2.getEspecie());
		System.out.println(animal2.getClasse());
		System.out.println(animal2.getCor());
		System.out.println(animal2.getIdade());	
		
		System.out.println("------ ANIMAL 3 ------");
		System.out.println(animal3.getEspecie());
		System.out.println(animal3.getClasse());
		System.out.println(animal3.getCor());
		System.out.println(animal3.getIdade());
		
		System.out.println("------ ANIMAL 4 ------");
		System.out.println(animal4.getEspecie());
		System.out.println(animal4.getClasse());
		System.out.println(animal4.getCor());
		System.out.println(animal4.getIdade());
		
		System.out.println("------ ANIMAL 5 ------");
		System.out.println(animal5.getEspecie());
		System.out.println(animal5.getClasse());
		System.out.println(animal5.getCor());
		System.out.println(animal5.getIdade());
	
	}


}
