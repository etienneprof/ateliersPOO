package tp8.again.medecin.mauvaiseversion1.test;

import java.time.LocalDate;

import tp8.again.medecin.mauvaiseversion1.bo.Adresse;
import tp8.again.medecin.mauvaiseversion1.bo.Creneau;
import tp8.again.medecin.mauvaiseversion1.bo.MedecinGeneraliste;
import tp8.again.medecin.mauvaiseversion1.bo.MedecinSpecialiste;
import tp8.again.medecin.mauvaiseversion1.bo.Patient;
import tp8.again.medecin.mauvaiseversion1.bo.RendezVous;

public class TestAssociationRendezVous {
	public static void main(String[] args) {
		Adresse adr = new Adresse(42, "Boulevard", "Massacre (du)", "44300", "Nantes");
		
		// ajouter tarif + specialite du specialiste
		MedecinSpecialiste watson = new MedecinSpecialiste("Watson", "John", "0987654321", adr, 80, "Kine");
		MedecinGeneraliste house = new MedecinGeneraliste("House", "Gregory", "0456789123", adr);
		MedecinGeneraliste.setTarif(25);
		
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
		
		
		System.out.println(watson);
		System.out.println(house);
		
	}
}
