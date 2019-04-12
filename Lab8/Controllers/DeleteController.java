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
import javafx.stage.Stage;

public class DeleteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<String> Del_usr_choice;

    @FXML
    private Button Del_usr_button;

    @FXML
    private Button back_button;

    public static Stage primarystage;
    @FXML
    void initialize() {
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
    	 
    	 String[] names = new String[Main.list.size()];
    	 int i = 0;
    	 for(DomainClient clie : Main.list)
    	 {
    		 names[i] = clie.getName();
    		 i++;
    	 }
    	 ObservableList<String> availableChoices = FXCollections.observableArrayList(names); 
     	 Del_usr_choice.setItems(availableChoices);
     	 
     	 Del_usr_button.setOnAction(event -> {
     		 for(int j = 0 ; j < Main.list.size(); j++)
     		 {
     			 if(Del_usr_choice.getValue().equals(Main.list.get(j).getName()))
     				Main.list.remove(j);
     				 
     		 }
     			 
     		FXMLLoader l = new FXMLLoader();
        	l.setLocation(getClass().getResource("/Scenes/Delete.fxml"));
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
