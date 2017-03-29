package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private Stage primaryStage;
	private AnchorPane rootLayout;
		
		
		
		
		@Override
		public void start(Stage primaryStage) {
			try {
				//Set the primaryStage field to the  parameter passed into this start method
				this.primaryStage = primaryStage;
				this.primaryStage.setTitle("Devos College Search"); //Set the title of the Window
				//set the application icon
				this.primaryStage.getIcons().add(new Image("file:resources/images/Applcon.png"));
				//call a method to set up the Root Layout
				initRootLayout();
				//load the content of the outer window class
				
				//standard way to help debug. In normal production code, you would handle things differently
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		//StandardmainApploop for javaFx that calls Launch(args)
		public static void main(String[] args) {
			launch(args);
		}
		public void initRootLayout() {
			try {
				//Main initialization routines for layout and app commencement
				//create an FXML Loader object
				FXMLLoader loader = new FXMLLoader();
				//Point the loader at the FXML file to load
				loader.setLocation(Main.class.getResource("RootLayout.FXML"));
				//Sets the rootlayout field to the BorderPane FXM file injected via @FXML
				rootLayout = (AnchorPane) loader.load();
				//Sets a Scene object to this rootLayout
				Scene scene = new Scene(rootLayout);
				//Sets the primaryScene Scene object to scene
				primaryStage.setScene(scene);
				//Shows the primaryStage object
				primaryStage.show();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
	
}
