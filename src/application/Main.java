package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

// One man's constants is another mans variable.
// Think twice but code once.
// Happy Coding  :)

/********************************************************
*	    J Vision AI | Machine Learning Java		*
*		   Karl Joseph Saycon			*
*	       saycon.karl@gmail.com			*
*	        fb.com/saikikarl                	*
*		iamkarlsaycon.com			*
*********************************************************/

//Feel Free to communicate

public class Main extends Application {

	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,1350,720);
	
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());			
			primaryStage.getIcons().add(new Image("logo.png"));
	        primaryStage.setTitle("J Vision AI | Java Based Machine Learning Computer Vision Solution | by Karl Saycon ");
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
		
	}
}
