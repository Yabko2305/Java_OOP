package Controllers;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.DomainClient;
import application.Main;
import application.Shake;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class WtfController {


	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TextField Name_print;

	    @FXML
	    private ChoiceBox<String> Gender_pick;

	    @FXML
	    private TextField number_print;

	    @FXML
	    private DatePicker Date_choice;

	    @FXML
	    private TextField Weight_print;

	    @FXML
	    private Button Add_button;

	    @FXML
	    private Button Back_Button;
	    
	    public boolean name = false;
	    public boolean gender = false;
	    public boolean num = false;
	    public boolean date = false;
	    public boolean wgh = false;
	    public DomainClient client = new DomainClient();

    public static Stage primarystage;
    
    @FXML
    void initialize() {
    	
    	ObservableList<String> availableChoices = FXCollections.observableArrayList("Male" , "Female"); 
    	Gender_pick.setItems(availableChoices);
    	
    	Back_Button.setOnAction(event -> {
        	FXMLLoader l = new FXMLLoader();
        	l.setLocation(getClass().getResource("/Scenes/MainScene.fxml"));
        	try {
        		l.load();
        	}catch (IOException e) {
        		e.printStackTrace();
        	}
        	Parent root = l.getRoot();
        	primarystage.setScene(new Scene(root));
        	primarystage.show();
        });
    	
    	Add_button.setOnAction(event -> {
    		if(!name)
    		{
    		if(Name_print.getText().equals(""))
    		{
    			Shake shake = new Shake(Name_print);
    			Name_print.setStyle("-fx-background-color: red;");
    			shake.playanim(Name_print);
    			
    		}
    		else {
    			Name_print.setStyle("-fx-background-color: white;");
    		client.setName(Name_print.getText()); name = true;}}
    		
    		if(!gender)
    		{
    		if(Gender_pick.getSelectionModel().isEmpty())
    		{
    			Shake shake = new Shake(Gender_pick);
    			shake.playanim(Gender_pick);
    			Gender_pick.setStyle("-fx-background-color: red;");
    		}
    		else {
    			Gender_pick.setStyle("-fx-background-color: white;");
    		client.setGender(Gender_pick.getSelectionModel().getSelectedItem()); gender = true;}}
    		
    		if(!num)
    		{
    		if(number_print.getText().equals(""))
    		{
    			Shake shake = new Shake(number_print);
    			shake.playanim(number_print);
    			number_print.setStyle("-fx-background-color: red;");
    		}
    		else {
    			number_print.setStyle("-fx-background-color: white;");
    		client.setNumber(number_print.getText()); num = true;}}
    		
    		if(!wgh)
    		{
    		if(Weight_print.getText().equals(""))
    		{
    			Shake shake = new Shake(Weight_print);
    			shake.playanim(Weight_print);
    			Weight_print.setStyle("-fx-background-color: red;");
    		}
    		else {
    		Weight_print.setStyle("-fx-background-color: white;");
    		client.setWeight(Weight_print.getText()); wgh = true;}}
    		
    		if(!date)
    		{
    		if(Date_choice.getValue() == null)
    		{
    			Shake shake = new Shake(Date_choice);
    			shake.playanim(Date_choice);
    			Date_choice.setStyle("-fx-background-color: red;");
    		}
    		else {
    			number_print.setStyle("-fx-background-color: white;");
    		client.setRegDay(Date_choice.getValue().toString()); date = true;}}
    		
    		if(name && gender && num && date && wgh)
    		{
    		Main.list.add(client);
    		client = new DomainClient();
    		name = false;
    		gender = false;
    		num = false;
    		date = false;
    		wgh = false;
    		
    		FXMLLoader l = new FXMLLoader();
        	l.setLocation(getClass().getResource("/Scenes/wtf.fxml"));
        	try {
        		l.load();
        	}catch (IOException e) {
        		e.printStackTrace();
        	}
        	Parent root = l.getRoot();
        	primarystage.setScene(new Scene(root));
        	primarystage.show();
        	
    		}
    	});

    }
}


  