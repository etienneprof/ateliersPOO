package tp8.again.medecin.mauvaiseversion1.bo;

import java.util.ArrayList;
import java.util.List;

public class MedecinSpecialiste extends Personne {
	private List<Creneau> creneaux = new ArrayList<Creneau>();
	
	private int tarif;
	private String specialite;

	public MedecinSpecialiste(String nom, String prenom, String telephone, Adresse adresse, int tarif, String specialite) {
		super(nom, prenom, telephone, adresse);
		this.tarif = tarif;
		this.specialite = specialite;
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

	public int getTarif() {
		return tarif;
	}

	public void setTarif(int tarif) {
		this.tarif = tarif;
	}

	@Override
	public String toString() {
		String result = "MedecinSpecialiste [nom="
					+ nom
					+ ", prenom="
					+ prenom
					+ ", telephone="
					+ telephone
					+ ", adresse="
					+ adresse
					+ ", tarif="
					+ tarif
					+ ", specialite="
					+ specialite;
		
		result += "\nCreneaux :\n";
		for (Creneau current : creneaux) {
			result += " - " + current.getHeureDebut() + " (" + current.getDuree() + " minutes)\n";
		}
		
		
		result += "]";
		return result;
	}
	
	
	
}
