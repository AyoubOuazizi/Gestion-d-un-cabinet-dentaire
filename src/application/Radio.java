package application;
import java.util.Date;
public class Radio {
	private int IDRadio;
	private String RemarquesPositives;
	private String RemarquesGenerales;
	private String RemarquesNegatives;
	private Date DateRadio;
    private String CheminImage;
	public int getIDRadio() {
		return IDRadio;
	}
	public void setIDRadio(int iDRadio) {
		IDRadio = iDRadio;
	}
	public String getRemarquesPositives() {
		return RemarquesPositives;
	}
	public void setRemarquesPositives(String remarquesPositives) {
		RemarquesPositives = remarquesPositives;
	}
	public String getRemarquesGenerales() {
		return RemarquesGenerales;
	}
	public void setRemarquesGenerales(String remarquesGenerales) {
		RemarquesGenerales = remarquesGenerales;
	}
	public String getRemarquesNegatives() {
		return RemarquesNegatives;
	}
	public void setRemarquesNegatives(String remarquesNegatives) {
		RemarquesNegatives = remarquesNegatives;
	}
	public Date getDateRadio() {
		return DateRadio;
	}
	public void setDateRadio(Date dateRadio) {
		DateRadio = dateRadio;
	}
	public String getCheminImage() {
		return CheminImage;
	}
	public void setCheminImage(String cheminImage) {
		CheminImage = cheminImage;
	}
}
