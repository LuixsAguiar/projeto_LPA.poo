package projeto_LPA.poo;

public class objetos_passoas {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		pessoa1.setNome("tom cruze");
		pessoa1.setIdade(40);
		pessoa1.setEndereco("California, USA");
		pessoa1.setProfissao("Ator");
		pessoa1.setCPF("469.855.238-97");
		pessoa1.setRG("59.377.354.8");

		pessoa2.setNome("messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("inter maiami");
		pessoa2.setProfissao("Jogador de futebol");
		pessoa1.setCPF("469.855.238-96");
		pessoa1.setRG("59.377.354.6");

		System.out.println("------OBJETO 01-----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
		System.out.println(pessoa1.getCPF());
		System.out.println(pessoa1.getRG());
		
		System.out.println("-------Objeto 02-------");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
		System.out.println(pessoa1.getCPF());
		System.out.println(pessoa1.getRG());
	}
	}

