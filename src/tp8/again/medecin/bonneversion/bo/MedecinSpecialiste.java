package tp8.again.medecin.bonneversion.bo;

public class MedecinSpecialiste extends Medecin {
	private int tarif;
	private String specialite;
	
	public MedecinSpecialiste(String nom, String prenom, String telephone, Adresse adresse, int tarif, String specialite) {
		super(nom, prenom, telephone, adresse);
		this.tarif = tarif;
		this.specialite = specialite;
	}
	
	@Override
	public int recupererTarif() {
		return tarif;
	}
	
	public int getTarif() {
		return tarif;
	}
	
	public void setTarif(int tarif) {
		this.tarif = tarif;
	}
	
	public String getSpecialite() {
		return specialite;
	}
	
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "MedecinSpecialiste [tarif=" + tarif + ", specialite=" + specialite + ", nom=" + nom + ", prenom="
				+ prenom + ", telephone=" + telephone + ", adresse=" + adresse + "]";
	}
}
