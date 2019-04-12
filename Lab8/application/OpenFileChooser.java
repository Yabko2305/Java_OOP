package application;


import java.io.File;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class OpenFileChooser  {

    public File getFile(){
        Stage primaryStage = new Stage();
        final FileChooser fileChooser = new FileChooser();
        configuringFileChooser(fileChooser);
        File file = fileChooser.showSaveDialog(primaryStage);
        return file;
    }

    private void configuringFileChooser(FileChooser fileChooser) {
        fileChooser.setTitle("Select File");

        fileChooser.getExtensionFilters().addAll(//
                new FileChooser.ExtensionFilter("LST", "*.lst"), //
                new FileChooser.ExtensionFilter("XML", "*.xml"));
    }

}