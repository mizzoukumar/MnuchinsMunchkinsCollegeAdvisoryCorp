
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

//buttons for all fields for second view
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
	
	
	
//buttons for all fields displayed in third view
	
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
	
	
//button for web view and for final view
	
	@FXML
	private WebView myWebView;
	
	@FXML
	private Button results;
	
	
	private Main mainApp;
	
	public void setMainApp(Main mainApp){
	this.mainApp = mainApp;
	}
	
	/**
	 * @param event
	 * @exception IO exception
	 * Loads beginning view to start college program
	 */
	@FXML
	public void handleType(ActionEvent event) throws IOException{
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
	
//method to open STEM fxml that gets STEM fxml and opens STEM page
	
	
	/**
	 * @param event
	 * @throws IOException
	 * @return
	 * @see
	 * Loads STEM page with choices for size of school
	 */
	@FXML
public void handleScores(ActionEvent event) throws IOException{
		
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
//method to open view specific to Liberal Arts, that brings up score ranges for Liberal Arts option
	
	
	/**
	 * @param event
	 * @throws IOException
	 * Loads Liberal Arts page with choices for size of school
	 * @return
	 * @see
	 */
	
	@FXML
	public void handleScoresLibArts(ActionEvent event) throws IOException{
		
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
	
	
	
	
	
	
	
//handleLowScoresLibArtsSize gets fxml entitled LibArts Low, with options for student who selects low score range and Lib Arts
	/**
	 * @param event
	 * @throws IOException
	 * Loads page for Low Scores under Liberal Arts category
	 * @return
	 * @see
	 */
	@FXML
	public void handleLowScoresLibArtsSize(ActionEvent event) throws IOException{
		
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
//Opens view with options for student who selects middle score range and Lib Arts	
	
	/**
	 * @param event
	 * @throws IOException
	 * Loads Medium Scores page for Liberal Arts category
	 * @return
	 * @see
	 */
	@FXML
	public void handleMediumScoresLibArtsSize(ActionEvent event) throws IOException{
		
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
//Opens view with options for student who selects high score range and Lib Arts	
	
	/**
	 * @param event
	 * @throws IOException
	 * Loads High Scores page for Liberal Arts category
	 * @return
	 * @see
	 */
	@FXML
	public void handleHighScoresLibArtsSize(ActionEvent event) throws IOException{
		
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
	
//Opens view with options for student who selects high score range and STEM

	/**
	 * @param event
	 * @throws IOException
	 * Loads High Scores page for STEM category
	 * @return
	 * @see
	 */
	@FXML
public void handleHighScoresStemSize(ActionEvent event) throws IOException{
	
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

//Opens view with options for student who selects middle score range and STEM

	/**
	 * @param event
	 * @throws IOException
	 * Loads Medium Scores page for STEM category
	 * @return
	 * @see
	 */
	@FXML
public void handleMediumScoresStemSize(ActionEvent event) throws IOException{
	
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

//Opens view with options for student who selects low score range and STEM

	/**
	 * @param event
	 * @throws IOException
	 * Loads Low Scores page for STEM category
	 * @return
	 * @see
	 */
	@FXML
public void handleLowScoresStemSize(ActionEvent event) throws IOException{
	
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









//Opens view with options for student who selects big school, low score range and STEM
	/**
	 * @param event
	 * @throws IOException
	 * Loads Big Scores page for Liberal Arts schools with low scores
	 * @return
	 * @see
	 */
	
	@FXML
public void handleBigLowScoresStem(ActionEvent event) throws IOException{
	
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
//Opens view with options for student who selects big school, mid score range and STEM

	/**
	 * @param event
	 * @throws IOException
	 * Loads Big school size page for STEM schools with medium scores
	 * @return
	 * @see
	 */
	@FXML
public void handleBigMediumScoresStem(ActionEvent event) throws IOException{
	
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

//Opens view with options for student who selects big school, high score range and STEM

	/**
	 * @param event
	 * @throws IOException
	 * Loads Big School size page for STEM schools with high scores
	 * @return
	 * @see
	 */
	@FXML
public void handleBigHighScoresStem(ActionEvent event) throws IOException{
	
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
//Opens view with options for student who selects small school, high score range and STEM
	/**
	 * @param event
	 * @throws IOException
	 * Loads small school size page for STEM schools with high scores
	 * @return
	 * @see
	 */
	@FXML
public void handleSmallHighScoresStem(ActionEvent event) throws IOException{
	
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

	/**
	 * @param event
	 * @throws IOException
	 * Loads school size page for STEM schools with indicated score range
	 * @return
	 * @see
	 */
@FXML

public void handleSmallMediumScoresStem(ActionEvent event) throws IOException{
	
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

//Opens view with options for student who selects small school, low score range and STEM


/**
 * @param event
 * @throws IOException
 * Loads school size page for STEM schools with indicated score range
 * @return
 * @see
 */
@FXML
public void handleSmallLowScoresStem(ActionEvent event) throws IOException{
	
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





//Opens view with options for student who selects big school, high score range and Liberal arts
/**
 * @param event
 * @throws IOException
 * Loads school size page for STEM schools with indicated score range
 * @return
 * @see
 */
@FXML

public void handleBigLowScoresLibArts(ActionEvent event) throws IOException{
	
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
//Opens view with options for student who selects big school, middle score range and Liberal arts

/**
 * @param event
 * @throws IOException
 * Loads school size page for STEM schools with indicated score range
 * @return
 * @see
 */
@FXML
public void handleBigMediumScoresLibArts(ActionEvent event) throws IOException{
	
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

//Opens view with options for student who selects big school, high score range and Liberal arts

/**
 * @param event
 * @throws IOException
 * Loads school size page for STEM schools with indicated score range
 * @return
 * @see
 */
@FXML
public void handleBigHighScoresLibArts(ActionEvent event) throws IOException{
	
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
//Opens view with options for student who selects small school, high score range and Liberal arts

/**
 * @param event
 * @throws IOException
 * Loads school size page for STEM schools with indicated score range
 * @return
 * @see
 */
@FXML
public void handleSmallHighScoresLibArts(ActionEvent event) throws IOException{
	
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

//Opens view with options for student who selects small school, medium score range and Liberal arts
/**
 * @param event
 * @throws IOException
 * Loads school size page for STEM schools with indicated score range
 * @return
 * @see
 */

@FXML
public void handleSmallMediumScoresLibArts(ActionEvent event) throws IOException{
	
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

//Opens view with options for student who selects small school, low score range and Liberal arts
/**
 * @param event
 * @throws IOException
 * Loads school size page for STEM schools with indicated score range
 * @return
 * @see
 */
@FXML
public void handleSmallLowScoresLibArts(ActionEvent event) throws IOException{
	
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












/**
 * @param event
 * @throws IOException
 * Loads school size page for STEM schools with indicated score range
 * @return
 * @see
 */
@FXML
public void handleUrbanLowScoresStem(ActionEvent event) throws IOException{
	
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



//ChoiceBox that accepts strings called "majors"

@FXML
private ChoiceBox<String> majors;
//method that sets majors to specific ChoiceBox options

/**
 * @param event
 * @throws IOException
 * Sets items into choice box then loads the college match WebView
 * @return
 * @see
 */
@FXML
public void handleMajors(){
	majors.setItems(FXCollections.observableArrayList(
		"Physics", "Chemistry", "Biology")
			);

//Generates switch statement for each major that opens a Web View directing to specific college website
majors.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){
	@Override
	public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2){
		switch(majors.getItems().get((Integer)number2)){
		
		case "Physics": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.gatech.edu");
			break;
		}
		
		case "Chemistry":{
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.cmu.edu");
			break;
		}
		
		case "Bio": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.utexas.edu");
			break;
		
		}
		}
	}

});

}



@FXML
private ChoiceBox<String> majorsSTEMMidLarge;
//method that sets majors to specific ChoiceBox options

/**
 * @param event
 * @throws IOException
 * Sets items into choice box then loads the college match WebView
 * @return
 * @see
 */

@FXML
public void handleMajorsSTEMMidLarge(){
	majorsSTEMMidLarge.setItems(FXCollections.observableArrayList(
		"Physics", "Chemistry", "Biology")
			);

//Generates switch statement for each major that opens a Web View directing to specific college website
majorsSTEMMidLarge.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){
	@Override
	public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2){
		switch(majorsSTEMMidLarge.getItems().get((Integer)number2)){
		
		case "Physics": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.illinois.edu");
			break;
		}
		
		case "Chemistry":{
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.vt.edu");
			break;
		}
		
		case "Bio": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.unc.edu");
			break;
		
		}
		}
	}

});

}

@FXML
private ChoiceBox<String> majorsSTEMMidSmall;
//method that sets majors to specific ChoiceBox options

/**
 * @param event
 * @throws IOException
 * Sets items into choice box then loads the college match WebView
 * @return
 * @see
 */
@FXML
public void handleMajorsSTEMMidSmall(){
	majorsSTEMMidSmall.setItems(FXCollections.observableArrayList(
		"Physics", "Chemistry", "Biology")
			);

//Generates switch statement for each major that opens a Web View directing to specific college website
majorsSTEMMidSmall.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){
	@Override
	public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2){
		switch(majorsSTEMMidSmall.getItems().get((Integer)number2)){
		
		case "Physics": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.wustl.edu");
			break;
		}
		
		case "Chemistry":{
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.tufts.edu");
			break;
		}
		
		case "Bio": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.usc.edu");
			break;
		
		}
		}
	}

});

}


@FXML
private ChoiceBox<String> majorsSTEMLowLarge;
//method that sets majors to specific ChoiceBox options

/**
 * @param event
 * @throws IOException
 * Sets items into choice box then loads the college match WebView
 * @return
 * @see
 */
@FXML
public void handleMajorsSTEMLowLarge(){
	majorsSTEMLowLarge.setItems(FXCollections.observableArrayList(
		"Physics", "Chemistry", "Biology")
			);

//Generates switch statement for each major that opens a Web View directing to specific college website
majorsSTEMLowLarge.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){
	@Override
	public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2){
		switch(majorsSTEMLowLarge.getItems().get((Integer)number2)){
		
		case "Physics": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.uga.edu");
			break;
		}
		
		case "Chemistry":{
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.sc.edu");
			break;
		}
		
		case "Bio": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.washington.edu");
			break;
		
		}
		}
	}

});

}


@FXML
private ChoiceBox<String> majorsSTEMLowSmall;
//method that sets majors to specific ChoiceBox options

/**
 * @param event
 * @throws IOException
 * Sets items into choice box then loads the college match WebView
 * @return
 * @see
 */
@FXML
public void handleMajorsSTEMLowSmall(){
	majorsSTEMLowSmall.setItems(FXCollections.observableArrayList(
		"Physics", "Chemistry", "Biology")
			);

//Generates switch statement for each major that opens a Web View directing to specific college website
majorsSTEMLowSmall.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){
	@Override
	public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2){
		switch(majorsSTEMLowSmall.getItems().get((Integer)number2)){
		
		case "Physics": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.appstate.edu");
			break;
		}
		
		case "Chemistry":{
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.iastate.edu");
			break;
		}
		
		case "Bio": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.calpoly.edu");
			break;
		
		}
		}
	}

});

}

