import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SuperxData {

    private StackPane root;
    private Scene scene;
    private ImageView backgroundImageView;

    void openNewWindow(Stage primaryStage) {
        Stage newStage = new Stage();
        newStage.setTitle("superX");
        newStage.getIcons().add(new Image("Images/group.png"));
        newStage.setResizable(false);

        
        root = new StackPane();
        scene = new Scene(root, 2000, 1000);

        // Background image
        backgroundImageView = new ImageView(new Image("Images/superxBackground.png"));
        backgroundImageView.setFitWidth(scene.getWidth());
        backgroundImageView.setFitHeight(scene.getHeight());

    //    backgroundImageView=null;

      
        root.getChildren().add(backgroundImageView);

        // Back button
        Button backButton = new Button("<- Back");
        backButton.setMinSize(100, 50);

       
        backButton.setStyle("-fx-background-color: pink; -fx-font-weight: bold; -fx-font-size: 26px; -fx-background-radius: 100px;");

        
        StackPane.setAlignment(backButton, Pos.TOP_LEFT);
        StackPane.setMargin(backButton, new Insets(10, 10, 10, 10));

        root.getChildren().add(backButton); 

        newStage.setScene(scene);

        backButton.setOnAction(event -> {
            primaryStage.show();
            newStage.close();
        });

        newStage.show();
    }
}