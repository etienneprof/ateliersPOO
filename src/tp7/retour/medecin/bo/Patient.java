package tp7.retour.medecin.bo;

import java.time.LocalDate;

public class Patient {
	private String nom;
	private String prenom;
	private String telephone;
	private char sexe;
	private long secu;
	private LocalDate dateNaissance;
	private String commentaires;
	private Adresse adresse;
	
	public Patient(String nom, String prenom, String telephone, char sexe, long secu, LocalDate dateNaissance,
			String commentaires, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.sexe = sexe;
		this.secu = secu;
		this.dateNaissance = dateNaissance;
		this.commentaires = commentaires;
		this.adresse = adresse;
	}
	
	
	public Patient(String nom, String prenom, String telephone, char sexe, long secu, LocalDate dateNaissance, Adresse adresse) {
		this(nom, prenom, telephone, sexe, secu, dateNaissance, "", adresse);
	}
	
	public void afficher() {
		System.out.println(toString());
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	public long getSecu() {
		return secu;
	}

	public void setSecu(long secu) {
		this.secu = secu;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		String result = "Patient [nom="
				+ nom
				+ ", prenom="
				+ prenom
				+ ", telephone="
				+ telephone
				+ ", adresse="
				+ adresse
				+ ", sexe="
				+ sexe
				+ ", secu="
				+ secu
				+ ", dateNaissance="
				+ dateNaissance
				+ ", commentaires=";
		
		if (commentaires == null || commentaires.isBlank()) {
			result += " - ";
		} else {
			result += commentaires;
		}
		result +=  "]";
		return result;
	}
	
	public String toStringAvecTernaire() {
		return "Patient [nom="
				+ nom
				+ ", prenom="
				+ prenom
				+ ", telephone="
				+ telephone
				+ ", sexe="
				+ sexe
				+ ", secu="
				+ secu
				+ ", dateNaissance="
				+ dateNaissance
				+ ", commentaires="
				+ (commentaires.isBlank() ? " - " : commentaires) // ternaire
				+ "]";
	}
}
