module jogoDaVelha {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens controller to javafx.graphics, javafx.fxml;
}
