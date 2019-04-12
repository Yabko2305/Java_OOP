package application;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Shake {
    private TranslateTransition tt;

    public Shake (Node node){
    	
        tt = new TranslateTransition(Duration.millis(70), node);
        tt.setFromX(0f);
        tt.setByX(12f);
        tt.setCycleCount(4);
        tt.setAutoReverse(true);
    }
    public void playanim(Node node){
        tt.playFromStart();
        
       
    }
}