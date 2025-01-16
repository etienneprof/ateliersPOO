package tp8.again.medecin.mauvaiseversion2.bo;

import java.util.ArrayList;
import java.util.List;

public class MedecinGeneraliste extends Personne {
	protected List<Creneau> creneaux = new ArrayList<Creneau>();
	
	private static int tarif;

	public MedecinGeneraliste(String nom, String prenom, String telephone, Adresse adresse) {
		super(nom, prenom, telephone, adresse);
	}
	
	public void ajouterCreneau(Creneau creneau) {
		creneaux.add(creneau);
	}
	
	public void afficher() {
		System.out.println(toString());
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
