package projeto_LPA.poo;

public class Carro {

	String marca;
	String modelo;
	String placa;
	String cor;
	String ano;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String acelerar () {
		return "Acelerando";
	}
	
	public String estacionar () {
		return "Estacionando";
	}
	
	public String acionarLimpador () {
		return "Limpador ligado";
	}
	public int acionarTurbo () {
		return 125;
	}
	
}