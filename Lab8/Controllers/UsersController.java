package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.stage.Stage;

public class UsersController {

	  @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private Label Names;

	    @FXML
	    private Label numbers;

	    @FXML
	    private Label genders;

	    @FXML
	    private Label date;

	    @FXML
	    private Button Back_button;
    
    public static Stage primarystage;
    @FXML
    void initialize() {
        String str = "";
        for(int i = 0 ; i < Main.list.size() ; i++)
        	str += Main.list.get(i).getName()+"\n";
        
        Names.setText(str);
        
        Back_button.setOnAction(event -> {
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
        
        String str1 = "";
        for(int i = 0 ; i < Main.list.size() ; i++)
        	str1 += Main.list.get(i).getNumber()+"\n";
        numbers.setText(str1);
        
        String str2 = "";
        for(int i = 0 ; i < Main.list.size() ; i++)
        	str2 += Main.list.get(i).getGender()+"\n";
        genders.setText(str2);
        
        String str3 = "";
        for(int i = 0 ; i < Main.list.size() ; i++)
        	str3 += Main.list.get(i).getRegDay().toString()+"\n";
        date.setText(str3);

    }
}
