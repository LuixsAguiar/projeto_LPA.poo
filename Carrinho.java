package projeto_LPA.poo;

public class Carrinho {

	String marca;
	String modelo;
	String tamanho;
	String cor;

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
	
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	
	}
	
	public String abrirPortinha () {
		return "Abriu a porta";
	}
	
	public String guardarNote () {
		return "Guardou os Notebook";
	}
	
	public String fecharPorta () {
		return "Fechou a porta";
	}
	public String levarEmbora () {
		return "Guardou o carrinho";
	}
	
}