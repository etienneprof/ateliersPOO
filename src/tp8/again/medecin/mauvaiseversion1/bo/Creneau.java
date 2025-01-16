package tp8.again.medecin.mauvaiseversion1.bo;

import java.time.LocalTime;

public class Creneau {
	private LocalTime heureDebut;
	private int duree;
	private MedecinGeneraliste medecinG;
	private MedecinSpecialiste medecinS;
	
	public Creneau(String heureDebut, int duree, MedecinGeneraliste medecin) {
		this.heureDebut = LocalTime.parse(heureDebut);
		this.duree = duree;
		this.medecinG = medecin;
		
		// dès la création du créneau, j'informe le médecin qu'il est associé à ce créneau
		this.medecinG.ajouterCreneau(this);
	}
	
	public Creneau(String heureDebut, int duree, MedecinSpecialiste medecin) {
		this.heureDebut = LocalTime.parse(heureDebut);
		this.duree = duree;
		this.medecinS = medecin;
		
		// dès la création du créneau, j'informe le médecin qu'il est associé à ce créneau
		this.medecinS.ajouterCreneau(this);
	}
	
	public MedecinGeneraliste getMedecinG() {
		return medecinG;
	}
	
	public MedecinSpecialiste getMedecinS() {
		return medecinS;
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
	
	public void setMedecinG(MedecinGeneraliste medecinG) {
		this.medecinG = medecinG;
	}
	
	public void setMedecinS(MedecinSpecialiste medecinS) {
		this.medecinS = medecinS;
	}
}
