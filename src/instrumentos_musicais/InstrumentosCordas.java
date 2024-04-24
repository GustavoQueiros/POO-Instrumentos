package instrumentos_musicais;

public class InstrumentosCordas extends InstrumentosMusicais {

	private String modelo;
	private int numCordas;
	private int ano;

	public InstrumentosCordas(String instrumento, String modelo, int numCordas, int ano) {
		super(instrumento);
		this.modelo = modelo;
		this.numCordas = numCordas;
		this.ano = ano;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumCordas() {
		return numCordas;
	}

	public void setNumCordas(int numCordas) {
		this.numCordas = numCordas;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public void visualizar() {

		super.visualizar();

		System.out.println("Modelo: " + this.modelo);
		System.out.println("Número de Cordas: " + this.numCordas);
		System.out.println("Ano de fabricação: " + this.ano);
	}

}