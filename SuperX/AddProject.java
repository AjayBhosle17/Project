import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AddProject {

    private StackPane root;
    private Scene scene;
    private ImageView backgroundImageView;

    void openNewWindow5(Stage primaryStage) {
        Stage newStage = new Stage();
        newStage.setTitle("superX");
        newStage.getIcons().add(new Image("Images/group.png"));
        newStage.setResizable(false);

        // Create a root StackPane for the new window
        root = new StackPane();
        scene = new Scene(root, 2000, 1000);

        // Background image
        backgroundImageView = new ImageView(new Image("Images/addP.png"));
        backgroundImageView.setFitWidth(scene.getWidth());
        backgroundImageView.setFitHeight(scene.getHeight());


        Text text = new Text("Core2Web Presents The All\n   New Super-X Program...!");
        text.setX(100);
        text.setY(100);
        text.setFill(Color.WHITE);    
        text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 60));
        HBox hbox = new HBox(10);
      //  hbox.setPrefSize(200, 200);
        hbox.getChildren().addAll(text);
        hbox.setStyle("-fx-padding : 40 0 0 630; -fx-alignment : TOP");


        Text text1 = new Text("Add Project...!");
        text1.setX(100);
        text1.setY(100);
        text1.setFill(Color.WHITE);    
        text1.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 50));
        HBox hbox1 = new HBox(10);

      //  hbox.setPrefSize(200, 200);
        hbox1.getChildren().addAll(text1);
        hbox1.setStyle("-fx-padding : 250 0 0 790; -fx-alignment : TOP");
        
        
        // Configure the drop shadow effect for the ImageViews
        DropShadow dropShadow = new DropShadow(40, Color.BLUE);
        text.setEffect(dropShadow);

         // Configure the drop shadow effect for the ImageViews
        DropShadow dropShadow1 = new DropShadow(40, Color.DARKORCHID);
        text1.setEffect(dropShadow1);



         
        TranslateTransition transition = new TranslateTransition(Duration.seconds(7), text);
        transition.setToX(30); // set the target X-coordinate position
        transition.setToY(30);  // Set the target Y-coordinate position
        transition.setCycleCount(TranslateTransition.INDEFINITE);
        transition.setAutoReverse(true);
        ScaleTransition scale = new ScaleTransition(Duration.seconds(1), text);
        scale.setToX(1.2);  // Increase X scale
        scale.setToY(1.2);  // Increase Y scale
        scale.setCycleCount(ScaleTransition.INDEFINITE);
        scale.setAutoReverse(true);

        ParallelTransition parallelTransition = new ParallelTransition(transition, scale);
        parallelTransition.play();
       
        // Add the backgroundImageView to the root StackPane
        root.getChildren().addAll(backgroundImageView,hbox,hbox1);

        // home button
        Button homebutton = new Button("Home");
        Font bf = Font.font("Arial", 20); 
        homebutton.setFont(bf);
        homebutton.setMinSize(100, 50);
        BackgroundFill buttonBackground1 = new BackgroundFill(Color.DARKCYAN, new CornerRadii(5), null);
        Background buttonBackgroundFill1 = new Background(buttonBackground1);
        homebutton.setBackground(buttonBackgroundFill1);

        
        
        FadeTransition colorTransition11=new FadeTransition(Duration.seconds(1),homebutton);
        colorTransition11.setFromValue(1.0);
        colorTransition11.setToValue(0.3);
         DropShadow dropShadow11 = new DropShadow(40, Color.DARKVIOLET);
        dropShadow11.setRadius(10);
        dropShadow11.setOffsetX(3.0);
        dropShadow11.setOffsetY(3.0);
        dropShadow11.setColor(Color.DARKGOLDENROD);
        homebutton.setEffect(dropShadow11);

        // Position the button 
        StackPane.setAlignment(homebutton, Pos.TOP_LEFT);
        StackPane.setMargin(homebutton, new Insets(10, 10, 10, 10));

        root.getChildren().add(homebutton);
        
        
        // add project

        Image img = new Image("Images/Add Project (5).gif");
        ImageView imageView = new ImageView(img);     

        StackPane.setAlignment(imageView, Pos.CENTER);
        imageView.setFitWidth(600); 
        imageView.setFitHeight(390); 
        root.getChildren().add(imageView);

        //  new window open
        imageView.setOnMouseClicked(event ->{
            
            FillDataProject data= new FillDataProject();
            data.openNewWindow7(primaryStage);
            newStage.close();

        });

        newStage.setScene(scene);

        homebutton.setOnAction(event -> {
            primaryStage.show();
            newStage.close(); 

            // Main obj = new Main();
            // obj.start(new Stage());
        });

        newStage.show();
    }
}