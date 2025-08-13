package projeto_LPA.poo;

public class objeto_carro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();

		carro1.setMarca("Honda");
		carro1.setModelo("Civic");
		carro1.setPlaca("FVT1E58");
		carro1.setCor("Branco");
		carro1.setAno("2025");
		
		carro2.setMarca("Hyunday");
		carro2.setModelo("Creta");
		carro2.setPlaca("HTM7A89");
		carro2.setCor("Vermelho");
		carro2.setAno("2021");

		System.out.println("------CARRO 01------");
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getAno());
		System.out.println(carro1.acelerar());
		System.out.println(carro1.acionarTurbo());
		
		System.out.println("------CARRO 02------");
		System.out.println(carro2.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro2.getPlaca());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getAno());
		System.out.println(carro1.acionarLimpador());
		System.out.println(carro1.estacionar());
	}
	}