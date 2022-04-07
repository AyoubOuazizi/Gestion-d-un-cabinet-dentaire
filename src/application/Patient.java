package application;

import java.util.Date;

public class Patient {
	private int IDPatient;
	private Date DateNaissance;
	private String CIN;
	private String Nom;
	private String Prenom;
	private char Sexe;
	
	/*public Patient(int ID, Date DateNaissance, String cin, String nom, String prenom, char sexe) {
		set
	}*/
	
	public int getIDPatient() {
		return IDPatient;
	}
	public void setIDPatient(int IDPatient) {
		this.IDPatient = IDPatient;
	}
	public Date getDateNaissance() {
		return DateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		DateNaissance = dateNaissance;
	}
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String CIN) {
		this.CIN = CIN;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public char getSexe() {
		return Sexe;
	}
	public void setSexe(char sexe) {
		Sexe = sexe;
	}
}
