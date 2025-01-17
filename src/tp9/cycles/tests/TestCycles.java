package tp9.cycles.tests;

import java.time.LocalDate;

import tp9.cycles.bo.Gyropode;
import tp9.cycles.bo.Gyroroue;
import tp9.cycles.bo.Magasin;
import tp9.cycles.bo.Velo;

public class TestCycles {
	public static void main(String[] args) {
		Magasin decathlon = new Magasin();
		decathlon.ajouterCycle(new Velo("Lapierre", "Speed Run 400", LocalDate.of(2021, 3, 25), 27));
		decathlon.ajouterCycle(new Velo("Btwin", "Riverside", LocalDate.of(2022, 4, 10), 10));
		decathlon.ajouterCycle(new Gyropode("Segway", "Ninebot Elite", LocalDate.of(2022, 3, 12), 40, 90));
		decathlon.ajouterCycle(new Gyropode("Weebot", "echo", LocalDate.of(2022, 3, 12), 35, 160));
		decathlon.ajouterCycle(new Gyroroue("Immotion", "v8", LocalDate.of(2022, 3, 12), 40));
		decathlon.ajouterCycle(new Gyroroue("Segway", "Ninebot One E+", LocalDate.of(2020, 12, 4), 30));
		
		System.out.println(decathlon);
	}
}
