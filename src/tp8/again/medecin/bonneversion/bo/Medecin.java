package tp8.again.medecin.bonneversion.bo;

import java.util.ArrayList;
import java.util.List;

public class Medecin extends Personne {
	private List<Creneau> creneaux = new ArrayList<Creneau>();

	public Medecin(String nom, String prenom, String telephone, Adresse adresse) {
		super(nom, prenom, telephone, adresse);
	}
	
	// La méthode recupererTarif n'a pas de sens dans la classe Medecin : elle renvoie donc une valeur absurde
	public int recupererTarif() {
		throw new RuntimeException("On ne devrait pas passer par là");
	}
	
	public void ajouterCreneau(Creneau creneau) {
		creneaux.add(creneau);
	}

	public List<Creneau> getCreneaux() {
		return creneaux;
	}

	@Override
	public String toString() {
		String result = "MedecinGeneraliste [nom="
					+ nom
					+ ", prenom="
					+ prenom
					+ ", tarif="
					+ recupererTarif()
					+ ", telephone="
					+ telephone
					+ ", adresse="
					+ adresse;
		
		result += "\nCreneaux :\n";
		for (Creneau current : creneaux) {
			result += " - " + current.getHeureDebut() + " (" + current.getDuree() + " minutes)\n";
		}
		
		result += "]";
		return result;
	}
	
	
	
}
