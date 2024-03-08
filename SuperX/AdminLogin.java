import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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

public class AdminLogin {

    private StackPane root;
    private Scene scene;
    private ImageView backgroundImageView;
    private TextField usernameField;
    private PasswordField passwordField;
    private Text titleLabel;

     private ScaleTransition createZoomTransition(Text text, double scaleX, double scaleY, Duration duration) {
        ScaleTransition transition = new ScaleTransition(duration, text);
        transition.setToX(scaleX);
        transition.setToY(scaleY);
        return transition;
    }

    /**
     * @param primaryStage
     */
    void openNewWindow1(Stage primaryStage) {
        Stage newStage = new Stage();
        newStage.setTitle("superX");
        newStage.getIcons().add(new Image("Images/group.png"));
        newStage.setResizable(false);

        // Create a root StackPane for the new window
        root = new StackPane();
        scene = new Scene(root, 1900, 980);
        

        // Background image
       // backgroundImageView = new ImageView(new Image("Images/login.jpeg"));
        backgroundImageView = new ImageView(new Image("Images/logb (2).gif"));
        backgroundImageView.setFitWidth(scene.getWidth());
        backgroundImageView.setFitHeight(scene.getHeight());

        // Add the backgroundImageView to the root StackPane
        root.getChildren().add(backgroundImageView);

       

        // Create and configure the welcome message Text
        Text text = new Text("Super-X");
        Text text1 = new Text("BEING INNOVATION TOWARDS\n      THE PROJECT WORLD....!");
        text.setX(100);
        text.setY(100);
        text.setFill(Color.DARKGRAY);    
        text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 90));

        

        ScaleTransition zoomIn = createZoomTransition(text, 2.0, 2.0, Duration.seconds(3));
        ScaleTransition zoomOut = createZoomTransition(text, 1.0, 1.0, Duration.seconds(4));

        zoomIn.setOnFinished(event -> {
            zoomOut.play();
        });

        zoomOut.setOnFinished(event -> {
            zoomIn.play();
        });

        zoomIn.play();
        




        text1.setX(100);
        text1.setY(100);
        text1.setFill(Color.DARKGRAY);    
        text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 45));
        HBox hbox = new HBox(10);
        hbox.setPrefSize(200, 200);
        hbox.getChildren().addAll(text);
        hbox.setStyle("-fx-padding : 165  0 0 190; -fx-alignment : CENTER_LEFT");
         HBox hbox1 = new HBox(10);
        hbox1.getChildren().addAll(text1);
        hbox1.setStyle("-fx-padding : 0  0 170 75; -fx-alignment : BOTTOM_LEFT");
         root.getChildren().addAll(hbox,hbox1); 

         DropShadow dropShadow8 = new DropShadow(10, Color.rgb(52, 152, 219, 0.7));
       // text.setEffect(dropShadow8);

        DropShadow dropShadow9 = new DropShadow(20, Color.DARKKHAKI);
        text1.setEffect(dropShadow9);

         // Create a timeline for the animation
        Timeline timeline = new Timeline(
            new KeyFrame(Duration.ZERO,
                new KeyValue(hbox.effectProperty(), dropShadow8),
                new KeyValue(text.fillProperty(), Color.GREY)
            ),
            new KeyFrame(Duration.seconds(1),
                new KeyValue(hbox.effectProperty(), new DropShadow(20, Color.PALEVIOLETRED)),
                new KeyValue(text.fillProperty(), Color.KHAKI)
            ),
            new KeyFrame(Duration.seconds(2),
                new KeyValue(hbox.effectProperty(), dropShadow8),
                new KeyValue(text.fillProperty(), Color.LIGHTSALMON)
            )
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();



        // Back button
        
        Button backButton = new Button(" Back");

        // Set the background color and increase text size

        Font buttonFont = Font.font("Arial", 22); 
        backButton.setFont(buttonFont);
        backButton.setMinSize(100, 50);

        BackgroundFill buttonBackground = new BackgroundFill(Color.DARKCYAN, new CornerRadii(5), null);
        Background buttonBackgroundFill = new Background(buttonBackground);
        backButton.setBackground(buttonBackgroundFill);

        
        FadeTransition colorTransition3=new FadeTransition(Duration.seconds(5),backButton);
        colorTransition3.setFromValue(0);
        colorTransition3.setToValue(1);

        backButton.setOnAction(event->{
            colorTransition3.play();
        });
           DropShadow dropShadow4 = new DropShadow();

        dropShadow4.setRadius(10);
        dropShadow4.setOffsetX(3.0);
        dropShadow4.setOffsetY(3.0);
        dropShadow4.setColor(Color.DARKGOLDENROD);
        backButton.setEffect(dropShadow4);
        


        // Position the button in the top-left corner
        StackPane.setAlignment(backButton, Pos.TOP_LEFT);
        StackPane.setMargin(backButton, new Insets(10, 10, 10, 10));

        root.getChildren().add(backButton); 


         // label add 
        titleLabel = new Text("Login Form");
        StackPane.setAlignment(titleLabel, Pos.CENTER);
        StackPane.setMargin(titleLabel, new Insets(-600, 800, 0, 850));
        titleLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD,FontPosture.ITALIC, 120));
       // titleLabel.setStyle("-fx-background-color:BLACK; -fx-background-radius: 100px;"); // Set the background color and radius
        titleLabel.setFill(Color.WHITE);
        
        // Configure the drop shadow effect for the ImageViews
        DropShadow dropShadow = new DropShadow(40, Color.DARKTURQUOISE);
        titleLabel.setEffect(dropShadow);

        // Username and Password fields
        usernameField = new TextField();
        passwordField = new PasswordField();

        usernameField.setPromptText("Enter Username");
        passwordField.setPromptText("Enter Password");

        // Position the fields in the center
        StackPane.setAlignment(usernameField, Pos.CENTER);
        StackPane.setMargin(usernameField, new Insets(-190, 800, 0, 800));
        usernameField.setPrefHeight(50);
        usernameField.setFont(Font.font(25));

        StackPane.setAlignment(passwordField, Pos.CENTER);
        StackPane.setMargin(passwordField, new Insets(-5, 800, 0, 800));
        passwordField.setPrefHeight(50);
        passwordField.setFont(Font.font(25));

        
        root.getChildren().addAll(usernameField, passwordField,titleLabel);

        // Login button
        Button loginButton = new Button("Login");
        loginButton.setMinSize(120, 60);
        loginButton.setFont(Font.font(25));

        // Set the background color and increase text size
        loginButton.setStyle("-fx-background-color: lightpink; -fx-font-weight: bold; -fx-font-size: 20px; -fx-background-radius: 100px;");

         // Configure the drop shadow effect for the ImageViews
        DropShadow dropShadow1 = new DropShadow(40, Color.DARKGOLDENROD);
        loginButton.setEffect(dropShadow1);
         DropShadow dropShadow2 = new DropShadow(30, Color.DARKMAGENTA);
        usernameField.setEffect(dropShadow2);
         DropShadow dropShadow3 = new DropShadow(30, Color.DARKMAGENTA);
        passwordField.setEffect(dropShadow3);

        // Position the button in the bottom center
        StackPane.setAlignment(loginButton, Pos.BOTTOM_CENTER);
        StackPane.setMargin(loginButton, new Insets(0, 0, 350, 0));

        root.getChildren().add(loginButton);

      //  primaryStage.setScene(scene);

        loginButton.setOnAction(event -> {
           
            connection1 adminLogin = new connection1(usernameField, passwordField);
            boolean val = adminLogin.connectAndValidate(); 

            if(val==true){

                System.out.println("Sucessful");
                AddProject data = new AddProject();
                data.openNewWindow5(primaryStage);
                newStage.close();

            }else{

                System.out.println("Not Sucessful");
            }
        });

        newStage.setScene(scene);
      
        // back button
        backButton.setOnAction(event -> {
            primaryStage.show();
            newStage.close();
        });

        newStage.show();
    }
}