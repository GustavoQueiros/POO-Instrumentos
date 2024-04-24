package instrumentos_musicais;

public class TestaInstrumentos {

	public static void main(String[] args) {

		InstrumentosCordas guitarra = new InstrumentosCordas("Guitarra", "Les Paul", 6, 1988);
		guitarra.visualizar();

		InstrumentosPercussao tambor = new InstrumentosPercussao("Tambor", "Grossa", "Médio", 0);
		tambor.visualizar();

		InstrumentosSopro flauta = new InstrumentosSopro("Flauta", "Metal", 1, 1);
		flauta.visualizar();

		InstrumentosTeclado piano = new InstrumentosTeclado("Piano", "Marrom", "Madeira", 61);
		piano.visualizar();

	}

}
