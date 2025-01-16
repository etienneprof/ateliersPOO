package tp7.retour.medecin.test;

import java.time.LocalDate;

import tp7.retour.medecin.bo.Adresse;
import tp7.retour.medecin.bo.MedecinGeneraliste;
import tp7.retour.medecin.bo.Patient;

public class TestAssociationAdresse {
	public static void main(String[] args) {
		Adresse adr1 = new Adresse(2, "bis", "Rue", "Calvaire (du)", "44300", "Nantes", "oui");
		Adresse adr2 = new Adresse(42, "Boulevard", "Massacre (du)", "44300", "Nantes");
		
		MedecinGeneraliste watson = new MedecinGeneraliste("Watson", "John", "0987654321", adr1);
		MedecinGeneraliste house = new MedecinGeneraliste("House", "Gregory", "0456789123", adr2);
		
		Patient americain = new Patient("Americain", "Patient", "0000000000", 'M', 1234567891234L, LocalDate.of(1980, 7, 5), "diabete", adr1);
		Patient anglais = new Patient("Anglais", "Patient", "0000000000", 'M', 1234567891234L, LocalDate.of(1980, 7, 5), adr2);
		
		System.out.println(watson);
		System.out.println(house);
		System.out.println(americain);
		System.out.println(anglais);
	}
}
