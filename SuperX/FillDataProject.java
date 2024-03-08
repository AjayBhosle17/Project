import java.io.File;

import javafx.animation.FadeTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
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
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;


public class FillDataProject {

    private StackPane root;
    private Scene scene;
    private ImageView backgroundImageView;
    private TextField groupNo;
    private TextField usernameField;
    private TextField usernameField1;
    TextArea dt;
    Image img1;
    TextField no;
    private ImageView imageview;
    private ImageView imageview1;
    private ImageView imageview2;
    private ImageView imageview3;
    private ImageView imageview4;
    private ImageView imageview5;
    private ImageView imageview6;
    private ImageView imageview7;
    private ImageView imageview8;
    ImageView ab2;
    ImageView ab3;
    ImageView ab4;
    ImageView ab5;
    ImageView ab1;


    private File selectedImage;
    private File selectedImage1;
    private File selectedImage2;
    private File selectedImage3;
     private File selectedImage4;
    private File selectedImage5;
    private File selectedImage6;
    private File selectedImage7;
    private File selectedImage8;
    ImageView gpi1;
    ImageView gpi2;
    ImageView gpi3;
    ImageView img;
    TextField member1 = null;
    TextField member5 = null;
    void openNewWindow7(Stage primaryStage) {
        Stage newStage = new Stage();
        newStage.setTitle("superX");
        newStage.getIcons().add(new Image("Images/group.png"));
        newStage.setResizable(false);

       
        root = new StackPane();
        scene = new Scene(root, 2000, 1000);

        // Background image
        backgroundImageView = new ImageView(new Image("Images/backgroundimage3.jpeg"));
        backgroundImageView.setFitWidth(scene.getWidth());
        backgroundImageView.setFitHeight(scene.getHeight());

       
        root.getChildren().add(backgroundImageView);



        // button for data add

        Button button = new Button("Group No");
        Button button1 = new Button("Group Name");
        Button button2 = new Button("Project Name");
        Button button3 = new Button("Description");
        Button button4 = new Button("Card image");
        Button button5 = new Button("Project and Group image");
         
        Button button6 = new Button("About Us");
        Button button7 = new Button("How many students are in group");
        Button button8 = new Button("Submit");
        Button button9 = new Button("Show All Projects");
        Button button10 = new Button("Verify Count of group");


        // Customize the buttons
        button.setMinSize(200, 50);
        button1.setMinSize(200, 50);
        button2.setMinSize(200, 50);
        button3.setMinSize(200, 50);
        button4.setMinSize(200, 50);
        button5.setMinSize(200, 50);
        button6.setMinSize(200, 50);
        button7.setMinSize(200, 50);
        button8.setMinSize(200, 50);
        button9.setMinSize(200, 50);
        button10.setMinSize(200, 50);

         // Set the background color of the buttons
        BackgroundFill buttonBackground = new BackgroundFill(Color.DARKCYAN, new CornerRadii(5), null);
        Background buttonBackgroundFill = new Background(buttonBackground);
        button.setBackground(buttonBackgroundFill);
        button1.setBackground(buttonBackgroundFill);
        button2.setBackground(buttonBackgroundFill);
        button3.setBackground(buttonBackgroundFill);
        button4.setBackground(buttonBackgroundFill);
        button5.setBackground(buttonBackgroundFill);
        button6.setBackground(buttonBackgroundFill);
        button7.setBackground(buttonBackgroundFill);
        button8.setBackground(buttonBackgroundFill);
        button9.setBackground(buttonBackgroundFill);
        button10.setBackground(buttonBackgroundFill);


         
        FadeTransition colorTransition=new FadeTransition(Duration.seconds(1),button);
        colorTransition.setFromValue(1.0);
        colorTransition.setToValue(0.3);
        DropShadow dropShadow = new DropShadow(40, Color.DARKVIOLET);
        dropShadow.setRadius(10);
        dropShadow.setOffsetX(3.0);
        dropShadow.setOffsetY(3.0);
        dropShadow.setColor(Color.DARKGOLDENROD);
        button.setEffect(dropShadow);


        FadeTransition colorTransition1=new FadeTransition(Duration.seconds(1),button1);
        colorTransition1.setFromValue(1.0);
        colorTransition1.setToValue(0.3);
        DropShadow dropShadow1 = new DropShadow(40, Color.DARKVIOLET);
        dropShadow1.setRadius(10);
        dropShadow1.setOffsetX(3.0);
        dropShadow1.setOffsetY(3.0);
        dropShadow1.setColor(Color.DARKGOLDENROD);
        button1.setEffect(dropShadow1);

        FadeTransition colorTransition2=new FadeTransition(Duration.seconds(1),button2);
        colorTransition2.setFromValue(1.0);
        colorTransition2.setToValue(0.3);
        DropShadow dropShadow2 = new DropShadow(40, Color.DARKVIOLET);
        dropShadow2.setRadius(10);
        dropShadow2.setOffsetX(3.0);
        dropShadow2.setOffsetY(3.0);
        dropShadow2.setColor(Color.DARKGOLDENROD);
        button2.setEffect(dropShadow2);
        
        FadeTransition colorTransition3=new FadeTransition(Duration.seconds(1),button3);
        colorTransition3.setFromValue(1.0);
        colorTransition3.setToValue(0.3);
         DropShadow dropShadow3 = new DropShadow(40, Color.DARKVIOLET);
        dropShadow3.setRadius(10);
        dropShadow3.setOffsetX(3.0);
        dropShadow3.setOffsetY(3.0);
        dropShadow3.setColor(Color.DARKGOLDENROD);
        button3.setEffect(dropShadow3);
        
        FadeTransition colorTransition4=new FadeTransition(Duration.seconds(1),button4);
        colorTransition4.setFromValue(1.0);
        colorTransition4.setToValue(0.3);
         DropShadow dropShadow4 = new DropShadow(40, Color.DARKVIOLET);
        dropShadow4.setRadius(10);
        dropShadow4.setOffsetX(3.0);
        dropShadow4.setOffsetY(3.0);
        dropShadow4.setColor(Color.DARKGOLDENROD);
        button4.setEffect(dropShadow4);
        
        FadeTransition colorTransition5=new FadeTransition(Duration.seconds(1),button5);
        colorTransition5.setFromValue(1.0);
        colorTransition5.setToValue(0.3);
         DropShadow dropShadow5 = new DropShadow(40, Color.DARKVIOLET);
        dropShadow5.setRadius(10);
        dropShadow5.setOffsetX(3.0);
        dropShadow5.setOffsetY(3.0);
        dropShadow5.setColor(Color.DARKGOLDENROD);
        button5.setEffect(dropShadow5);
        
        FadeTransition colorTransition6=new FadeTransition(Duration.seconds(1),button6);
        colorTransition6.setFromValue(1.0);
        colorTransition6.setToValue(0.3);
         DropShadow dropShadow6 = new DropShadow(40, Color.DARKVIOLET);
        dropShadow6.setRadius(10);
        dropShadow6.setOffsetX(3.0);
        dropShadow6.setOffsetY(3.0);
        dropShadow6.setColor(Color.DARKGOLDENROD);
        button6.setEffect(dropShadow6);
        
        FadeTransition colorTransition7=new FadeTransition(Duration.seconds(1),button7);
        colorTransition7.setFromValue(1.0);
        colorTransition7.setToValue(0.3);
         DropShadow dropShadow7 = new DropShadow(40, Color.DARKVIOLET);
        dropShadow7.setRadius(10);
        dropShadow7.setOffsetX(3.0);
        dropShadow7.setOffsetY(3.0);
        dropShadow7.setColor(Color.DARKGOLDENROD);
        button7.setEffect(dropShadow7);
        
        FadeTransition colorTransition8=new FadeTransition(Duration.seconds(1),button8);
        colorTransition8.setFromValue(1.0);
        colorTransition8.setToValue(0.3);
         DropShadow dropShadow8 = new DropShadow(40, Color.DARKVIOLET);
        dropShadow8.setRadius(10);
        dropShadow8.setOffsetX(3.0);
        dropShadow8.setOffsetY(3.0);
        dropShadow8.setColor(Color.DARKGOLDENROD);
        button8.setEffect(dropShadow8);
        
        FadeTransition colorTransition9=new FadeTransition(Duration.seconds(1),button9);
        colorTransition9.setFromValue(1.0);
        colorTransition9.setToValue(0.3);
         DropShadow dropShadow9 = new DropShadow(40, Color.DARKVIOLET);
        dropShadow9.setRadius(10);
        dropShadow9.setOffsetX(3.0);
        dropShadow9.setOffsetY(3.0);
        dropShadow9.setColor(Color.DARKGOLDENROD);
        button9.setEffect(dropShadow9);
        
        FadeTransition colorTransition10=new FadeTransition(Duration.seconds(1),button10);
        colorTransition10.setFromValue(1.0);
        colorTransition10.setToValue(0.3);
         DropShadow dropShadow10 = new DropShadow(40, Color.DARKVIOLET);
        dropShadow10.setRadius(10);
        dropShadow10.setOffsetX(3.0);
        dropShadow10.setOffsetY(3.0);
        dropShadow10.setColor(Color.DARKGOLDENROD);
        button10.setEffect(dropShadow10);
        
       
        
        

        


        // Set the font size for the button text
        Font bf = Font.font("Arial", 20); 
        button.setFont(bf);
        button1.setFont(bf);
        button2.setFont(bf);
        button3.setFont(bf);
        button4.setFont(bf);
        button5.setFont(bf);
        button6.setFont(bf);
        button7.setFont(bf);
        button8.setFont(bf);
        button9.setFont(bf);
        button10.setFont(bf);
       
        // button size
        
         button.setTranslateX(-490);
         button.setTranslateY(-410);
         button1.setTranslateX(-490);
         button1.setTranslateY(-350);
         button2.setTranslateX(-490);
         button2.setTranslateY(-280);
         button3.setTranslateX(-490);
         button3.setTranslateY(-170);
         button4.setTranslateX(-490);
         button4.setTranslateY(-30);
         button5.setTranslateX(-515);
         button5.setTranslateY(90);
         button6.setTranslateX(-490);
         button6.setTranslateY(200);
         button7.setTranslateX(-210);
         button7.setTranslateY(200);
         button10.setTranslateX(470);
         button10.setTranslateY(200);
        
        
        
         root.getChildren().addAll(button,button1,button2,button3,button4,button5,button6,button7,button10);
    




        // Add Data
        groupNo = new TextField();  
        usernameField = new TextField();
        usernameField1 = new TextField();
        dt = new TextArea();
        no = new TextField();

        groupNo.setPromptText("Enter Group Number");
        usernameField.setStyle("-fx-prompt-text-fill: white;");
        usernameField.setStyle("-fx-control-inner-background: grey;");
        usernameField1.setStyle("-fx-control-inner-background: grey;");
        groupNo.setStyle("-fx-control-inner-background: grey;");
        dt.setStyle("-fx-control-inner-background: grey;");
        no.setStyle("-fx-control-inner-background: grey;");



        groupNo.setPromptText("Enter Group Number");
        usernameField.setPromptText("Enter Group Name");
        usernameField1.setPromptText("Enter Project Name");
        dt.setPromptText("Enter your description here");
        no.setPromptText("Enter Members Count");


        
        FadeTransition colorTransition20=new FadeTransition(Duration.seconds(1),groupNo);
        colorTransition20.setFromValue(1.0);
        colorTransition20.setToValue(0.3);
        DropShadow dropShadow20 = new DropShadow(60, Color.DARKVIOLET);
        dropShadow20.setRadius(10);
        dropShadow20.setOffsetX(3.0);
        dropShadow20.setOffsetY(3.0);
        dropShadow20.setColor(Color.DARKGOLDENROD);
        groupNo.setEffect(dropShadow20);


        FadeTransition colorTransition21=new FadeTransition(Duration.seconds(1),usernameField);
        colorTransition21.setFromValue(1.0);
        colorTransition21.setToValue(0.3);
        DropShadow dropShadow21 = new DropShadow(60, Color.DARKVIOLET);
        dropShadow21.setRadius(10);
        dropShadow21.setOffsetX(3.0);
        dropShadow21.setOffsetY(3.0);
        dropShadow21.setColor(Color.DARKGOLDENROD);
        usernameField.setEffect(dropShadow21);

        


        FadeTransition colorTransition22=new FadeTransition(Duration.seconds(1),usernameField1);
        colorTransition22.setFromValue(1.0);
        colorTransition22.setToValue(0.3);
        DropShadow dropShadow22 = new DropShadow(60, Color.DARKVIOLET);
        dropShadow22.setRadius(10);
        dropShadow22.setOffsetX(3.0);
        dropShadow22.setOffsetY(3.0);
        dropShadow22.setColor(Color.DARKGOLDENROD);
        usernameField1.setEffect(dropShadow22);

        
        FadeTransition colorTransition23=new FadeTransition(Duration.seconds(1),dt);
        colorTransition23.setFromValue(1.0);
        colorTransition23.setToValue(0.3);
        DropShadow dropShadow23 = new DropShadow(60, Color.DARKVIOLET);
        dropShadow23.setRadius(10);
        dropShadow23.setOffsetX(3.0);
        dropShadow23.setOffsetY(3.0);
        dropShadow23.setColor(Color.DARKGOLDENROD);
        dt.setEffect(dropShadow23);


        FadeTransition colorTransition24=new FadeTransition(Duration.seconds(1),no);
        colorTransition24.setFromValue(1.0);
        colorTransition24.setToValue(0.3);
        DropShadow dropShadow24 = new DropShadow(60, Color.DARKVIOLET);
        dropShadow24.setRadius(10);
        dropShadow24.setOffsetX(3.0);
        dropShadow24.setOffsetY(3.0);
        dropShadow24.setColor(Color.DARKGOLDENROD);
        no.setEffect(dropShadow24);

        //group number
        StackPane.setAlignment(groupNo, Pos.TOP_CENTER);
        StackPane.setMargin(groupNo, new Insets(70, 400, 0, 600));
        groupNo.setPrefHeight(30);
        groupNo.setFont(Font.font(20));

        //group name size
        StackPane.setAlignment(usernameField, Pos.TOP_CENTER);
        StackPane.setMargin(usernameField, new Insets(140, 400, 0, 600));
        usernameField.setPrefHeight(30);
        usernameField.setFont(Font.font(20));

        // project name  size
        StackPane.setAlignment(usernameField1, Pos.TOP_CENTER);
        StackPane.setMargin(usernameField1, new Insets(210, 400, 0, 600));
        usernameField1.setPrefHeight(30);
        usernameField1.setFont(Font.font(20));

        // description size
        dt.setPrefHeight(50);
        dt.setFont(Font.font(20));
        StackPane.setAlignment(dt, Pos.TOP_CENTER);
        StackPane.setMargin(dt, new Insets(280 ,400,600,600));
        dt.setWrapText(true); 

        // group number Count
        StackPane.setAlignment(no, Pos.BOTTOM_RIGHT);
        StackPane.setMargin(no, new Insets(-240, 650, 280, 970));
        
        no.setPrefHeight(50);
        no.setFont(Font.font(20));
        


        root.getChildren().addAll(groupNo ,usernameField, usernameField1, dt,no);




        // file select for background
        img1 = new Image("Images/inputimage2.jpg");
         img = new ImageView(img1);
        img.setFitWidth(100);
        img.setFitHeight(100);
        img.setTranslateX(-250);
        img.setTranslateY(-20);
        root.getChildren().add(img);
        

        

        // Project Group images
        Image gp1 = new Image("Images/grpImg1.jpg");
         gpi1 = new ImageView(gp1);
        gpi1.setFitWidth(100);
        gpi1.setFitHeight(100);
        gpi1.setTranslateX(-250);
        gpi1.setTranslateY(100);
        root.getChildren().add(gpi1);

        Image gp2 = new Image("Images/grpImg4.jpg");
         gpi2 = new ImageView(gp2);
        gpi2.setFitWidth(100);
        gpi2.setFitHeight(100);
        gpi2.setTranslateX(50);
        gpi2.setTranslateY(100);
        root.getChildren().add(gpi2);

        Image gp3 = new Image("Images/grpImg5.png");
         gpi3 = new ImageView(gp3);
        gpi3.setFitWidth(100);
        gpi3.setFitHeight(100);
        gpi3.setTranslateX(350);
        gpi3.setTranslateY(100);
        root.getChildren().add(gpi3);


        // About us images

         Image abi1 = new Image("Images/grpmember1.jpg");
         ab1 = new ImageView(abi1);
        ab1.setFitWidth(160);
        ab1.setFitHeight(100);
        ab1.setTranslateX(-280);
        ab1.setTranslateY(300);
        

        Image abi2 = new Image("Images/grpmember2.jpg");
         ab2 = new ImageView(abi2);
        ab2.setFitWidth(160);
        ab2.setFitHeight(100);
        ab2.setTranslateX(-90);
        ab2.setTranslateY(300);
       

        Image abi3 = new Image("Images/grpmember3.jpg");
         ab3 = new ImageView(abi3);
        ab3.setFitWidth(160);
        ab3.setFitHeight(100);
        ab3.setTranslateX(110);
        ab3.setTranslateY(300);
       

        Image abi4 = new Image("Images/grpmember4.jpg");
         ab4 = new ImageView(abi4);
        ab4.setFitWidth(160);
        ab4.setFitHeight(100);
        ab4.setTranslateX(300);
        ab4.setTranslateY(300);
       
        Image abi5 = new Image("Images/grpmember5.jpg");
         ab5= new ImageView(abi5);
        ab5.setFitWidth(160);
        ab5.setFitHeight(100);
        ab5.setTranslateX(490);
        ab5.setTranslateY(300);
       
        //member name

         // member name

        member1 = new TextField();
                //shadow
        FadeTransition colorTransition25=new FadeTransition(Duration.seconds(1),member1);
        colorTransition25.setFromValue(1.0);
        colorTransition25.setToValue(0.3);
        DropShadow dropShadow25 = new DropShadow(60, Color.DARKVIOLET);
        dropShadow25.setRadius(10);
        dropShadow25.setOffsetX(3.0);
        dropShadow25.setOffsetY(3.0);
        dropShadow25.setColor(Color.DARKGOLDENROD);
         member1.setEffect(dropShadow25);
          //inner background colour of textfield
        member1.setStyle("-fx-control-inner-background: grey;");
        member1.setPromptText("Enter Member name1");

        TextField member2 = new TextField();
        //shadow
        FadeTransition colorTransition26=new FadeTransition(Duration.seconds(1),member2);
        colorTransition26.setFromValue(1.0);
        colorTransition26.setToValue(0.3);
        DropShadow dropShadow26 = new DropShadow(60, Color.DARKVIOLET);
        dropShadow26.setRadius(10);
        dropShadow26.setOffsetX(3.0);
        dropShadow26.setOffsetY(3.0);
        dropShadow26.setColor(Color.DARKGOLDENROD);
        member2.setEffect(dropShadow26);
        //inner background colour of textfield
        member2.setStyle("-fx-control-inner-background: grey;");
        member2.setPromptText("Enter Member name2");

        TextField member3 = new TextField();
           //shadow
           FadeTransition colorTransition27=new FadeTransition(Duration.seconds(1),member3);
           colorTransition27.setFromValue(1.0);
           colorTransition27.setToValue(0.3);
           DropShadow dropShadow27 = new DropShadow(60, Color.DARKVIOLET);
           dropShadow27.setRadius(10);
           dropShadow27.setOffsetX(3.0);
           dropShadow27.setOffsetY(3.0);
           dropShadow27.setColor(Color.DARKGOLDENROD);
           member3.setEffect(dropShadow27);
           //inner background colour of textfield
           member3.setStyle("-fx-control-inner-background: grey;");
        member3.setPromptText("Enter Member name3");
        
        Button delete = new Button("Delete");
        delete.setMinSize(100, 50);
        // Set the background color and increase text size
        //delete.setStyle("-fx-background-color: pink; -fx-font-weight: bold; -fx-font-size: 26px; -fx-background-radius: 100px;");
        // Position the button in the top-left corner
       StackPane.setAlignment(delete, Pos.BOTTOM_RIGHT);
        //StackPane.setMargin(delete, new Insets(100, 10, 10, 10));
         BackgroundFill buttonBackground31 = new BackgroundFill(Color.DARKCYAN, new CornerRadii(5), null);
        Background buttonBackgroundFill31 = new Background(buttonBackground31);
        delete.setBackground(buttonBackgroundFill31);
        FadeTransition colorTransition31=new FadeTransition(Duration.seconds(1),delete);
        colorTransition31.setFromValue(1.0);
        colorTransition31.setToValue(0.3);
        DropShadow dropShadow31 = new DropShadow(40, Color.DARKVIOLET);
        dropShadow31.setRadius(10);
        dropShadow31.setOffsetX(3.0);
        dropShadow31.setOffsetY(3.0);
        dropShadow31.setColor(Color.DARKGOLDENROD);
        delete.setEffect(dropShadow31);
        delete.setTranslateX(-50);
         delete.setTranslateY(-40);
         delete.setFont(Font.font(22));
        root.getChildren().add(delete); 
        

        delete.setOnAction(event->{
            Delproj obj = new Delproj();
            obj.del(newStage);
            newStage.close();
        });
        TextField member4 = new TextField();
        //shadow
        FadeTransition colorTransition28=new FadeTransition(Duration.seconds(1),member4);
        colorTransition28.setFromValue(1.0);
        colorTransition28.setToValue(0.3);
        DropShadow dropShadow28 = new DropShadow(60, Color.DARKVIOLET);
        dropShadow28.setRadius(10);
        dropShadow28.setOffsetX(3.0);
        dropShadow28.setOffsetY(3.0);
        dropShadow28.setColor(Color.DARKGOLDENROD);
        member4.setEffect(dropShadow28);
        //inner background colour of textfield
        member4.setStyle("-fx-control-inner-background: grey;");
        member4.setPromptText("Enter Member name4");

        member5 = new TextField();
                //shadow
                FadeTransition colorTransition29=new FadeTransition(Duration.seconds(1),member5);
                colorTransition29.setFromValue(1.0);
                colorTransition29.setToValue(0.3);
                DropShadow dropShadow29 = new DropShadow(60, Color.DARKVIOLET);
                dropShadow29.setRadius(10);
                dropShadow29.setOffsetX(3.0);
                dropShadow29.setOffsetY(3.0);
                dropShadow29.setColor(Color.DARKGOLDENROD);
                member5.setEffect(dropShadow29);
                
                //inner background colour of textfield
                member5.setStyle("-fx-control-inner-background: grey;");
        member5.setPromptText("Enter Member name5");
        
        //member name postion
        // member 1 name
        StackPane.setAlignment(member1, Pos.BOTTOM_CENTER);
        StackPane.setMargin(member1, new Insets(0, 1180, 120, 590));
        member1.setPrefHeight(20);
        member1.setFont(Font.font(15));

        // member 2 name
        StackPane.setAlignment(member2, Pos.BOTTOM_CENTER);
        StackPane.setMargin(member2, new Insets(0, 980, 120, 790));
        member2.setPrefHeight(20);
        member2.setFont(Font.font(15));

        // member 3 name
        StackPane.setAlignment(member3, Pos.BOTTOM_CENTER);
        StackPane.setMargin(member3, new Insets(0, 780, 120, 990));
        member3.setPrefHeight(20);
        member3.setFont(Font.font(15));

        // member 4 name
        StackPane.setAlignment(member4, Pos.BOTTOM_CENTER);
        StackPane.setMargin(member4, new Insets(0, 580, 120, 1190));
        member4.setPrefHeight(20);
        member4.setFont(Font.font(15));

        // member 5 name
        StackPane.setAlignment(member5, Pos.BOTTOM_CENTER);
        StackPane.setMargin(member5, new Insets(0, 380, 120, 1390));
        member5.setPrefHeight(20);
        member5.setFont(Font.font(15));

/* ********************************************************************************************************** */
   
         // verify button call
 

button8.setDisable(true);    
button10.setOnAction(event -> {
    String memberCountText = no.getText();

    if (memberCountText.isEmpty()) {
        showAlert("Please enter the number of members.");
        no.clear();
    } else {
        
         int  memberCount = Integer.parseInt(memberCountText);

        if (memberCount >= 1 && memberCount <= 5) {
            member1.setVisible(memberCount >= 1);
            ab1.setVisible(memberCount >= 1);
            member2.setVisible(memberCount >= 2);
            ab2.setVisible(memberCount >= 2);
            member3.setVisible(memberCount >= 3);
            ab3.setVisible(memberCount >= 3);
            member4.setVisible(memberCount >= 4);
            ab4.setVisible(memberCount >= 4);
            member5.setVisible(memberCount == 5);
            ab5.setVisible(memberCount >= 5);

            button8.setDisable(false);
        } else if (memberCount > 5) {
            showAlert("A project can have a maximum of 5 members.");
            no.clear();
        } else {
            showAlert("Invalid member count");
            no.clear();
        }
    }
});



        root.getChildren().addAll(ab1,ab2,ab3,ab4,ab5);
        root.getChildren().addAll(member1,member2,member3,member4,member5);
      
/* ************************************************************************* */ 
  
 
       
        // button click 

        button.setOnAction(event -> {
            groupNo.requestFocus(); 
        });

        button1.setOnAction(event -> {
           usernameField.requestFocus(); 
        });

        button2.setOnAction(event -> {
           usernameField1.requestFocus(); 
        });

        button3.setOnAction(event -> {
           dt.requestFocus(); 
        });

        button7.setOnAction(event -> {
          no.requestFocus(); 
        });

/*********************************** click image call************************************************************** */
        // background image click

        img.setOnMouseClicked(e ->  SelectImage());
        gpi1.setOnMouseClicked(e -> SelectImage1());
        gpi2.setOnMouseClicked(e -> SelectImage2());
        gpi3.setOnMouseClicked(e -> SelectImage3());


        // member photo

        ab1.setOnMouseClicked( e  -> SelectImage4());
        ab2.setOnMouseClicked( e  -> SelectImage5());
        ab3.setOnMouseClicked( e  -> SelectImage6());
        ab4.setOnMouseClicked( e  -> SelectImage7());
        ab5.setOnMouseClicked( e  -> SelectImage8());




        // Submit button

         button8.setTranslateX(250);
         button8.setTranslateY(440);



         // Submit button  click

         

         button8.setOnAction(event -> {

         //   (memberCount >= 1 && selectedImage4 == null || member1.getText().isEmpty()))
              String memberCountText = no.getText();
              int  memberCount1 = Integer.parseInt(memberCountText);

           
            if (groupNo.getText().isEmpty()) {
                showAlertAndFocus("Group No field is empty", groupNo);
            } else if (usernameField.getText().isEmpty()) {
                showAlertAndFocus("Group Name field is empty", usernameField);
            } else if (usernameField1.getText().isEmpty()) {
                showAlertAndFocus("Project Name field is empty", usernameField1);
            } else if (dt.getText().isEmpty()) {
                showAlertAndFocus("Description field is empty", member3);
            } else if (selectedImage == null) {
                showAlert("Please select Project Output image.");
            } else if (selectedImage1 == null) {
                showAlert("Please select the first group image.");
            } else if (selectedImage2 == null) {
                showAlert("Please select the second group image.");
           
            } else if (selectedImage3 == null) {
                showAlert("Please select the Third group image.");
           
            } else if (no.getText().isEmpty()) {
                showAlertAndFocus("Group member count is Empty", no);
          
            } else if (memberCount1 >= 1 && selectedImage4 == null ) {
               
                showAlert("Please select First Student image");
            
            }else if(memberCount1 >= 1 &&  member1.getText().isEmpty()){

                showAlertAndFocus("Please Enter First Student name",member1);
            
            }else if (memberCount1 >= 2 && selectedImage5 == null ) {
               
                showAlert("Please select Second Student image");
            
            }else if(memberCount1 >= 2 &&  member2.getText().isEmpty()){

                showAlertAndFocus("Please Enter Second Student name",member2);
            
            }else if (memberCount1 >= 3 && selectedImage6 == null ) {
               
                showAlert("Please select Third Student image");
            
            }else if(memberCount1 >= 3 &&  member3.getText().isEmpty()){

                showAlertAndFocus("Please Enter Third Student name",member3);
            
            }else if (memberCount1 >= 4 && selectedImage7 == null ) {
               
                showAlert("Please select Fourth Student image");
            
            }else if(memberCount1 >= 4 &&  member4.getText().isEmpty()){

                showAlertAndFocus("Please Enter Fourth Student name",member4);
            
            }else if (memberCount1 >= 5 && selectedImage8 == null ) {
               
                showAlert("Please select Fifth Student image");
            
            }else if(memberCount1 >= 5 &&  member5.getText().isEmpty()){

                showAlertAndFocus("Please Enter fifth Student name",member5);
            
            }else{

                Alert al1 = new Alert(AlertType.INFORMATION);
               
                connection2  obj = new connection2();
                System.out.println("Success");

               // member5= new TextField("Ajuu");
               // selectedImage8 = new File("Images/login.png");


                boolean insertionResult = obj.insertData(groupNo.getText(),usernameField.getText(), usernameField1.getText(), dt.getText(), selectedImage,member1.getText(),selectedImage4,member2.getText(),selectedImage5,member3.getText(),selectedImage6,member4.getText(),selectedImage7,member5.getText(),selectedImage8,selectedImage1,selectedImage2,selectedImage3);
                if (insertionResult) {
            

                     al1.setTitle("Success");
                     al1.setHeaderText(null);
                     al1.setContentText("Add Project Successfully.");
                     al1.showAndWait();
                
                }
                
                groupNo.clear();
                usernameField.clear();
                usernameField1.clear();
                dt.clear();
                no.clear();
                member1.clear();
                member2.clear();
                member3.clear();
                member4.clear();
                member5.clear();

                selectedImage = null;
                selectedImage1 = null;
                selectedImage2 = null;
                selectedImage3 = null;
                selectedImage4 = null;
                button8.setDisable(true);
            }
        });


        
             
        
        

         // view project

         button9.setTranslateX(500);
         button9.setTranslateY(440);

          root.getChildren().addAll(button8,button9);

         // Fetch obj = new Fetch();
          button9.setOnAction(e->{
            Fetch.showCard(primaryStage);
            newStage.close();
        });

        // Back button
        Button backButton = new Button(" Back");
        backButton.setFont(bf);
        backButton.setMinSize(100, 50);
        //backButton.setStyle("-fx-background-color: pink; -fx-font-weight: bold; -fx-font-size: 26px; -fx-background-radius: 100px;");

       
        StackPane.setAlignment(backButton, Pos.TOP_LEFT);
        StackPane.setMargin(backButton, new Insets(10, 10, 10, 10));



        BackgroundFill buttonBackground1 = new BackgroundFill(Color.DARKCYAN, new CornerRadii(5), null);
        Background buttonBackgroundFill1 = new Background(buttonBackground1);
        backButton.setBackground(buttonBackgroundFill1);

        
        
        FadeTransition colorTransition11=new FadeTransition(Duration.seconds(1),backButton);
        colorTransition11.setFromValue(1.0);
        colorTransition11.setToValue(0.3);
         DropShadow dropShadow11 = new DropShadow(40, Color.DARKVIOLET);
        dropShadow11.setRadius(10);
        dropShadow11.setOffsetX(3.0);
        dropShadow11.setOffsetY(3.0);
        dropShadow11.setColor(Color.DARKGOLDENROD);
        backButton.setEffect(dropShadow11);

        root.getChildren().add(backButton);

        newStage.setScene(scene);

        backButton.setOnAction(event -> {
            primaryStage.show();
            newStage.close();
            // AddProject data = new AddProject();
            // data.openNewWindow5(primaryStage);
        });

        newStage.show();
    }


    
private void showAlertAndFocus(String message, TextField field) {
            showAlert(message);
            field.requestFocus();
}


private void showAlert(String message) {
    Alert alert = new Alert(AlertType.ERROR);
    alert.setTitle("Error");
    alert.setHeaderText(null);
    alert.setContentText(message);
    alert.showAndWait();
}


