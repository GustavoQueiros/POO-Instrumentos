package instrumentos_musicais;

public class InstrumentosPercussao extends InstrumentosMusicais {

	private String pele;
	private String tamanho;
	private int pratos;

	public InstrumentosPercussao(String instrumento, String pele, String tamanho, int pratos) {
		super(instrumento);
		this.pele = pele;
		this.tamanho = tamanho;
		this.pratos = pratos;

	}

	public String getPele() {
		return pele;
	}

	public void setPele(String pele) {
		this.pele = pele;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getPratos() {
		return pratos;
	}

	public void setPratos(int pratos) {
		this.pratos = pratos;
	}

	@Override
	public void visualizar() {

		super.visualizar();

		System.out.println("Pele: " + this.pele);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Pratos: " + this.pratos);

	}

}