@FXML
private ChoiceBox<String> majorsLibArtsHighLarge;
//method that sets majors to specific ChoiceBox options

/**
 * @param event
 * @throws IOException
 * Sets items into choice box then loads the college match WebView
 * @return
 * @see
 */
@FXML
public void handleMajorsLibArtsHighLarge(){
	majorsLibArtsHighLarge.setItems(FXCollections.observableArrayList(
		"Literature", "History", "Economics")
			);

//Generates switch statement for each major that opens a Web View directing to specific college website
majorsLibArtsHighLarge.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){
	@Override
	public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2){
		switch(majorsLibArtsHighLarge.getItems().get((Integer)number2)){
		
		case "Literature": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.harvard.edu");
			break;
		}
		
		case "History":{
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.yale.edu");
			break;
		}
		
		case "Economics": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.princeton.edu");
			break;
		
		}
		}
	}

});

}

@FXML
private ChoiceBox<String> majorsLibArtsHighSmall;
//method that sets majors to specific ChoiceBox options

/**
 * @param event
 * @throws IOException
 * Sets items into choice box then loads the college match WebView
 * @return
 * @see
 */
@FXML
public void handleMajorsLibArtsHighSmall(){
	majorsLibArtsHighSmall.setItems(FXCollections.observableArrayList(
		"Literature", "History", "Economics")
			);

//Generates switch statement for each major that opens a Web View directing to specific college website
majorsLibArtsHighSmall.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){
	@Override
	public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2){
		switch(majorsLibArtsHighSmall.getItems().get((Integer)number2)){
		
		case "Literature": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.williams.edu");
			break;
		}
		
		case "History":{
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.pomona.edu");
			break;
		}
		
		case "Economics": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.cmc.edu");
			break;
		
		}
		}
	}

});

}


