import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration; 

public class Fetch {

    static ResultSet resultSet = null;
    static Statement statement = null;
    static Connection connection = null;

    
  //  static String names[] = new String[5];
    

    public static ResultSet result(String que){
        try {
            String sql;
                ResultSet newres;
             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage", "root", "mysql");
             statement = connection.createStatement();
              sql = "SELECT * FROM projdet";
              if(que==null)
             resultSet = statement.executeQuery(sql);
             else
                 newres = statement.executeQuery(que);
            
        } catch (Exception e) {
           
            e.printStackTrace();
        }
        return resultSet;
    }
    public int count() {
        result(null);
        int cnt = 1;
        try {
            if(resultSet != null) {
            while(resultSet.next()) {
                cnt++;
            }
        }
        } catch (SQLException e) {
            
        }
        return cnt;
    }

     public static void showCard(Stage primaryStage) {

        String str = null;
        TilePane tilePane = new TilePane();
        tilePane.setHgap(60);
        tilePane.setVgap(80);
        tilePane.setPrefHeight(1000);
        tilePane.setPadding(new Insets(40, 0, 92 , 80));


        

        Stage stage1 = new Stage();
        stage1.setTitle("superX");
        stage1.getIcons().add(new Image("Images/group.png"));
        stage1.setResizable(false);

       
        result(null);

      

        

        try {
            while(resultSet.next()) {

                int x = resultSet.getInt("group_id");
                System.out.println(x);
                byte[] data = resultSet.getBytes("card_image");
                Image image = new Image(new ByteArrayInputStream(data)); 
                ImageView imageView = new ImageView(image);
                imageView.setFitWidth(500);  
                imageView.setFitHeight(500);
                System.out.println("Here");
                str = resultSet.getString("proj_name");
                StackPane stackPane = new StackPane();
                stackPane.setPadding(new Insets(0, 0, 0, 20)); 
                Label label = new Label(str);
                label.setTextFill(Color.WHITE);
                label.setAlignment(Pos.BOTTOM_CENTER);
                label.setPrefHeight(50);
                label.setPrefWidth(500);
                label.setTranslateX(0);
                label.setTranslateY(280);
               
                DropShadow dropShadow3 = new DropShadow(80, Color.RED);
                imageView.setEffect(dropShadow3);
                Timeline timeline1 = new Timeline(
                  new KeyFrame(Duration.ZERO, new KeyValue(dropShadow3.radiusProperty(), 90)),
                  new KeyFrame(Duration.seconds(3), new KeyValue(dropShadow3.radiusProperty(), 15)),
                  new KeyFrame(Duration.seconds(2), new KeyValue(dropShadow3.radiusProperty(), 15))
              );
              timeline1.setCycleCount(Timeline.INDEFINITE);
              timeline1.play();
               
                stackPane.setMaxWidth(700);
                stackPane.setMaxHeight(400);
                stackPane.setPadding(new Insets(20));
                label.setStyle(" -fx-font-weight: bold; -fx-font-size: 40px; -fx-background-radius: 100px;");

                
                stackPane.getChildren().addAll(imageView,label);

                tilePane.getChildren().add(stackPane);

                imageView.setOnMouseClicked(event ->{ 
                
                    clickcard data1= new clickcard();
                    data1.openNewWindow10(primaryStage ,event ,x);
                    primaryStage.close();
                            // imageHandler(event,x);
                });
            }


            System.out.println("Hereeeeeee");

     
                  
        HBox hbox0 = new HBox(0); // Set spacing between VBox elements
        hbox0.setPadding(new Insets(50));
        VBox vbox0 = new VBox(10); // First VBox
        //Text add vishal govind  and description   
           
        Button button = new Button(" Back");

        // Set the background color and increase text size

        Font buttonFont = Font.font("Arial", 22); 
        button.setFont(buttonFont);
        button.setStyle("-fx-font-size: 22; -fx-background-color: darkcyan;");
        button.setMinSize(100, 50);
        button.setStyle("-fx-padding : 0 0  0 0; -fx-alignment : CENTER");
        //hbox0.setStyle("-fx-padding : 0 0 0 0; -fx-alignment : LEFT");


        BackgroundFill buttonBackground = new BackgroundFill(Color.DARKCYAN, new CornerRadii(5), null);
        Background buttonBackgroundFill = new Background(buttonBackground);
        button.setBackground(buttonBackgroundFill);

        

    
        FadeTransition colorTransition3=new FadeTransition(Duration.seconds(5),button);
        colorTransition3.setFromValue(0);
        colorTransition3.setToValue(1);
        DropShadow dropShadow30 = new DropShadow( );
        dropShadow30.setRadius(10);
        dropShadow30.setOffsetX(3.0);
        dropShadow30.setOffsetY(3.0);
        dropShadow30.setColor(Color.DARKGOLDENROD);
        button.setEffect(dropShadow30);
    
        // Position the button in the VBox
         // Position the button in the top-left corner
         StackPane.setAlignment(button, Pos.TOP_RIGHT);
         StackPane.setMargin(button, new Insets(10, 0, 10, 100));
         button.setOnAction(event->{
          colorTransition3.play();
      });
       hbox0.getChildren().addAll(button);
         
            
            
            ScrollPane scrollPane = new ScrollPane(tilePane);
            scrollPane.setFitToWidth(true); 
            scrollPane.setFitToHeight(true);
            scrollPane.setStyle("-fx-background-image : url(Images/back1.jpeg)");
            tilePane.setStyle("-fx-background-image : url(Images/back1.jpeg)");

           


    

         button.setOnAction(event -> {
           
               primaryStage.show();
                stage1.close();
            //    Main obj = new Main();
            //    obj.start(new Stage());
            });
    
    
           
       

            
          //  Button back = new Button("Back");
           // back.setMinSize(100, 50);
          //  back.setStyle("-fx-background-color: pink; -fx-font-weight: bold; -fx-font-size: 20px; -fx-background-radius: 100px;");

            HBox bhb = new HBox();
           // bhb.getChildren().add(back);
         //   bhb.setPadding(new Insets(1,10,0,10));
            VBox vb = new VBox();
            vb.setPrefHeight(990);
            vb.setPrefWidth(1990);
            vb.getChildren().addAll(bhb,button,scrollPane);
            vb.setStyle("-fx-background-image : url(Images/back1.jpeg)");

            
           
          /*   back.setOnAction(event -> {
           
               primaryStage.show();
                stage1.close();
               Main obj = new Main();
               obj.start(new Stage());
            });*/


            Scene scene = new Scene(vb,2000,1000);
             
            stage1.setScene(scene);
            stage1.show();
            

        } catch (SQLException e) {
            System.out.println("Not HAndled");
            e.printStackTrace();
        }

    
    }

}