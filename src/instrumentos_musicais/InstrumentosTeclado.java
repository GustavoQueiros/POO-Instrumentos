package instrumentos_musicais;

public class InstrumentosTeclado extends InstrumentosMusicais {

	private String cor;
	private String material;
	private int numTeclas;

	public InstrumentosTeclado(String instrumento, String cor, String material, int numTeclas) {
		super(instrumento);
		this.cor = cor;
		this.material = material;
		this.numTeclas = numTeclas;

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getNumTeclas() {
		return numTeclas;
	}

	public void setNumTeclas(int numTeclas) {
		this.numTeclas = numTeclas;
	}

	@Override
	public void visualizar() {

		super.visualizar();

		System.out.println("Cor: " + this.cor);
		System.out.println("Material: " + this.material);
		System.out.println("Número de Teclas: " + this.numTeclas);

	}

}
