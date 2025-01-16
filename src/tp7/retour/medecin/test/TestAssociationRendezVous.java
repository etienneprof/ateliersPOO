package tp7.retour.medecin.test;

import java.time.LocalDate;

import tp7.retour.medecin.bo.Adresse;
import tp7.retour.medecin.bo.Creneau;
import tp7.retour.medecin.bo.MedecinGeneraliste;
import tp7.retour.medecin.bo.Patient;
import tp7.retour.medecin.bo.RendezVous;

public class TestAssociationRendezVous {
	public static void main(String[] args) {
		Adresse adr = new Adresse(42, "Boulevard", "Massacre (du)", "44300", "Nantes");
		
		MedecinGeneraliste watson = new MedecinGeneraliste("Watson", "John", "0987654321", adr);
		MedecinGeneraliste house = new MedecinGeneraliste("House", "Gregory", "0456789123", adr);
		
		Patient americain = new Patient("Americain", "Patient", "0000000000", 'M', 1234567891234L, LocalDate.of(1980, 7, 5), "diabete", adr);
		Patient anglais = new Patient("Anglais", "Patient", "0000000000", 'M', 1234567891234L, LocalDate.of(1980, 7, 5), adr);
		
		Creneau cw1 = new Creneau("09:00", 15, watson);
		Creneau cw2 = new Creneau("09:15", 15, watson);
		Creneau cw3 = new Creneau("09:30", 15, watson);
		Creneau cw4 = new Creneau("09:45", 15, watson);
		Creneau cw5 = new Creneau("10:30", 15, watson);
		
		Creneau ch1 = new Creneau("09:00", 15, house);
		Creneau ch2 = new Creneau("09:15", 15, house);
		Creneau ch3 = new Creneau("09:30", 15, house);
		
		RendezVous rdv1 = new RendezVous(cw3, LocalDate.of(2025, 1, 17), anglais);
		RendezVous rdv2 = new RendezVous(ch1, LocalDate.of(2025, 1, 18), americain);
		
		System.out.println(rdv1);
		System.out.println("***********");
		System.out.println(rdv2);
		
	}
}
