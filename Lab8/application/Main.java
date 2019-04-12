package application;

import java.util.ArrayList;

import Controllers.ChangeController;
import Controllers.DeleteController;
import Controllers.MainController;
import Controllers.UsersController;
import Controllers.WtfController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{
	public static ArrayList<DomainClient> list = new ArrayList<DomainClient>();
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("/Scenes/MainScene.fxml"));
		primaryStage.setTitle("DomainClient");
		primaryStage.setScene(new Scene(root , 630 , 400));
		primaryStage.show();
		MainController.primarystage = primaryStage;
		WtfController.primarystage = primaryStage;
		UsersController.primarystage = primaryStage;
		DeleteController.primarystage = primaryStage;
		ChangeController.primarystage = primaryStage;
		
	}
	public static void main(String[] args  ) { launch(args);
		
	}
}
