package tp7.retour.medecin.test;

import tp7.retour.medecin.bo.Adresse;
import tp7.retour.medecin.bo.Creneau;
import tp7.retour.medecin.bo.MedecinGeneraliste;

public class TestAssociationCreneaux {
	public static void main(String[] args) {
		Adresse adr = new Adresse(42, "Boulevard", "Massacre (du)", "44300", "Nantes");
		
		MedecinGeneraliste watson = new MedecinGeneraliste("Watson", "John", "0987654321", adr);
		MedecinGeneraliste house = new MedecinGeneraliste("House", "Gregory", "0456789123", adr);
		
		new Creneau("09:00", 15, watson);
		new Creneau("09:15", 15, watson);
		new Creneau("09:30", 15, watson);
		new Creneau("09:45", 15, watson);
		new Creneau("10:30", 15, watson);
		new Creneau("10:45", 15, watson);
		new Creneau("11:00", 15, watson);
		new Creneau("11:15", 15, watson);
		new Creneau("11:30", 15, watson);
		new Creneau("14:00", 30, watson);
		new Creneau("14:30", 30, watson);
		new Creneau("15:00", 30, watson);
		new Creneau("15:30", 30, watson);
		new Creneau("16:00", 30, watson);
		new Creneau("16:30", 30, watson);
		
		new Creneau("09:00", 15, house);
		new Creneau("09:15", 15, house);
		new Creneau("09:30", 15, house);
		new Creneau("09:45", 15, house);
		new Creneau("10:30", 15, house);
		new Creneau("10:45", 15, house);
		new Creneau("11:00", 15, house);
		new Creneau("11:15", 15, house);
		new Creneau("11:30", 15, house);
		new Creneau("14:00", 30, house);
		new Creneau("14:30", 30, house);
		new Creneau("15:00", 30, house);
		new Creneau("15:30", 30, house);
		new Creneau("16:00", 30, house);
		new Creneau("16:30", 30, house);
		
		System.out.println(watson);
		System.out.println(house);
	}
}
