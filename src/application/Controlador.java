package application;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Controlador {

	@FXML
	private MediaView mediaView;

	public void initialize() {
		Media media1 = new Media(getClass().getResource("Top_10_Extreme_Sports.mp4").toExternalForm());
		
		MediaPlayer player = new MediaPlayer(media1);
		mediaView.setMediaPlayer(player);
		player.setVolume(0.5);
		player.play();
	}
}
