package tp.visite.medecin.test;

import tp.visite.medecin.bo.MedecinGeneraliste;

public class TestMedecin {
	public static void main(String[] args) {
		MedecinGeneraliste ameli = new MedecinGeneraliste("CPAM", "Ameli", "0123456789");
		MedecinGeneraliste watson = new MedecinGeneraliste("Watson", "John", "0987654321");
		MedecinGeneraliste house = new MedecinGeneraliste("House", "Gregory", "0456789123");
		
		MedecinGeneraliste.setTarif(25);
		
		ameli.afficher();
		watson.afficher();
		house.afficher();
		
		MedecinGeneraliste.setTarif(27);
		watson.setTelephone("0852714936");
		
		ameli.afficher();
		watson.afficher();
		house.afficher();
	}
}
