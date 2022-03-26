package application;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.application.Platform;
import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class New_adminController {
	@FXML
	private Label time;
	@FXML
	private TextField login;
	@FXML
	private PasswordField passwd;
	@FXML
	private PasswordField passwd2;
	@FXML
	private TextField name;
	@FXML
	private Label error;
	
	@FXML
	private void initialize() {
		// Afficher et mettre à jour la date
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		Thread thread = new Thread(() -> {
			while(true){
				LocalDateTime timenow = LocalDateTime.now();
	            Platform.runLater(() -> {
	            	time.setText(dtf.format(timenow));
	            });
	            try{
	                Thread.sleep(1000);
	            }catch(Exception e){
	                System.out.println(e);
	            }
	        }
		});
		thread.start();
	}
	
	public void newAdmin() throws IOException {
		if (!passwd.equals(passwd2)) {
			error.setText("Veuillez confirmer votre password");
		}
		else if (name.equals(null) || login.equals(null) || passwd.equals(null) || passwd2.equals(null)) {
			error.setText("Tous les champs sont obligatoires");
		}
		else {
			try (FileOutputStream fos = new FileOutputStream("admin",true);
				 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				    Dentiste dentiste = new Dentiste(login.getText(),passwd.getText(),name.getText());
				    oos.writeObject(dentiste);
				} catch (IOException ex) {
				    ex.printStackTrace();
				}
			Main main = new Main();
			main.changeScene("Sign_in.fxml");
		}
	}
}
