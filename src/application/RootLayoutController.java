
package application; 

import java.io.IOException;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class RootLayoutController {


	@FXML
	private Button beginning;
	//start button for 1st view
	/*
	@FXML
	private ChoiceBox<String> type;
	
	@FXML
	private ChoiceBox<String> size;
	
	@FXML
	private ChoiceBox<String> location;
	
	@FXML
	private ChoiceBox<String> scores;
	*/

	
	@FXML
	private Button lowScoresLibArts;
	
	@FXML
	private Button mediumScoresLibArts;
	
	@FXML
	private Button highScoresLibArts;
	
	@FXML
	private Button highScoresStem;
	
	@FXML
	private Button mediumScoresStem;
	
	@FXML
	private Button lowScoresStem;
	
	
	

	
	@FXML
	private Button smallLowScoresStem;
	
	@FXML
	private Button smallMediumScoresStem;
	
	@FXML
	private Button smallHighScoresStem;
	
	@FXML
	private Button bigLowScoresStem;
	
	@FXML
	private Button bigMediumScoresStem;
	
	@FXML
	private Button bigHighScoresStem;
	
	@FXML
	private Button smallLowScoresLibArts;
	
	@FXML
	private Button smallMediumScoresLibArts;
	
	@FXML
	private Button smallHighScoresLibArts;
	
	@FXML
	private Button bigLowScoresLibArts;
	
	@FXML
	private Button bigMediumScoresLibArts;
	
	@FXML
	private Button bigHighScoresLibArts;
	
	
	
	
	@FXML
	private WebView myWebView;
	
	@FXML
	private Button results;
	
	
	private Main mainApp;
	
	public void setMainApp(Main mainApp){
	this.mainApp = mainApp;
	}
	
	@FXML
	private void handleType(ActionEvent event) throws IOException{
	//Goes to 2nd view when button is selected
		
		Stage stage;
		Parent root;
		//creates stage
		//creates root
		
		if(event.getSource()==beginning){
			
			stage = new Stage();
			root = FXMLLoader.load(getClass().getResource("Type.fxml"));
			//Gets "College Type" (2nd view: liberal arts or STEM) FXML layout
			
			stage.setScene(new Scene(root));
			stage.setTitle("A");
			//Set title as "Type"
			stage.initModality(Modality.APPLICATION_MODAL);
			//Modality is initialized here
			stage.initOwner(beginning.getScene().getWindow());
			stage.showAndWait();
			//shows and doesn't close the view
			
		}
	}
	
	@FXML
	private Button Stem;
	
	@FXML
	private void handleScores(ActionEvent event) throws IOException{
		
		Stage stage;
		Parent root;
		
		if(event.getSource()==Stem){
			
			stage = new Stage();
			root = FXMLLoader.load(getClass().getResource("Stem.fxml"));
			stage.setScene(new Scene(root));
			stage.setTitle("STEM");
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initOwner(Stem.getScene().getWindow());
			stage.showAndWait();
			
	
	}
}
	
	@FXML
	private Button LibArts;
	
	@FXML
	private void handleScoresLibArts(ActionEvent event) throws IOException{
		
		Stage stage;
		Parent root;
		
		if(event.getSource()==LibArts){
			
			stage = new Stage();
			root = FXMLLoader.load(getClass().getResource("LibArts.fxml"));
			stage.setScene(new Scene(root));
			stage.setTitle("Liberal Arts Score Ranges");
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initOwner(LibArts.getScene().getWindow());
			stage.showAndWait();
}}
	
	
	
	
	
	
	
	
	
	@FXML
	private void handleLowScoresLibArtsSize(ActionEvent event) throws IOException{
		
		Stage stage;
		Parent root;
		
		if(event.getSource()==lowScoresLibArts){
			
			stage = new Stage();
			root = FXMLLoader.load(getClass().getResource("LibArtsLow.fxml"));
			stage.setScene(new Scene(root));
			stage.setTitle("LibArtsLow");
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initOwner(lowScoresLibArts.getScene().getWindow());
			stage.showAndWait();
}}
	
	@FXML
	private void handleMediumScoresLibArtsSize(ActionEvent event) throws IOException{
		
		Stage stage;
		Parent root;
		
		if(event.getSource()==mediumScoresLibArts){
			
			stage = new Stage();
			root = FXMLLoader.load(getClass().getResource("LibArtsMid.fxml"));
			stage.setScene(new Scene(root));
			stage.setTitle("LibArtsMid");
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initOwner(mediumScoresLibArts.getScene().getWindow());
			stage.showAndWait();
}}
	
	@FXML
	private void handleHighScoresLibArtsSize(ActionEvent event) throws IOException{
		
		Stage stage;
		Parent root;
		
		if(event.getSource()==highScoresLibArts){
			
			stage = new Stage();
			root = FXMLLoader.load(getClass().getResource("LibArtsHigh.fxml"));
			stage.setScene(new Scene(root));
			stage.setTitle("LibArtsHigh");
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initOwner(highScoresLibArts.getScene().getWindow());
			stage.showAndWait();
		}
	}	
	

@FXML
private void handleHighScoresStemSize(ActionEvent event) throws IOException{
	
	Stage stage;
	Parent root;
	
	if(event.getSource()==highScoresStem){
		
		stage = new Stage();
		root = FXMLLoader.load(getClass().getResource("StemHigh.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("StemHigh");
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(highScoresStem.getScene().getWindow());
		stage.showAndWait();

}}

@FXML
private void handleMediumScoresStemSize(ActionEvent event) throws IOException{
	
	Stage stage;
	Parent root;
	
	if(event.getSource()==mediumScoresStem){
		
		stage = new Stage();
		root = FXMLLoader.load(getClass().getResource("StemMid.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("StemMid");
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(mediumScoresStem.getScene().getWindow());
		stage.showAndWait();

}}

@FXML
private void handleLowScoresStemSize(ActionEvent event) throws IOException{
	
	Stage stage;
	Parent root;
	
	if(event.getSource()==lowScoresStem){
		
		stage = new Stage();
		root = FXMLLoader.load(getClass().getResource("StemLow.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("StemLow");
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(lowScoresStem.getScene().getWindow());
		stage.showAndWait();

}}









@FXML
private void handleBigLowScoresStem(ActionEvent event) throws IOException{
	
	Stage stage;
	Parent root;
	
	if(event.getSource()==bigLowScoresStem){
		
		stage = new Stage();
		root = FXMLLoader.load(getClass().getResource("StemLowLarge.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("StemLowLarge");
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(bigLowScoresStem.getScene().getWindow());
		stage.showAndWait();

}}

@FXML
private void handleBigMediumScoresStem(ActionEvent event) throws IOException{
	
	Stage stage;
	Parent root;
	
	if(event.getSource()==bigMediumScoresStem){
		
		stage = new Stage();
		root = FXMLLoader.load(getClass().getResource("StemMidLarge.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("StemMidLarge");
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(bigMediumScoresStem.getScene().getWindow());
		stage.showAndWait();

}}


@FXML
private void handleBigHighScoresStem(ActionEvent event) throws IOException{
	
	Stage stage;
	Parent root;
	
	if(event.getSource()==bigHighScoresStem){
		
		stage = new Stage();
		root = FXMLLoader.load(getClass().getResource("StemHighLarge.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("StemHighLarge");
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(bigHighScoresStem.getScene().getWindow());
		stage.showAndWait();

}}

@FXML
private void handleSmallHighScoresStem(ActionEvent event) throws IOException{
	
	Stage stage;
	Parent root;
	
	if(event.getSource()==smallHighScoresStem){
		
		stage = new Stage();
		root = FXMLLoader.load(getClass().getResource("StemHighSmall.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("StemHighSmall");
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(smallHighScoresStem.getScene().getWindow());
		stage.showAndWait();

}}


@FXML
private void handleSmallMediumScoresStem(ActionEvent event) throws IOException{
	
	Stage stage;
	Parent root;
	
	if(event.getSource()==smallMediumScoresStem){
		
		stage = new Stage();
		root = FXMLLoader.load(getClass().getResource("StemMidSmall.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("StemMidSmall");
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(smallMediumScoresStem.getScene().getWindow());
		stage.showAndWait();

}}


@FXML
private void handleSmallLowScoresStem(ActionEvent event) throws IOException{
	
	Stage stage;
	Parent root;
	
	if(event.getSource()==smallLowScoresStem){
		
		stage = new Stage();
		root = FXMLLoader.load(getClass().getResource("StemLowSmall.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("StemLowSmall");
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(smallLowScoresStem.getScene().getWindow());
		stage.showAndWait();
	}}






@FXML
private void handleBigLowScoresLibArts(ActionEvent event) throws IOException{
	
	Stage stage;
	Parent root;
	
	if(event.getSource()==bigLowScoresLibArts){
		
		stage = new Stage();
		root = FXMLLoader.load(getClass().getResource("LibArtsLowLarge.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("LibArtsLowLarge");
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(bigLowScoresLibArts.getScene().getWindow());
		stage.showAndWait();

}}

@FXML
private void handleBigMediumScoresLibArts(ActionEvent event) throws IOException{
	
	Stage stage;
	Parent root;
	
	if(event.getSource()==bigMediumScoresLibArts){
		
		stage = new Stage();
		root = FXMLLoader.load(getClass().getResource("LibArtsMidLarge.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("LibArtsMidLarge");
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(bigMediumScoresLibArts.getScene().getWindow());
		stage.showAndWait();

}}


@FXML
private void handleBigHighScoresLibArts(ActionEvent event) throws IOException{
	
	Stage stage;
	Parent root;
	
	if(event.getSource()==bigHighScoresLibArts){
		
		stage = new Stage();
		root = FXMLLoader.load(getClass().getResource("LibArtsHighLarge.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("LibArtsHighLarge");
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(bigHighScoresLibArts.getScene().getWindow());
		stage.showAndWait();

}}

@FXML
private void handleSmallHighScoresLibArts(ActionEvent event) throws IOException{
	
	Stage stage;
	Parent root;
	
	if(event.getSource()==smallHighScoresLibArts){
		
		stage = new Stage();
		root = FXMLLoader.load(getClass().getResource("LibArtsHighSmall.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("LibArtsHighSmall");
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(smallHighScoresLibArts.getScene().getWindow());
		stage.showAndWait();

}}


@FXML
private void handleSmallMediumScoresLibArts(ActionEvent event) throws IOException{
	
	Stage stage;
	Parent root;
	
	if(event.getSource()==smallMediumScoresLibArts){
		
		stage = new Stage();
		root = FXMLLoader.load(getClass().getResource("LibArtsMidSmall.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("LibArtsMidSmall");
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(smallMediumScoresLibArts.getScene().getWindow());
		stage.showAndWait();

}}


@FXML
private void handleSmallLowScoresLibArts(ActionEvent event) throws IOException{
	
	Stage stage;
	Parent root;
	
	if(event.getSource()==smallLowScoresLibArts){
		
		stage = new Stage();
		root = FXMLLoader.load(getClass().getResource("LibArtsLowSmall.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("LibArtsLowSmall");
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(smallLowScoresLibArts.getScene().getWindow());
		stage.showAndWait();
	}}













@FXML
private void handleUrbanLowScoresStem(ActionEvent event) throws IOException{
	
	Stage stage;
	Parent root;
	
	if(event.getSource()==lowScoresStem){
		
		stage = new Stage();
		root = FXMLLoader.load(getClass().getResource("Size.fxml"));
		stage.setScene(new Scene(root));
		stage.setTitle("Size");
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.initOwner(lowScoresStem.getScene().getWindow());
		stage.showAndWait();

}}




@FXML
private ChoiceBox<String> majors;

@FXML
private void handleMajors(){
	majors.setItems(FXCollections.observableArrayList(
		"Physics", "Chemistry", "Bio")
			);

majors.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){
	@Override
	public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2){
		switch(majors.getItems().get((Integer)number2)){
		
		case "Physics": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.google.com");
			break;
		}
		
		case "Chemistry":{
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("yahoo.com");
			break;
		}
		
		case "Bio": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("bing.com");
			break;
		
		}
		}
	}

});

}
}


/*@FXML
public void setType(){
	type.setItems(FXCollections.observableArrayList(
			"STEM", "Liberal Arts"));
}*/
/*
@FXML
public void setSize(){
size.setItems(FXCollections.observableArrayList(
		"Bigly", "Somali"));
}
@FXML
public void setScores(){
scores.setItems(FXCollections.observableArrayList(
		"A", "B", "C"));
}

@FXML
public void setLocation(){
location.setItems(FXCollections.observableArrayList(
		"Urban", "Suburban"));
}
/*
@FXML
public void produceResults(){
	if(type.getItems().equals("STEM") && size.getItems().equals("Bigly") && 
			scores.getItems().equals("A") && location.getItems().equals("Urban")){
		
		WebEngine webEngine= myWebView.getEngine();
		webEngine.load("google.com");
		
	}
}*/
/*
@FXML
private RadioButton one;
@FXML
private RadioButton two;

@FXML
private void initialize(){
	
ToggleGroup group = new ToggleGroup();
one.setToggleGroup(group);
two.setToggleGroup(group);

group.selectToggle(one);


*/




