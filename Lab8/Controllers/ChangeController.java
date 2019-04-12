package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.DomainClient;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ChangeController {

	 @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;


	    @FXML
	    private ChoiceBox<String> user_choice;

	    @FXML
	    private ChoiceBox<String> property_choice;

	    @FXML
	    private Button back_button;

	    @FXML
	    private Button change_button;

	    @FXML
	    private TextField GetValue;

 
    public static Stage primarystage;
    
    @FXML
    void initialize() {
    	String[] names = new String[Main.list.size()];
    		int i = 0;
    		for(DomainClient clie : Main.list)
    		{
    			names[i] = clie.getName();
    			i++;
    		}
    	 ObservableList<String> availableChoices = FXCollections.observableArrayList(names); 
     	 user_choice.setItems(availableChoices);
     	 
     	 ObservableList<String> availableChoices1 = FXCollections.observableArrayList("Name" ,"Gender" , "Number" , "Weight"); 
     	 property_choice.setItems(availableChoices1);
     	 
     	 change_button.setOnAction(event -> {
     		 int j;
     		for(j = 0 ; j < Main.list.size(); j++)
    		 {
    			 if(user_choice.getValue().equals(Main.list.get(j).getName()))
    				break;
    				 
    		 }
     		
     		switch(property_choice.getValue())
     		{
     		case "Name" :
     			Main.list.get(j).setName(GetValue.getText());
     			break;
     		case "Gender" :
     			Main.list.get(j).setGender(GetValue.getText());
     			break;
     		case "Number" :
     			Main.list.get(j).setNumber(GetValue.getText());
     			break;
     		case "Weight" :
     			Main.list.get(j).setWeight(GetValue.getText());
     			break;
     		
     		}
     		FXMLLoader l = new FXMLLoader();
        	l.setLocation(getClass().getResource("/Scenes/Change.fxml"));
        	try {
        		l.load();
        	}catch (IOException e) {
        		e.printStackTrace();
        	}
        	Parent root = l.getRoot();
        	primarystage.setScene(new Scene(root));
        	primarystage.show();
     		
     	 });
    	
    	back_button.setOnAction(event -> {
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

    }
}

