package instrumentos_musicais;

public class InstrumentosMusicais {

	private String instrumento;

	public InstrumentosMusicais(String instrumento) {
		this.instrumento = instrumento;
	}
	

	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	public void visualizar() {

		System.out.println("\n\n************************************************************");
		System.out.println("Informações do Instrumento ");
		System.out.println("************************************************************");
		System.out.println("Instrumento: " + this.instrumento);
	}

}