    /*******************************Image Select************************************ */

    public void SelectImage() {
        FileChooser filechooser = new FileChooser();
        filechooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files","*.jpg","*.png","*.jpeg","*.gif"));

        selectedImage = filechooser.showOpenDialog(null);
        if(selectedImage!=null) {

            Image image = new Image(selectedImage.toURI().toString());
            imageview = new ImageView();
            imageview.setImage(image);
            img.setImage(image);
            showMessage("Image added successfully.");
        }
    }

    public void SelectImage1() {
        FileChooser filechooser = new FileChooser();
        filechooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files","*.jpg","*.png","*.jpeg","*.gif"));

        selectedImage1 = filechooser.showOpenDialog(null);
        if(selectedImage1!=null) {

            Image image = new Image(selectedImage1.toURI().toString());
            imageview1 = new ImageView();
            imageview1.setImage(image);
            gpi1.setImage(image);
            showMessage("Image added successfully.");
        }
    }
    public void SelectImage2() {
        FileChooser filechooser = new FileChooser();
        filechooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files","*.jpg","*.png","*.jpeg","*.gif"));

        selectedImage2 = filechooser.showOpenDialog(null);
        if(selectedImage2!=null) {

            Image image = new Image(selectedImage2.toURI().toString());
            imageview2 = new ImageView();
            imageview2.setImage(image);
            gpi2.setImage(image);;
            showMessage("Image added successfully.");
        }
    }
     
   
    public void SelectImage3() {
        FileChooser filechooser = new FileChooser();
        filechooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files","*.jpg","*.png","*.jpeg","*.gif"));

        selectedImage3 = filechooser.showOpenDialog(null);
        if(selectedImage3!=null) {

            Image image = new Image(selectedImage3.toURI().toString());
            imageview3 = new ImageView();
            imageview3.setImage(image);
            gpi3.setImage(image);
            showMessage("Image added successfully.");
        }
    }

