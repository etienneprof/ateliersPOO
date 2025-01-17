package tp9.cycles.bo;

import java.time.LocalDate;

public abstract class Cycle {
	protected String marque;
	protected String modele;
	protected LocalDate dateAchat;
	
	public Cycle(String marque, String modele, LocalDate dateAchat) {
		this.marque = marque;
		this.modele = modele;
		this.dateAchat = dateAchat;
	}
	
	public abstract float getTarif();

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public LocalDate getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(LocalDate dateAchat) {
		this.dateAchat = dateAchat;
	}
	
	@Override
	public String toString() {
		String intro = getClass().getSimpleName()
				+ " "
				+ marque
				+ " "
				+ modele
				+ " : ";
		
		int introLength = intro.length();

		String tarif = String.format(" %.2f€/heure", getTarif());
		int tarifLength = tarif.length();
		
		int fillerLength = 64 - introLength - tarifLength;
		
		String filler = ".".repeat(fillerLength);
		
		String result = intro
						+ filler
						+ tarif
						+ "\n\t· "
						+ "Acheté le " + dateAchat;
		
		return result;
	}
}
