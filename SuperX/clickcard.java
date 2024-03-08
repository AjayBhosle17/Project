import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.animation.FadeTransition;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class clickcard {

    private StackPane root;
    private Scene scene;
    private ImageView backgroundImageView;
    static ResultSet resultSet = null;
    static Statement statement = null;
    static Connection connection = null;

    public static void result() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage", "root", "mysql");
            statement = connection.createStatement();
            String sql = "SELECT * FROM projdet";
            resultSet = statement.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int count() {
        result();
        int cnt = 1;
        try {
            if (resultSet != null) {
                while (resultSet.next()) {
                    cnt++;
                }
            }
        } catch (SQLException e) {
        }
        return cnt;
    }

    void openNewWindow10(Stage primaryStage, MouseEvent mouseEvent, int x) {
        Stage newStage = new Stage();
        newStage.setTitle("superX");
        newStage.getIcons().add(new Image("Images/group.png"));
        newStage.setResizable(false);

        root = new StackPane();

        

        
      

        // Create a ScrollPane and wrap the root in it for vertical scrolling
        ScrollPane scrollPane = new ScrollPane(new Group(root));
       

        scrollPane.setPrefViewportHeight(2000); 
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS); // Horizontal scroll bar always visible
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        
     
       
 // Set the preferred height for the viewport
        scene = new Scene(scrollPane, 2000, 1000);
      

        


        // Background image
       // backgroundImageView = new ImageView(new Image("Images/addP.png"));
       // backgroundImageView.setFitHeight(10000);
       // backgroundImageView.setFitWidth(scene.getWidth());
       // backgroundImageView.setFitHeight(scene.getHeight());

        
       // root.getChildren().add(backgroundImageView);

        // Back button
        Button backButton = new Button(" Back");
        backButton.setMinSize(100, 50);
        backButton.setTranslateX(-890);
        backButton.setTranslateY(-550);
        BackgroundFill buttonBackground = new BackgroundFill(Color.DARKCYAN, new CornerRadii(5), null);
        Background buttonBackgroundFill = new Background(buttonBackground);
        backButton.setBackground(buttonBackgroundFill);
    
        FadeTransition colorTransition3=new FadeTransition(Duration.seconds(5),backButton);
        colorTransition3.setFromValue(0);
        colorTransition3.setToValue(1);
        DropShadow dropShadow30 = new DropShadow( );
        dropShadow30.setRadius(10);
        dropShadow30.setOffsetX(3.0);
        dropShadow30.setOffsetY(3.0);
        dropShadow30.setColor(Color.DARKGOLDENROD);
        backButton.setEffect(dropShadow30);
        backButton.setFont(Font.font(22));

    

       
        //backButton.setStyle("-fx-background-color: pink; -fx-font-weight: bold; -fx-font-size: 26px; -fx-background-radius: 100px;");

        
        //StackPane.setAlignment(backButton, Pos.TOP_LEFT);
        //StackPane.setMargin(backButton, new Insets(10, 10, 10, 10));

        root.getChildren().addAll(backButton);




         result();

        System.out.println(x);

        // project Description
        String str1 = null;
        
        //group name

        String str2 = null;
      
        // member name
        String name1=null;
        String name2=null;
        String name3=null;
        String name4=null;
        String name5=null;
        

        ImageView imageView1 = null;
        ImageView imageView2 = null;
        ImageView imageView3 = null;
       

         // about us images
         ImageView imageView4 = null;
         ImageView imageView5 = null;
         ImageView imageView6 = null;
         ImageView imageView7 = null;
         ImageView imageView8 = null;

        try {
            while(resultSet.next()) {
                if(resultSet.getInt("group_id") == x) {
                    str1 = resultSet.getString("proj_descrip");
                    byte[] data1 = resultSet.getBytes("home_photo");
                    Image gpimage1 = new Image(new ByteArrayInputStream(data1));
                    imageView1 = new ImageView(gpimage1);
                     str2=resultSet.getString("group_name");

                    byte[] data2 = resultSet.getBytes("op");
                    Image gpimage2 = new Image(new ByteArrayInputStream(data2));
                    imageView2 = new ImageView(gpimage2);

                    byte[] data3 = resultSet.getBytes("group_photo");
                    Image gpimage3 = new Image(new ByteArrayInputStream(data3));
                    imageView3 = new ImageView(gpimage3);

                   
                    System.out.println("ajuu kay kroty1");
                    byte[] img1 = resultSet.getBytes("image1");
                if (img1 != null) {
                    Image student1 = new Image(new ByteArrayInputStream(img1));
                    imageView4 = new ImageView(student1);
                    imageView4.setFitWidth(170);
                    imageView4.setFitHeight(180);
                    imageView4.setTranslateX(-200);
                    imageView4.setTranslateY(2400);
                    name1 = resultSet.getString("member1");
                }

                byte[] img2 = resultSet.getBytes("image2");
                if (img2 != null) {
                    Image student2 = new Image(new ByteArrayInputStream(img2));
                    imageView5 = new ImageView(student2);
                    imageView5.setFitWidth(170);
                    imageView5.setFitHeight(180);
                     imageView5.setTranslateX(150);
                    imageView5.setTranslateY(2400);
                    name2 = resultSet.getString("member2");
                }else{

                    System.out.println("ajuu kay kroty5");
                     break;
                }

                byte[] img3 = resultSet.getBytes("image3");
                 System.out.println("ajuu kay kroty2");
                if (img3==null) {

                     System.out.println("ajuu kay kroty3");
                     break;
                }else{
                     System.out.println("ajuu kay kroty4");
                    Image student3 = new Image(new ByteArrayInputStream(img3));
                    imageView6 = new ImageView(student3);
                    imageView6.setFitWidth(170);
                    imageView6.setFitHeight(180);
                     imageView6.setTranslateX(-470);
                    imageView6.setTranslateY(2730);
                    name3 = resultSet.getString("member3");
                
                }

                byte[] img4 = resultSet.getBytes("image4");
                if (img4 != null) {
                    Image student4 = new Image(new ByteArrayInputStream(img4));
                    imageView7 = new ImageView(student4);
                    imageView7.setFitWidth(170);
                    imageView7.setFitHeight(180);
                    imageView7.setTranslateX(0);
                    imageView7.setTranslateY(2730);
                    name4 = resultSet.getString("member4");

                }else{
                  
                    System.out.println("ajuu kay kroty8");
                     break;
                }

                byte[] img5 = resultSet.getBytes("image5");
                
                if (img5 != null) {
                    Image student5 = new Image(new ByteArrayInputStream(img5));
                    imageView8 = new ImageView(student5);
                    imageView8.setFitWidth(170);
                    imageView8.setFitHeight(180);
                    imageView8.setTranslateX(400);
                    imageView8.setTranslateY(2730);
                    name5 = resultSet.getString("member5");

                }else{

                   System.out.println("ajuu kay kroty9");
                     break;

                }

                break;

                }
            }
        

        }catch (SQLException sqlException) {

        }

        //group name

        Label gp= new Label(str2);
            gp.setStyle("-fx-font-weight: Times New Roman; -fx-font-size: 100px; -fx-text-fill: black;-fx-alignment: TOP;");
            gp.setTranslateX(0);
            gp.setTranslateY(-350);
              DropShadow dropShadow6 = new DropShadow(70, Color.BLUE);
            gp.setEffect(dropShadow6);
            gp.setAlignment(Pos.TOP_CENTER);
            root.getChildren().add(gp);
       

       // group images

        imageView1.setFitWidth(600);
        imageView1.setFitHeight(600);
         imageView1.setTranslateX(-400);
       imageView1.setTranslateY(900);
       DropShadow dropShadow10 = new DropShadow(80, Color.RED);
       imageView1.setEffect(dropShadow10);
       root.getChildren().add(imageView1);

        imageView2.setFitWidth(800);
        imageView2.setFitHeight(600);
        imageView2.setTranslateX(0);
        imageView2.setTranslateY(1750);
        DropShadow dropShadow11 = new DropShadow(80, Color.RED);
       imageView2.setEffect(dropShadow11);
        root.getChildren().add(imageView2);

          HBox hbox4 = new HBox();
          VBox vbox4 = new VBox(60);
         Text welcomeText4 = new Text("GROUP IMAGE");
       //  welcomeText3.setX(100);
        // welcomeText3.setY(100);
         welcomeText4.setFill(Color.BLACK);   
         welcomeText4.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,60));
         welcomeText4.setStyle("-fx-padding : 0 0 0 0; -fx-alignment : TOP");
         DropShadow dropShadow4 = new DropShadow(70, Color.BLUE);
         welcomeText4.setEffect(dropShadow4);
         vbox4.getChildren().addAll(welcomeText4); 
         hbox4.setTranslateX(270);
         hbox4.setTranslateY(1620);
         hbox4.getChildren().addAll(vbox4);
            root.getChildren().add(hbox4);
 
        imageView3.setFitWidth(600);
        imageView3.setFitHeight(600);
         imageView3.setTranslateX(500);
        imageView3.setTranslateY(900);
        DropShadow dropShadow13 = new DropShadow(80, Color.RED);
       imageView3.setEffect(dropShadow13);
        root.getChildren().add(imageView3);


          HBox hbox3 = new HBox();
          VBox vbox3 = new VBox(60);
         Text welcomeText3 = new Text("PROJECT OUTPUT IMAGE");
       //  welcomeText3.setX(100);
        // welcomeText3.setY(100);
         welcomeText3.setFill(Color.BLACK);   
         welcomeText3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,60));
         welcomeText3.setStyle("-fx-padding : 0 0 0 0; -fx-alignment : TOP");
         DropShadow dropShadow3 = new DropShadow(70, Color.BLUE);
         welcomeText3.setEffect(dropShadow3);
         vbox3.getChildren().addAll(welcomeText3); 
         hbox3.setTranslateX(110);
         hbox3.setTranslateY(750);
         hbox3.getChildren().addAll(vbox3);
            root.getChildren().add(hbox3);

        
      //  HBox grpImages = new HBox();
      //  grpImages.setSpacing(60); 
       // grpImages.setTranslateY(80);
      //  grpImages.setAlignment(Pos.TOP_CENTER);
      //  grpImages.getChildren().addAll(imageView1, imageView2, imageView3);
       // root.getChildren().add(grpImages);

    
        // project Description
         HBox hbox2 = new HBox();
          VBox vbox2 = new VBox(60);
         Text welcomeText1 = new Text("DESCRIPTION");
      //   welcomeText1.setX(100);
       //  welcomeText1.setY(100);
         welcomeText1.setFill(Color.BLACK);   
         welcomeText1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,60));
         welcomeText1.setStyle("-fx-padding : 0 0 0 0; -fx-alignment : TOP");
         DropShadow dropShadow1 = new DropShadow(70, Color.BLUE);
         welcomeText1.setEffect(dropShadow1);
         vbox2.getChildren().addAll(welcomeText1); 
         hbox2.setTranslateX(250);
         hbox2.setTranslateY(130);
         hbox2.getChildren().addAll(vbox2);
        root.getChildren().add(hbox2);

     /*     TextArea dt = new TextArea();
        dt.setText(str1);
        dt.setPrefHeight(70);
        dt.setPrefWidth(25);
        dt.setFont(Font.font(25));
        dt.setTranslateY(-300);
        dt.setTranslateX(320);
        dt.setStyle("-fx-control-inner-background : grey");
        StackPane.setAlignment(dt, Pos.TOP_RIGHT);
        StackPane.setMargin(dt, new Insets(500 ,400,250,800));

        dt.setWrapText(true); 

        root.getChildren().addAll(dt);*/

        Label label1=new Label();
        label1.setText(str1);
        label1.setWrapText(true);
        label1.setPrefHeight(500);
        label1.setPrefWidth(1000);
        label1.setTranslateX(0);
         label1.setTranslateY(150);
        Font font=Font.font("Lato",FontWeight.NORMAL,30);
        label1.setFont(font);
        root.getChildren().addAll(label1);
       
    
        
   
          HBox hbox5 = new HBox();
          VBox vbox5 = new VBox(60);
         Text welcomeText5 = new Text("MEMBER IMAGES");
      //   welcomeText1.setX(100);
       //  welcomeText1.setY(100);
         welcomeText5.setFill(Color.BLACK);   
         welcomeText5.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,60));
         welcomeText5.setStyle("-fx-padding : 0 0 0 0; -fx-alignment : TOP");
         DropShadow dropShadow5= new DropShadow(70, Color.BLUE);
         welcomeText5.setEffect(dropShadow5);
         vbox5.getChildren().addAll(welcomeText5); 
         hbox5.setTranslateX(230);
         hbox5.setTranslateY(2490);
         hbox5.getChildren().addAll(vbox5);
        root.getChildren().add(hbox5);

         if (imageView4 != null) {

            root.getChildren().addAll(imageView4);
            Label member1 = new Label(name1);
            member1.setStyle("-fx-font-weight: bold; -fx-font-size: 30px; -fx-text-fill: black;-fx-alignment: center-left;");
            member1.setTranslateX(-200);
            member1.setTranslateY(2520);
            member1.setAlignment(Pos.BOTTOM_CENTER);
            root.getChildren().add(member1);

       
         } 

         
         if (imageView5 != null) {

            root.getChildren().addAll(imageView5);
            Label member2 = new Label(name2);
            member2.setStyle("-fx-font-weight: bold; -fx-font-size: 30px; -fx-text-fill: black;-fx-alignment: center-left;");
            member2.setTranslateX(150);
            member2.setTranslateY(2520);
            member2.setAlignment(Pos.BOTTOM_CENTER);
            root.getChildren().add(member2);
       
         } 
         
         if (imageView6 != null) {

            root.getChildren().addAll(imageView6);
            Label member3 = new Label(name3);
            member3.setStyle("-fx-font-weight: bold; -fx-font-size: 30px; -fx-text-fill: black;-fx-alignment: center-left;");
            member3.setTranslateX(-470);
            member3.setTranslateY(2860);
            member3.setAlignment(Pos.BOTTOM_CENTER);
            root.getChildren().add(member3);
       
         } 
         
         if (imageView7 != null) {

            root.getChildren().addAll(imageView7);
            Label member4= new Label(name4);
            member4.setStyle("-fx-font-weight: bold; -fx-font-size: 30px; -fx-text-fill: black;-fx-alignment: center-left;");
            member4.setTranslateX(0);
            member4.setTranslateY(2860);
            member4.setAlignment(Pos.BOTTOM_CENTER);
            root.getChildren().add(member4);
       
         } 
         
         if (imageView8 != null) {

            root.getChildren().addAll(imageView8);
            Label member5 = new Label(name5);
            member5.setStyle("-fx-font-weight: bold; -fx-font-size: 30px; -fx-text-fill: black;-fx-alignment: center-left;");
            member5.setTranslateX(400);
            member5.setTranslateY(2860);
            member5.setAlignment(Pos.BOTTOM_CENTER);
            root.getChildren().add(member5);
         } 

        newStage.setScene(scene);
      

              

        

        backButton.setOnAction(event -> {

            System.out.println("clicked");
            primaryStage.show();
            newStage.close();
            Fetch data = new  Fetch();
            data.showCard(primaryStage);
        });

        newStage.show();
    }

}