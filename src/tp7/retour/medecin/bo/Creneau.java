package tp7.retour.medecin.bo;

import java.time.LocalTime;

public class Creneau {
	private LocalTime heureDebut;
	private int duree;
	private MedecinGeneraliste medecin;
	
	public Creneau(String heureDebut, int duree, MedecinGeneraliste medecin) {
		this.heureDebut = LocalTime.parse(heureDebut);
		this.duree = duree;
		this.medecin = medecin;
		
		// dès la création du créneau, j'informe le médecin qu'il est associé à ce créneau
		this.medecin.ajouterCreneau(this);
	}
	
	public MedecinGeneraliste getMedecin() {
		return medecin;
	}
	
	public LocalTime getHeureDebut() {
		return heureDebut;
	}
	
	public void setHeureDebut(LocalTime heureDebut) {
		this.heureDebut = heureDebut;
	}
	
	public int getDuree() {
		return duree;
	}
	
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	public void setMedecin(MedecinGeneraliste medecin) {
		this.medecin = medecin;
	}

	@Override
	public String toString() {
		return "Creneau [heureDebut=" + heureDebut + ", duree=" + duree + ", medecin=" + medecin + "]";
	}
}
