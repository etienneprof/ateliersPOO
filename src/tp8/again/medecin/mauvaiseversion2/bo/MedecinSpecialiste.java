package tp8.again.medecin.mauvaiseversion2.bo;

public class MedecinSpecialiste extends MedecinGeneraliste {
	private int tarifSpe;
	private String specialite;
	
	public MedecinSpecialiste(String nom, String prenom, String telephone, Adresse adresse, int tarifSpe, String specialite) {
		super(nom, prenom, telephone, adresse);
		this.tarifSpe = tarifSpe;
		this.specialite = specialite;
	}

	public int getTarifSpe() {
		return tarifSpe;
	}

	public void setTarifSpe(int tarifSpe) {
		this.tarifSpe = tarifSpe;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return super.toString() + "[tarif=" + tarifSpe + ", specialite=" + specialite + "]";
	}
}
