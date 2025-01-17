package tp9.cycles.bo;

import java.time.LocalDate;

public class Gyropode extends Gyrocycle {
	private int tailleMinimum;
	
	private static final float TARIF = 29.90f;

	public Gyropode(String marque, String modele, LocalDate dateAchat, int autonomie, int tailleMinimum) {
		super(marque, modele, dateAchat, autonomie);
		this.tailleMinimum = tailleMinimum;
	}

	public int getTailleMinimum() {
		return tailleMinimum;
	}
	
	public void setTailleMinimum(int tailleMinimum) {
		this.tailleMinimum = tailleMinimum;
	}

	@Override
	public float getTarif() {
		return TARIF;
	}
	
	@Override
	public String toString() {
		int tailleEnMetre = getTailleMinimum() / 100;
		int resteEnCentimetre = getTailleMinimum() % 100;
		
		return super.toString()
				+ "\n\t· "
				+ "Taille minimum : "
				+ tailleEnMetre
				+ "m"
				+ resteEnCentimetre;
	}
	
}
