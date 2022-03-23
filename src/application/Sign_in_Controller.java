package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class Sign_in_Controller {
	@FXML
	private Label time;
	@FXML
	private ToggleButton button_dentiste;
	@FXML
	private ToggleButton button_assistant;
	@FXML
	private TextField login;
	@FXML
	private PasswordField passwd;
	private static Dentiste dentiste;
	//protected File admin_file = new File(".\\admin");
	
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
	
	public void Dentiste(ActionEvent event) {
        if(!button_dentiste.isSelected()){
        	button_dentiste.setSelected(true);
        }
	}
	
	public static String getDentisteName() {
		return dentiste.getName();
	}
	
	public void Assistant(ActionEvent event) {
        if(!button_assistant.isSelected()){
        	button_assistant.setSelected(true);
        }
	}
	
	public void SeConnecter(ActionEvent event) throws IOException {
		Main main = new Main();
		if (button_dentiste.isSelected()) {
			
			// Se connecter avec le compte par défaut
			File dentFile = new File("admin"); 
			if (dentFile.length() == 0) {
				if (login.getText().equals("admin") && passwd.getText().equals("admin")) {
					main.changeScene("New_admin.fxml");
				}
			}
			
			// Verifier login & passwd pour le Dentiste
			else {
				try{
					FileInputStream fis = new FileInputStream("admin");
					while (fis.available() > 0) {
						ObjectInputStream ois = new ObjectInputStream(fis);
						dentiste = (Dentiste) ois.readObject();
						if (dentiste.getLogin().equals(login.getText()) && dentiste.getPasswd().equals(passwd.getText())) {
							main.changeScene("HomeDentiste.fxml");
							break;
						}
					}
					fis.close();
				} catch (IOException | ClassNotFoundException ex) {
					ex.printStackTrace();
				}
			}
		}
		else {
			main.changeScene("HomeAssistant.fxml");
		}
	}
}
