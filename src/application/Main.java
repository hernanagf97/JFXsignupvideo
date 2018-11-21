package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	AnchorPane myPane;
	@Override
	public void start(Stage primaryStage) {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Video_Signin.fxml"));
			try {
				myPane = (AnchorPane) loader.load();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			primaryStage.setScene(new Scene(myPane));
			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
