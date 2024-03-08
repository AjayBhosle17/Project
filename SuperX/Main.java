import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
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
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
    private StackPane root;
    private Scene scene;
    private ImageView backgroundImageView;
    private String[] imagePaths = {
        
        "Images/Image4.jpg",
        "Images/Image2.jpg",
        "Images/Image3.jpg"
        // Add images
    };
    private int currentImageIndex = 0;
    private ImageView dynamicImageView;

    public void start(Stage primaryStage) {


        primaryStage.setTitle("superX");
        primaryStage.getIcons().add(new Image("Images/group.png"));
        primaryStage.setFullScreen(false);

        root = new StackPane();
       
        scene = new Scene(root, 2000, 1000);


/******* */
           HBox hbox = new HBox(10);
        HBox hbox1 = new HBox(10);
        HBox hbox2 = new HBox(10);
         HBox hbox3 = new HBox(10);
        
        

        // Adding the C2W logo
        ImageView image1 = new ImageView(new Image("Images/logo.png"));
        image1.setFitHeight(180);
        image1.setFitWidth(180);

        hbox.getChildren().addAll(image1);
       // hbox.setAlignment(Pos.TOP_LEFT);
        hbox.setTranslateX(10);
        hbox.setTranslateY(0);

         
         RotateTransition rotateTransition = new RotateTransition(new Duration(5000), image1);
        rotateTransition.setByAngle(360);
        rotateTransition.setAxis(Rotate.Y_AXIS);
        rotateTransition.setCycleCount(Animation.INDEFINITE);
        rotateTransition.play();

        
         Text welcomeText = new Text("Welcome to SuperX");

        TranslateTransition transition = new TranslateTransition(Duration.seconds(7), welcomeText);
        transition.setToX(100); 
        transition.setToY(100);  
        transition.play();
        
        
        welcomeText.setX(100);
         welcomeText.setY(100);
        welcomeText.setFill(Color.DARKGRAY);    
        welcomeText.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 115));
        hbox1.getChildren().addAll(welcomeText);
        hbox1.setStyle("-fx-padding : 0 10 70 350; -fx-alignment : TOP_LEFT");


         
         Text text= new Text("         Know the code\n          till the core...!");

        
        text.setX(100);
        text.setY(100);
        text.setFill(Color.DARKGRAY);    
        text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 66));
        hbox2.getChildren().addAll(text);
        hbox2.setStyle("-fx-padding : 0  0 0 0 ; -fx-alignment : CENTER");




