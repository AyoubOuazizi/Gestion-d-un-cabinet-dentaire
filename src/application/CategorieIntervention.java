package application;

public class CategorieIntervention {
	private int IDCategorie;
	private String Type;
	private float PrixBase;
	public void setIDCategorie(int IDCategorie) {
		this.IDCategorie = IDCategorie;
	}
	public int getCategorie() {
		return IDCategorie;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getType() {
		return Type;
	}
	public void setPrixBase(float PrixBase) {
		this.PrixBase = PrixBase;
	}
	public float getPrixBase() {
		return PrixBase;
	}
}