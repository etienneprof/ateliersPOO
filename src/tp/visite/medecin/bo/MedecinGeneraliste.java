package tp.visite.medecin.bo;

public class MedecinGeneraliste {
	private String nom;
	private String prenom;
	private String telephone;
	
	private static int tarif;

	public MedecinGeneraliste(String nom, String prenom, String telephone) {
		setNom(nom);
		setPrenom(prenom);
		setTelephone(telephone);
	}
	
	public void afficher() {
		System.out.println(toString());
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public static int getTarif() {
		return tarif;
	}

	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}

	@Override
	public String toString() {
		return "MedecinGeneraliste [nom="
					+ nom
					+ ", prenom="
					+ prenom
					+ ", telephone="
					+ telephone
					+ ", tarif="
					+ tarif
				+ "]";
	}
	
	
	
}
