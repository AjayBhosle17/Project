import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.File;

public class app extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Image Selector Example");

        FileChooser fileChooser = new FileChooser();
        Button openButton = new Button("Open Image File");
        ImageView imageView = new ImageView();

        openButton.setOnAction(e -> {
            File file = fileChooser.showOpenDialog(primaryStage);
            if (file != null) {
                
                Image image = new Image(file.toURI().toString());
                imageView.setImage(image);
            }
        });

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(openButton, imageView);

        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) { 
        launch(args);
    }
}
