package projeto_LPA.poo;

public class objeto_Aviao {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		Aviao aviao3 = new Aviao();
		Aviao aviao4 = new Aviao();

		aviao1.setCompania("Azul");
		aviao1.setNumserie("PR-XMA");
		aviao1.setModelo("Boeing 747");
		aviao1.setClassificacao("Passageiro");
		
		aviao2.setCompania("Gol");
		aviao2.setNumserie("PR-GUO");
		aviao2.setModelo("Boeing 737");
		aviao2.setClassificacao("Cargueiro");
		
		aviao3.setCompania("Emirates AirLine");
		aviao3.setNumserie("PP-LBST");
		aviao3.setModelo("AIRBUS A380");
		aviao3.setClassificacao("Passageiro");
		
		aviao4.setCompania("Voe-Pass");
		aviao4.setNumserie("PS-VPB");
		aviao4.setModelo("ATR 72-500");
		aviao4.setClassificacao("Passageiro");

		System.out.println("------ AVIÃO 1 ------");
		System.out.println(aviao1.getCompania());
		System.out.println(aviao1.getNumserie());
		System.out.println(aviao1.getModelo());
		System.out.println(aviao1.getClassificacao());
		
		System.out.println("------ AVIÃO 2 ------");
		System.out.println(aviao2.getCompania());
		System.out.println(aviao2.getNumserie());
		System.out.println(aviao2.getModelo());
		System.out.println(aviao2.getClassificacao());
		
		System.out.println("------ AVIÃO 3 ------");
		System.out.println(aviao3.getCompania());
		System.out.println(aviao3.getNumserie());
		System.out.println(aviao3.getModelo());
		System.out.println(aviao3.getClassificacao());
		
		System.out.println("------ AVIÃO 4 ------");
		System.out.println(aviao4.getCompania());
		System.out.println(aviao4.getNumserie());
		System.out.println(aviao4.getModelo());
		System.out.println(aviao4.getClassificacao());
	}

}
