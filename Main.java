package controller;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private static Stage stage;
	private static Scene Main;
	private static Scene Home;
	private static Scene Game;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
			
			stage = primaryStage;
		
			Parent Mainfxml = FXMLLoader.load(getClass().getResource("/views/main.fxml"));
			Main  = new Scene(Mainfxml);
			Main.getStylesheets().add(getClass().getResource("/styles/application.css").toExternalForm());
			
			Parent Homefxml = FXMLLoader.load(getClass().getResource("/views/home.fxml"));
			Home = new Scene(Homefxml);
			//Home.getStylesheets().add(getClass().getResource("").toExternalForm());
			
			Parent Gamefxml = FXMLLoader.load(getClass().getResource("/views/game.fxml"));
			Game = new Scene(Gamefxml);
			
			primaryStage.setScene(Main);
			primaryStage.show();
			primaryStage.setResizable(false);
		
	}
	
	public static void StartScreen(String src) {
		switch (src) {
		case "Main":
			stage.setScene(Main);
			break;
		case "Home":
			stage.setScene(Home);
			break;
		case "Game":
			stage.setScene(Game);
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + src);
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
