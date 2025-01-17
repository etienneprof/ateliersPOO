package tp9.cycles.bo;

import java.time.LocalDate;

public class Velo extends Cycle {
	private int vitesses;
	
	private static final float TARIF = 4.90f;

	public Velo(String marque, String modele, LocalDate dateAchat, int vitesses) {
		super(marque, modele, dateAchat);
		this.vitesses = vitesses;
	}
	
	@Override
	public float getTarif() {
		return TARIF;
	}

	public int getVitesses() {
		return vitesses;
	}
	
	public void setVitesses(int vitesses) {
		this.vitesses = vitesses;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\n\t· "
				+ vitesses + " vitesses";
	}
	
	
}
