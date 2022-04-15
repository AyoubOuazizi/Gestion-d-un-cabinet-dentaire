package application;

import java.awt.Button;
import java.util.Date;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class GestionActesMedicauxController {
	
	@FXML
	private TableView<ActesMedicaux> ActesData;
	@FXML
	private TableColumn<ActesMedicaux, Integer> ActeID;
	@FXML
	private TableColumn<ActesMedicaux, Date> ActeDebut;
	@FXML
	private TableColumn<ActesMedicaux, Float> ActePrix;
	@FXML
	private TableColumn<ActesMedicaux, Date> ActeFin;
	@FXML
	private TableColumn<ActesMedicaux, Boolean> ActeEtat;
	
	private ObservableList<ActesMedicaux> acteList = FXCollections.observableArrayList();
	
	@FXML
	private DatePicker newDateDebut;
	@FXML
	private TextField newPrix;
    @FXML
    private Button newEtatActe;
    
    private static boolean deleteSel;
    private static boolean modifSel;
    
    public boolean isDel() {
		return deleteSel;
	}
    
    public boolean isModif() {
		return modifSel;
	}

}
