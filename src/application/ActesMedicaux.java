package application;

import java.util.Date;

public class ActesMedicaux {

	private int IDSoin;
	private Date DebutSoin;
	private float PrixComtabilise;
	private Date FinSoin;
    private boolean EtatActe;
	
	public void setIDSoin(int IDSoin) {
		this.IDSoin = IDSoin;
	}
	public int getIDSoin() {
		return IDSoin;
	}
	public Date getDebutSoin() {
		return DebutSoin;
	}
	public void setDebutSoin(Date debutSoin) {
		DebutSoin = debutSoin;
	}
	public float getPrixComtabilise() {
		return PrixComtabilise;
	}
	public void setPrixComtabilise(float PrixComtabilise) {
		this.PrixComtabilise = PrixComtabilise;
	}
	public void setFinSoin(Date finSoin) {
		FinSoin = finSoin;
	}
	public Date getFinSoin() {
		return FinSoin;
	}
	public boolean isEtatActe() {
		return EtatActe;
	}
	public void setEtatActe(boolean etatActe) {
		EtatActe = etatActe;
	}
}