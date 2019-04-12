package Controllers;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.DomainClient;
import application.Main;
import application.OpenDirectoryChooser;
import application.OpenFileChooser;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MainController  {

    @FXML
    private ResourceBundle resources;
    
    @FXML
    private MenuItem OpenFile;

    @FXML
    private URL location;

    @FXML
    private Button AddUSER;
    
    @FXML
    private MenuItem save_as;


    @FXML
    private Button sUSER;
    
    @FXML
    private MenuItem help;


    @FXML
    private Button ChangeProp;

    @FXML
    private Button DeleteUser;

    public static Stage primarystage;
    @FXML
    void initialize() throws FileNotFoundException , IOException{
        AddUSER.setOnAction(event -> {
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
        });
        
        sUSER.setOnAction(event -> {
        	FXMLLoader l = new FXMLLoader();
        	l.setLocation(getClass().getResource("/Scenes/users.fxml"));
        	try {
        		l.load();
        	}catch (IOException e) {
        		e.printStackTrace();
        	}
        	Parent root = l.getRoot();
        	primarystage.setScene(new Scene(root));
        	primarystage.show();
        });
        
        DeleteUser.setOnAction(event -> {
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
        
        ChangeProp.setOnAction(event -> {
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
        
        save_as.setOnAction( event -> {
        	XMLEncoder encoder;
        	OpenFileChooser chooser = new OpenFileChooser();
			try {
				encoder = new XMLEncoder(
				           new BufferedOutputStream(
				           new FileOutputStream(chooser.getFile())));
				encoder.writeObject(Main.list);
				encoder.close(); 
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

        });
        
        OpenFile.setOnAction(envent -> {
        	OpenDirectoryChooser chooser = new OpenDirectoryChooser();
        	XMLDecoder decoder; 
        		try {
        		decoder = new XMLDecoder(
				    new BufferedInputStream(
				    new FileInputStream(chooser.getFile())));
        		Main.list =((ArrayList<DomainClient>)decoder.readObject());
        		decoder.close();}
        		catch(FileNotFoundException e) {
    				e.printStackTrace();
    			}
        });
        
        help.setOnAction(event -> {
        	Stage stage = new Stage();
        	try {
        	Parent root = FXMLLoader.load(getClass().getResource("/Scenes/Help.fxml"));
    		stage.setTitle("DomainClient");
    		stage.setScene(new Scene(root , 630 , 400));
    		stage.show();}
        	catch(IOException e)
        	{
        		e.printStackTrace();
        	}
        });

    }
}
