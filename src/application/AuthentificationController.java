package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;

import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class AuthentificationController {
	@FXML
	private Label msg;
	@FXML
	private PasswordField passwd;
	private GestionUtilisateursController_2 g = new GestionUtilisateursController_2();
	private GestionUtilisateursController_3 n = new GestionUtilisateursController_3();
	private GestionActesMedicauxController r = new GestionActesMedicauxController();
	private static boolean passValide;
	
	public boolean passValide() {
		return passValide;
	}
	
	public void passDefault() {
		passValide = false;
	}
	
	// Event Listener on Button.onAction
	@FXML
	public void confirm(ActionEvent event) throws IOException {
		Sign_in_Controller m = new Sign_in_Controller();
		if (passwd.getText().equals(m.getUserPass())) {
			if (g.isDel() || n.isDel()) {
				passValide = true;
				Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				stage.close();
			} else if (r.isModif()) {
				Parent pane = FXMLLoader.load(getClass().getResource("EditActeMed.fxml"));
				Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				stage.getScene().setRoot(pane);
				stage.sizeToScene();
				stage.centerOnScreen();
			}
			else {
				Parent pane = FXMLLoader.load(getClass().getResource("EditUser.fxml"));
				Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				stage.getScene().setRoot(pane);
				stage.sizeToScene();
				stage.centerOnScreen();
			}
		}
		else if (passwd.getText().isBlank()) {
			msg.setText("Ce champ est obligatoire");
		}
		else {
			msg.setText("Le password est incorrect");
		}
	}
}
