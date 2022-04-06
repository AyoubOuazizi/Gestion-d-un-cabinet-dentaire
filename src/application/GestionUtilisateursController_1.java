package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GestionUtilisateursController_1 extends GestionUtilisateurs{
	@FXML
	private TextField nom;
	@FXML
	private TextField login;
	@FXML
	private Label msg;
	private Sign_in_Controller m = new Sign_in_Controller();
	
	@FXML
	protected void initialize() {
		nom.setText(m.getUserName());
		login.setText(m.getUserLogin());
		super.initialize();
		if (!m.isAdmin()) {
			super.info.setVisible(false);
			super.dentistes.setVisible(false);
			super.assistants.setVisible(false);
		}
	}
	
	public void confirmer(ActionEvent event) throws IOException {
		if (nom.getText().isBlank() || login.getText().isBlank()) {
			msg.setText("Tous les champs sont obligatoires");
		}
		else if (nom.getText().equals(m.getUserName()) && login.getText().equals(m.getUserLogin())) {
			Alert confirm = new Alert(Alert.AlertType.INFORMATION);
	    	confirm.setHeaderText(null);
	    	confirm.setTitle("Confirmation");
	    	confirm.setContentText("Mise à jour effectuée avec succès");
	    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    	confirm.initOwner(stage);
	    	confirm.show();
		}
		else {
			msg.setText("Tous les champs sont obligatoires");
		}
	}
}
