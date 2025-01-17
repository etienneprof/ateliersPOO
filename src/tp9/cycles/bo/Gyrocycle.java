package tp9.cycles.bo;

import java.time.LocalDate;

public abstract class Gyrocycle extends Cycle {
	protected int autonomie;
	
	public Gyrocycle(String marque, String modele, LocalDate dateAchat, int autonomie) {
		super(marque, modele, dateAchat);
		this.autonomie = autonomie;
	}
	
	public int getAutonomie() {
		return autonomie;
	}
	
	public void setAutonomie(int autonomie) {
		this.autonomie = autonomie;
	}

	@Override
	public String toString() {
		return super.toString()
				+ "\n\t· "
				+ autonomie + "km d'autonomie";
	}
}
