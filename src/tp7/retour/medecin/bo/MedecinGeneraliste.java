package tp7.retour.medecin.bo;

import java.util.ArrayList;
import java.util.List;

public class MedecinGeneraliste {
	private String nom;
	private String prenom;
	private String telephone;
	private Adresse adresse;
	
	private List<Creneau> creneaux = new ArrayList<Creneau>();
	
	private static int tarif;

	public MedecinGeneraliste(String nom, String prenom, String telephone, Adresse adresse) {
		setNom(nom);
		setPrenom(prenom);
		setTelephone(telephone);
		setAdresse(adresse);
	}
	
	public void ajouterCreneau(Creneau creneau) {
		creneaux.add(creneau);
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
	
	public Adresse getAdresse() {
		return adresse;
	}
	
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public List<Creneau> getCreneaux() {
		return creneaux;
	}

	public static int getTarif() {
		return tarif;
	}

	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}

	@Override
	public String toString() {
		String result = "MedecinGeneraliste [nom="
					+ nom
					+ ", prenom="
					+ prenom
					+ ", telephone="
					+ telephone
					+ ", adresse="
					+ adresse
					+ ", tarif="
					+ tarif;
		
		result += "\nCreneaux :\n";
		for (Creneau current : creneaux) {
			result += " - " + current.getHeureDebut() + " (" + current.getDuree() + " minutes)\n";
		}
		
		
		result += "]";
		return result;
	}
	
	
	
}
