package tp8.again.medecin.bonneversion.bo;

public class MedecinGeneraliste extends Medecin {
	private static int tarif;
	
	public MedecinGeneraliste(String nom, String prenom, String telephone, Adresse adresse) {
		super(nom, prenom, telephone, adresse);
	}
	
	@Override
	public int recupererTarif() {
		return tarif;
	}
	
	public static int getTarif() {
		return tarif;
	}
	
	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}
}
