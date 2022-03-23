package application;

import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.application.Platform;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class HomeAssistantController {
	@FXML
	private Label time;
	@FXML
	private Circle circle;
	
	@FXML
	private void initialize() {
		// Afficher et mettre à jour la date
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		Thread thread = new Thread(() -> {
			while (true) {
				LocalDateTime timenow = LocalDateTime.now();
				Platform.runLater(() -> {
					time.setText(dtf.format(timenow));
				});
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
		thread.start();
		
		try {
			circle.setFill(new ImagePattern(new Image(getClass().getResource("profile.jpg").toURI().toString(),false)));
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	// Event Listener on Button.onAction
	@FXML
	public void SeDeconnecter(ActionEvent event) throws IOException {
		Main main = new Main();
		main.changeScene("Sign_in.fxml");
	}
}
