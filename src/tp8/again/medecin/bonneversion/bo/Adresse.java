package tp8.again.medecin.bonneversion.bo;

public class Adresse {
/*
 * a. D’un numéro de voie, d’un complément (bis, ter…), d’un type de voie, d’un nom de rue, d’un code postal, d’une ville en lettres majuscules, et d’éventuelles mentions complémentaires (appartement, étage…)
b. D’un constructeur permettant d’initialiser toutes les valeurs, et d’un autres permettant d’ignorer les valeurs facultatives, qui seront alors initialisées à null.
c. D’une méthode afficher()
 */
	private int numero;
	private String complement;
	private String typeVoie;
	private String nomRue;
	private String codePostal;
	private String ville;
	private String mentionsComplementaires;
	
	
	public Adresse(int numero, String complement, String typeVoie, String nomRue, String codePostal, String ville,
			String mentionsComplementaires) {
		this.numero = numero;
		this.complement = complement;
		this.typeVoie = typeVoie;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville.toUpperCase();
		this.mentionsComplementaires = mentionsComplementaires;
	}


	public Adresse(int numero, String typeVoie, String nomRue, String codePostal, String ville) {
		this.numero = numero;
		this.typeVoie = typeVoie;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville.toUpperCase();
	}

	public void afficher() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", complement=" + complement + ", typeVoie=" + typeVoie + ", nomRue="
				+ nomRue + ", codePostal=" + codePostal + ", ville=" + ville.toUpperCase() + ", mentionsComplementaires="
				+ mentionsComplementaires + "]";
	}
	
	
}
