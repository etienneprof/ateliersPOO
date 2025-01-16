package tp8.again.medecin.bonneversion.bo;

import java.time.LocalDate;

public class RendezVous {
	private Creneau creneau;
	private LocalDate date;
	private Patient patient;
	
	public RendezVous(Creneau creneau, LocalDate date, Patient patient) {
		this.creneau = creneau;
		this.date = date;
		this.patient = patient;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		result += 	"Rendez-vous du "
					+ date
					+ " à "
					+ creneau.getHeureDebut()
					+ " ("
					+ creneau.getDuree()
					+ " minutes)"
					+ "\n";
		
		result += "avec le Dr " + creneau.getMedecin().getNom() + "\n";
		result += "Patient : \n" + patient + "\n";
		result += "A l'adresse :\n" + creneau.getMedecin().getAdresse();
		
		return result;
	}
}
