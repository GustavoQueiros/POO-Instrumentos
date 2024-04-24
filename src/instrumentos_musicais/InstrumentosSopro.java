package instrumentos_musicais;

public class InstrumentosSopro extends InstrumentosMusicais {

	private String material;
	private int bocais;
	private int palheta;

	public InstrumentosSopro(String instrumento, String material, int bocais, int palheta) {
		super(instrumento);
		this.material = material;
		this.bocais = bocais;
		this.palheta = palheta;

	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getBocais() {
		return bocais;
	}

	public void setBocais(int bocais) {
		this.bocais = bocais;
	}

	public int getPalheta() {
		return palheta;
	}

	public void setPalheta(int palheta) {
		this.palheta = palheta;
	}

	@Override
	public void visualizar() {

		super.visualizar();

		System.out.println("Material: " + this.material);
		System.out.println("Quantidade de Bocais: " + this.bocais);
		System.out.println("Palheta: " + this.palheta);
	}

}
