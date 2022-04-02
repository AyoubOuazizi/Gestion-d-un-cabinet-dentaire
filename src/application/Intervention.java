package application;

import java.util.Date;

public class Intervention {

	private int IDIntervention;
	private Date DateReelle;
	private Date DatePrevue;
    private String EtatRV;
    
	public void setIDIntervention(int IDIntervention) {
		this.IDIntervention = IDIntervention;
	}
	public int getIDIntervention() {
		return IDIntervention;
	}
	public Date getDateReelle() {
		return DateReelle;
	}
	public void setDateReelle(Date dateReelle) {
		DateReelle = dateReelle;
	}
	public void setDatePrevue(Date datePrevue) {
		DatePrevue = datePrevue;
	}
	public Date getDatePrevue() {
		return DatePrevue;
	}
	public String getEtatRV() {
		return EtatRV;
	}
	public void setEtatActe(String etatRV) {
		EtatRV = etatRV;
	}
}