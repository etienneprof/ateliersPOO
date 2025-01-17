package tp9.cycles.bo;

import java.time.LocalDate;

public class Gyroroue extends Gyrocycle {
	private static final float TARIF = 18.90f;

	public Gyroroue(String marque, String modele, LocalDate dateAchat, int autonomie) {
		super(marque, modele, dateAchat, autonomie);
	}

	@Override
	public float getTarif() {
		return TARIF;
	}
}