@FXML
private ChoiceBox<String> majorsLibArtsMidLarge;
//method that sets majors to specific ChoiceBox options
/**
 * @param event
 * @throws IOException
 * Sets items into choice box then loads the college match WebView
 * @return
 * @see
 */

@FXML
public void handleMajorsLibArtsMidLarge(){
	majorsLibArtsMidLarge.setItems(FXCollections.observableArrayList(
		"Literature", "History", "Economics")
			);

//Generates switch statement for each major that opens a Web View directing to specific college website
majorsLibArtsMidLarge.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){
	@Override
	public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2){
		switch(majorsLibArtsMidLarge.getItems().get((Integer)number2)){
		
		case "Literature": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.uchicago.edu");
			break;
		}
		
		case "History":{
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.upenn.edu");
			break;
		}
		
		case "Economics": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.northwestern.edu");
			break;
		
		}
		}
	}

});

}



@FXML
private ChoiceBox<String> majorsLibArtsMidSmall;
//method that sets majors to specific ChoiceBox options

/**
 * @param event
 * @throws IOException
 * Sets items into choice box then loads the college match WebView
 * @return
 * @see
 */
@FXML
public void handleMajorsLibArtsMidSmall(){
	majorsLibArtsMidSmall.setItems(FXCollections.observableArrayList(
		"Literature", "History", "Economics")
			);

//Generates switch statement for each major that opens a Web View directing to specific college website
majorsLibArtsMidSmall.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){
	@Override
	public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2){
		switch(majorsLibArtsMidSmall.getItems().get((Integer)number2)){
		
		case "Literature": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.dartmouth.edu");
			break;
		}
		
		case "History":{
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.brown.edu");
			break;
		}
		
		case "Economics": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.georgetown.edu");
			break;
		
		}
		}
	}

});

}


