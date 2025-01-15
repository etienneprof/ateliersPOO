package tp.visite.medecin.test;

import java.time.LocalDate;
import tp.visite.medecin.bo.Patient;

public class TestPatient {
	public static void main(String[] args) {
		Patient americain = new Patient("Americain", "Patient", "0000000000", 'M', 1234567891234L, LocalDate.of(1980, 7, 5), "diabete");
		Patient anglais = new Patient("Anglais", "Patient", "0000000000", 'M', 1234567891234L, LocalDate.of(1980, 7, 5));
		
		anglais.afficher();
		americain.afficher();
	}
}
