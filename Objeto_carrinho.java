package projeto_LPA.poo;

public class Objeto_carrinho {

	public static void main(String[] args) {
		
		Carrinho carro1 = new Carrinho();
		Carrinho carro2 = new Carrinho();

		carro1.setMarca("TES");
		carro1.setModelo("Carrinho de 40 Notebook");
		carro1.setTamanho("Grande");
		carro1.setCor("Cinza");
		
		carro2.setMarca("Racktron");
		carro2.setModelo("Carrinho de 25 Notebook");
		carro2.setTamanho("Medio");
		carro2.setCor("Preto");

		System.out.println("------CARRINHO 01------");
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getTamanho());
		System.out.println(carro1.getCor());
		System.out.println(carro1.abrirPortinha());
		System.out.println(carro1.guardarNote());
		
		System.out.println("------CARRINHO 02------");
		System.out.println(carro2.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro2.getTamanho());
		System.out.println(carro2.getCor());
		System.out.println(carro1.fecharPorta());
		System.out.println(carro1.levarEmbora());
	}
	}
