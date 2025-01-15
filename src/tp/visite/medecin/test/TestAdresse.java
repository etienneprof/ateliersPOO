package tp.visite.medecin.test;

import tp.visite.medecin.bo.Adresse;

public class TestAdresse {
	public static void main(String[] args) {
		Adresse adr1 = new Adresse(2, "bis", "Rue", "Calvaire (du)", "44300", "Nantes", "oui");
		Adresse adr2 = new Adresse(42, "Boulevard", "Massacre (du)", "44300", "Nantes");
		
		adr1.afficher();
		adr2.afficher();
	}
}
