package tp9.cycles.bo;

import java.util.ArrayList;
import java.util.List;

public class Magasin {
	private List<Cycle> stock = new ArrayList<Cycle>();
	
	public void ajouterCycle(Cycle cycle) {
		stock.add(cycle);
	}
	
	@Override
	public String toString() {
		String result = "";
		
		for (Cycle current : stock) {
			result += current + "\n\n";
		}
		
		return result;
	}
}