/******** */



        //  background image
        backgroundImageView = new ImageView(new Image("Images/Frame 1.png"));
        backgroundImageView.setFitWidth(scene.getWidth());
        backgroundImageView.setFitHeight(scene.getHeight());

        // Create a dynamic image
        dynamicImageView = new ImageView(new Image(imagePaths[currentImageIndex]));
        dynamicImageView.setFitWidth(700);
        dynamicImageView.setFitHeight(850);
        dynamicImageView.setPreserveRatio(true);


        /******************************** */
        
        HBox container2 = new HBox(20);
        container2.getChildren().add(dynamicImageView);
        container2.setAlignment(Pos.BOTTOM_LEFT);
        container2.setStyle("-fx-padding:0 150 270 90");



        
   

       
         DropShadow dropShadow = new DropShadow(40, Color.DARKVIOLET);
        DropShadow dropShadow1 = new DropShadow(40, Color.DARKGOLDENROD);
         DropShadow dropShadow2 = new DropShadow(40, Color.DARKRED);
          DropShadow dropShadow3 = new DropShadow(40, Color.DARKRED);
           DropShadow dropShadow4 = new DropShadow();
          
        dynamicImageView.setEffect(dropShadow);
        image1.setEffect(dropShadow2);
        welcomeText.setEffect(dropShadow1);
        text.setEffect(dropShadow3);



        /******************************************** */
        // Set the x and y position of the dynamic image
       // dynamicImageView.setTranslateX(-560);
       // dynamicImageView.setTranslateY(20);

        // Add the backgroundImageView to the root StackPane
       // root.getChildren().add(backgroundImageView);

        // Add the dynamicImageView to the root StackPane
       // root.getChildren().add(dynamicImageView);

       

        //  every 5 seconds change image
        Timeline imageTimeline = new Timeline(
            new KeyFrame(Duration.seconds(5), event -> {

                currentImageIndex = (currentImageIndex + 1) % imagePaths.length;

                dynamicImageView.setImage(new Image(imagePaths[currentImageIndex]));
            })
        );
        
        // infinite time repeated
        imageTimeline.setCycleCount(Timeline.INDEFINITE); 
        imageTimeline.play();

        root.getChildren().addAll(backgroundImageView,container2,hbox,hbox1,hbox2);


        // Create three buttons
        
        Button button1 = new Button("superX");
        Button button2 = new Button("Admin");
        Button button3 = new Button("About US");

        // Customize the buttons
        button1.setMinSize(100, 50);
        button2.setMinSize(100, 50);
        button3.setMinSize(100, 50);

        // Set the background color of the buttons
        BackgroundFill buttonBackground = new BackgroundFill(Color.DARKCYAN, new CornerRadii(5), null);
        Background buttonBackgroundFill = new Background(buttonBackground);
        button1.setBackground(buttonBackgroundFill);
        button2.setBackground(buttonBackgroundFill);
        button3.setBackground(buttonBackgroundFill);

        // Set the font size for the button text
        Font buttonFont = Font.font("Arial", 22); 
        button1.setFont(buttonFont);
        button2.setFont(buttonFont);
        button3.setFont(buttonFont);

        // Set the X and Y positions of the buttonBox
        HBox buttonBox = new HBox(button1, button2, button3);
        buttonBox.setAlignment(Pos.TOP_RIGHT); 
        buttonBox.setSpacing(15); 
        buttonBox.setTranslateX(-20); 
        buttonBox.setTranslateY(10);


        FadeTransition colorTransition=new FadeTransition(Duration.seconds(1),button1);
        colorTransition.setFromValue(1.0);
        colorTransition.setToValue(0.3);

        dropShadow4.setRadius(10);
        dropShadow4.setOffsetX(3.0);
        dropShadow4.setOffsetY(3.0);
        dropShadow4.setColor(Color.DARKGOLDENROD);
        button1.setEffect(dropShadow4);
        
        
        FadeTransition colorTransition1=new FadeTransition(Duration.seconds(1),button2);
        colorTransition1.setFromValue(0);
        colorTransition1.setToValue(1);

        button2.setOnAction(event->{
            colorTransition1.play();
        });

        dropShadow4.setRadius(10);
        dropShadow4.setOffsetX(3.0);
        dropShadow4.setOffsetY(3.0);
        dropShadow4.setColor(Color.DARKGOLDENROD);
        button2.setEffect(dropShadow4);


        
        FadeTransition colorTransition3=new FadeTransition(Duration.seconds(5),button3);
        colorTransition3.setFromValue(0);
        colorTransition3.setToValue(1);

        button3.setOnAction(event->{
            colorTransition3.play();
        });

        dropShadow4.setRadius(10);
        dropShadow4.setOffsetX(3.0);
        dropShadow4.setOffsetY(3.0);
        dropShadow4.setColor(Color.DARKGOLDENROD);
        button3.setEffect(dropShadow4);

        // Add the buttonBox to the root StackPane
        root.getChildren().add(buttonBox);

        //button  functionality

        button1.setOnAction(e -> {

            Fetch obj = new Fetch();
            obj.showCard(primaryStage);
            // SuperxData data = new SuperxData();
            // data.openNewWindow(primaryStage);
            primaryStage.close();
        });

         button2.setOnAction(e -> {
            AdminLogin data = new AdminLogin();
            data.openNewWindow1(primaryStage);
            primaryStage.close();
           
        });
 
        button3.setOnAction(e-> {

            AboutUs data = new AboutUs();
            data.showInfo(primaryStage);
            primaryStage.close();

        });



        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

   
}
