import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.animation.FadeTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Delproj {
    static ResultSet resultSet = null;
    static PreparedStatement statement = null;
    static Connection connection = null;
    private StackPane root;
    private Scene scene;
    private ImageView backgroundImageView;
    int val;
    private TextField usernameField;
    ComboBox<String> comboBox = new ComboBox<>();
            
    // private PasswordField passwordField;
     private String selectedValue;
    private Text titleLabel;

    public void select(){
        ResultSet p =Fetch.result(null);
        try{
        while(p.next()){
           // String id = p.getString("group_id");
           int intValue = p.getInt("group_id");

                // Convert it to a String
                String stringValue = Integer.toString(intValue);
                
            comboBox.getItems().add(stringValue+" "+p.getString("group_name"));
        }
    }catch(SQLException e){
        e.printStackTrace();
    }

    }
    
   public void delquery(int value){
    
    try{
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage", "root", "mysql");
              
             String sql = "delete from loginpage.projdet where group_id = ?";
             statement = connection.prepareStatement(sql);
             statement.setInt(1,value);
             int rowsAffected = statement.executeUpdate(); // Execute the DELETE statement
            
            if (rowsAffected > 0) {
                System.out.println(rowsAffected + " row(s) deleted successfully.");
            } else {
                System.out.println("No rows deleted. Check your WHERE condition.");
            }
             Alert alert = new Alert(AlertType.CONFIRMATION);
             alert.setTitle("Success");
                 alert.setHeaderText(null);
                alert.setContentText("profile deleted");
                alert.showAndWait();

    }catch(SQLException e){
         Alert alert = new Alert(AlertType.ERROR);
             alert.setTitle("Error");
                 alert.setHeaderText(null);
                alert.setContentText("NOT EXECUTED");
                alert.showAndWait();
        e.printStackTrace();
    }

    }

    public void del(Stage back){

         Stage newStage = new Stage();
        newStage.setTitle("superX");
        newStage.getIcons().add(new Image("Images/group.png"));
        newStage.setResizable(false);

        // Create a root StackPane for the new window
        root = new StackPane();
        scene = new Scene(root, 2000, 1000);

        // Background image
        backgroundImageView = new ImageView(new Image("Images/back2.jpeg"));
        backgroundImageView.setFitWidth(scene.getWidth());
        backgroundImageView.setFitHeight(scene.getHeight());

        // Add the backgroundImageView to the root StackPane
        root.getChildren().add(backgroundImageView);
        

        // Add items to the ComboBox
        select();
        // Set a default value
        // comboBox.setValue("Option 1");

        // Back button
        Button backButton = new Button(" Back");
        backButton.setMinSize(100, 50);

        // Set the background color and increase text size
        //backButton.setStyle("-fx-background-color: pink; -fx-font-weight: bold; -fx-font-size: 26px; -fx-background-radius: 100px;");
         BackgroundFill buttonBackground31 = new BackgroundFill(Color.DARKCYAN, new CornerRadii(5), null);
        Background buttonBackgroundFill31 = new Background(buttonBackground31);
        backButton.setBackground(buttonBackgroundFill31);
        FadeTransition colorTransition31=new FadeTransition(Duration.seconds(1),backButton);
        colorTransition31.setFromValue(1.0);
        colorTransition31.setToValue(0.3);
        DropShadow dropShadow31 = new DropShadow(40, Color.DARKVIOLET);
        dropShadow31.setRadius(10);
        dropShadow31.setOffsetX(3.0);
        dropShadow31.setOffsetY(3.0);
        dropShadow31.setColor(Color.DARKGOLDENROD);
        backButton.setEffect(dropShadow31);
        backButton.setFont(Font.font(22));

       

        // Position the button in the top-left corner
        StackPane.setAlignment(backButton, Pos.TOP_LEFT);
        StackPane.setMargin(backButton, new Insets(10, 10, 10, 10));

        root.getChildren().add(backButton); 


         // label add 
        titleLabel = new Text("DELETE CARD");
        StackPane.setAlignment(titleLabel, Pos.CENTER);
        StackPane.setMargin(titleLabel, new Insets(-390, 1000, 0, 500));
        titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 50));
        titleLabel.setStyle("-fx-background-color:Black; -fx-background-radius: 100px;");
        StackPane.setAlignment(titleLabel, Pos.CENTER);
        StackPane.setMargin(titleLabel, new Insets(-600, 800, 0, 850));
        titleLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD,FontPosture.ITALIC, 120));
       // titleLabel.setStyle("-fx-background-color:BLACK; -fx-background-radius: 100px;"); // Set the background color and radius
        titleLabel.setFill(Color.WHITE);
       // titleLabel.setTranslateX(255);
        titleLabel.setTranslateY(150); // Set the background color and radius
         FadeTransition colorTransition33=new FadeTransition(Duration.seconds(1),titleLabel);
        colorTransition33.setFromValue(1.0);
        colorTransition33.setToValue(0.3);
        DropShadow dropShadow33 = new DropShadow(40, Color.DARKVIOLET);
        titleLabel.setFill(Color.WHITE); 
        dropShadow33.setRadius(10);
        dropShadow33.setOffsetX(3.0);
        dropShadow33.setOffsetY(3.0);
        dropShadow33.setColor(Color.DARKGOLDENROD);
        titleLabel.setEffect(dropShadow33);

        // Username and Password fields
        usernameField = new TextField();
        // passwordField = new PasswordField();

        // usernameField.setPromptText("Enter Username");
        // passwordField.setPromptText("Enter Password");

        // Position the fields in the center
        StackPane.setAlignment(usernameField, Pos.CENTER);
        StackPane.setMargin(usernameField, new Insets(-190, 1000, 0, 500));
        usernameField.setPrefHeight(50);
        usernameField.setFont(Font.font(25));

        // StackPane.setAlignment(passwordField, Pos.CENTER);
        // StackPane.setMargin(passwordField, new Insets(-50, 1000, 0, 500));
        // passwordField.setPrefHeight(50);
        // passwordField.setFont(Font.font(25));

        root.getChildren().addAll(titleLabel,comboBox);

        // Login button
        Button loginButton = new Button("Delete");
        loginButton.setMinSize(120, 60);
        loginButton.setFont(Font.font(22));
        // Set the background color and increase text size
       // loginButton.setStyle("-fx-background-color: red; -fx-font-weight: bold; -fx-font-size: 20px; -fx-background-radius: 100px;");
         BackgroundFill buttonBackground32 = new BackgroundFill(Color.DARKCYAN, new CornerRadii(5), null);
        Background buttonBackgroundFill32 = new Background(buttonBackground32);
        loginButton.setBackground(buttonBackgroundFill32);
        FadeTransition colorTransition32=new FadeTransition(Duration.seconds(1),loginButton);
        colorTransition32.setFromValue(1.0);
        colorTransition32.setToValue(0.3);
        DropShadow dropShadow32 = new DropShadow(40, Color.DARKVIOLET);
        dropShadow32.setRadius(10);
        dropShadow32.setOffsetX(3.0);
        dropShadow32.setOffsetY(3.0);
        dropShadow32.setColor(Color.DARKGOLDENROD);
        loginButton.setEffect(dropShadow32);
         loginButton.setTranslateX(255);
         loginButton.setTranslateY(25);
        comboBox.setOnAction(e -> {
            Character ch=0;
            if(comboBox.getValue()==null)
            ch = 0;
            else{
                int i=0;
                selectedValue="";
                while (comboBox.getValue().charAt(i)>=48 && comboBox.getValue().charAt(i)<=57) {
                    ch=comboBox.getValue().charAt(i);
                     selectedValue += (ch.toString());
                     i++;
                }
              
        //  selectedValue =ch.toString();
         val = Integer.parseInt(selectedValue);
            }
          //selectedValue=selected;
        //   newstring = selectedValue;
            System.out.println(selectedValue);
            System.out.println(val);
            // }
            // .setText("Selected Value: " + selectedValue);
        });
        // Position the button in the bottom center
        StackPane.setAlignment(loginButton, Pos.BOTTOM_CENTER);
        StackPane.setMargin(loginButton, new Insets(0, 510, 400, 0));

        root.getChildren().add(loginButton);

      //  primaryStage.setScene(scene);

        loginButton.setOnAction(event -> {
           
           // System.out.println(selectedValue);
           System.out.println("System "+selectedValue);
           if(selectedValue==null){
            Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Error");
                 alert.setHeaderText(null);
                alert.setContentText("Please select value");
                alert.showAndWait();
           }else{    

                delquery(val);
                comboBox.getSelectionModel().clearSelection();
                comboBox.getItems().clear();
                selectedValue=null;
                select(); 
            }
        });

        newStage.setScene(scene);
      
        // back button
        backButton.setOnAction(event -> {
            back.show();
            newStage.close();
        });

        newStage.show();
    }
}