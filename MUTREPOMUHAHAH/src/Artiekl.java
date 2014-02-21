
public class Artiekl {

	private int Artikelnummer;
	private String Artikename;
	private String Atrikelbezeichnung;
	private int Artikelpreis;

	public Artiekl(int artikelnummer, String artikename,
			String atrikelbezeichnung, int artikelpreis) {
		super();
		Artikelnummer = artikelnummer;
		Artikename = artikename;
		Atrikelbezeichnung = atrikelbezeichnung;
		Artikelpreis = artikelpreis;

	}

	public int getArtikelnummer() {
		return Artikelnummer;
	}

	public String getArtikename() {
		return Artikename;
	}

	public String getAtrikelbezeichnung() {
		return Atrikelbezeichnung;
	}

	public int getArtikelpreis() {
		return Artikelpreis;
	}

}