     public void SelectImage4() {
        FileChooser filechooser = new FileChooser();
        filechooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files","*.jpg","*.png","*.jpeg","*.gif"));

        selectedImage4 = filechooser.showOpenDialog(null);
        if(selectedImage4!=null) {

            Image image = new Image(selectedImage4.toURI().toString());
            imageview4 = new ImageView();
            imageview4.setImage(image);
            ab1.setImage(image);
            showMessage("Image added successfully.");
        }
    }

    public void SelectImage5() {
        FileChooser filechooser = new FileChooser();
        filechooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files","*.jpg","*.png","*.jpeg","*.gif"));

        selectedImage5 = filechooser.showOpenDialog(null);
        if(selectedImage5!=null) {

            Image image = new Image(selectedImage5.toURI().toString());
            imageview5 = new ImageView();
            imageview5.setImage(image);
            ab2.setImage(image);
            showMessage("Image added successfully.");
        }
    }


    public void SelectImage6() {
        FileChooser filechooser = new FileChooser();
        filechooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files","*.jpg","*.png","*.jpeg","*.gif"));

        selectedImage6 = filechooser.showOpenDialog(null);
        if(selectedImage6!=null) {

            Image image = new Image(selectedImage6.toURI().toString());
            imageview6 = new ImageView();
            imageview6.setImage(image);
            ab3.setImage(image);
            showMessage("Image added successfully.");
        }
    }


    public void SelectImage7() {
        FileChooser filechooser = new FileChooser();
        filechooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files","*.jpg","*.png","*.jpeg","*.gif"));

        selectedImage7 = filechooser.showOpenDialog(null);
        if(selectedImage7!=null) {

            Image image = new Image(selectedImage7.toURI().toString());
            imageview7 = new ImageView();
            imageview7.setImage(image);
            ab4.setImage(image);
            showMessage("Image added successfully.");
        }
    }



    public void SelectImage8() {
        FileChooser filechooser = new FileChooser();
        filechooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files","*.jpg","*.png","*.jpeg","*.gif"));

        selectedImage8 = filechooser.showOpenDialog(null);
        if(selectedImage8!=null) {

            Image image = new Image(selectedImage8.toURI().toString());
            imageview8 = new ImageView();
            imageview8.setImage(image);
            ab5.setImage(image);
            showMessage("Image added successfully.");
        }
    }

    private void showMessage(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
}