@FXML
private ChoiceBox<String> majorsLibArtsLowLarge;
//method that sets majors to specific ChoiceBox options

/**
 * @param event
 * @throws IOException
 * Sets items into choice box then loads the college match WebView
 * @return
 * @see
 */
@FXML
public void handleMajorsLibArtsLowLarge(){
	majorsLibArtsLowLarge.setItems(FXCollections.observableArrayList(
		"Literature", "History", "Economics")
			);

//Generates switch statement for each major that opens a Web View directing to specific college website
majorsLibArtsLowLarge.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){
	@Override
	public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2){
		switch(majorsLibArtsLowLarge.getItems().get((Integer)number2)){
		
		case "Literature": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.emory.edu");
			break;
		}
		
		case "History":{
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.ucmerced.edu");
			break;
		}
		
		case "Economics": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.auburn.edu");
			break;
		
		}
		}
	}

});

}




@FXML
private ChoiceBox<String> majorsLibArtsLowSmall;
//method that sets majors to specific ChoiceBox options

/**
 * @param event
 * @throws IOException
 * Sets items into choice box then loads the college match WebView
 * @return
 * @see
 */
@FXML
public void handleMajorsLibArtsLowSmall(){
	majorsLibArtsLowSmall.setItems(FXCollections.observableArrayList(
		"Journalism", "History", "Economics")
			);

//Generates switch statement for each major that opens a Web View directing to specific college website
majorsLibArtsLowSmall.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){
	@Override
	public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2){
		switch(majorsLibArtsLowSmall.getItems().get((Integer)number2)){
		
		case "Journalism": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.mizzou.edu");
			break;
		}
		
		case "History":{
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.olemiss.edu");
			break;
		}
		
		case "Economics": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.boisestate.edu");
			break;
		
		}
		}
	}

});

}




@FXML
private ChoiceBox<String> majorsSTEMHighSmall;
//method that sets majors to specific ChoiceBox options

/**
 * @param event
 * @throws IOException
 * Sets items into choice box then loads the college match WebView
 * @return
 * @see
 */

@FXML
public void handleMajorSTEMHighSmall(){
	majorsSTEMHighSmall.setItems(FXCollections.observableArrayList(
		"Physics", "Chemistry", "Biology")
			);

//Generates switch statement for each major that opens a Web View directing to specific college website
majorsSTEMHighSmall.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){
	@Override
	public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2){
		switch(majorsSTEMHighSmall.getItems().get((Integer)number2)){
		
		case "Physics": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.caltech.edu");
			break;
		}
		
		case "Chemistry":{
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.mit.edu");
			break;
		}
		
		case "Bio": {
			WebEngine webEngine = myWebView.getEngine();
			webEngine.load("http://www.stanford.edu");
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




