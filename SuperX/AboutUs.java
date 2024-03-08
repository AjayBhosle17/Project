import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

public class AboutUs {
    private StackPane root;
    Stage primaryStage;
    private Scene scene;
    private ImageView backgroundImageView;
    public void showInfo(Stage prim) {
      //  this.primaryStage = primaryStage;
       primaryStage = new Stage();

        root = new StackPane();
        scene = new Scene(root, 2000, 1000);
        scene.setCursor(Cursor.HAND);

      

        // Create a ScrollPane for the content
        ScrollPane scrollPane = createScrollPane(prim);

        // Stack the ScrollPane
        StackPane.setAlignment(scrollPane, Pos.TOP_RIGHT);
        // StackPane.setAlignment(backButton, Pos.TOP_LEFT);
        StackPane.setMargin(scrollPane, new Insets(0));
        
        



        

        root.getChildren().addAll(scrollPane);
        primaryStage.setScene(scene);
           // primaryStage.setFullScreen(true);
        primaryStage.show();
      //  primaryStage.setFullScreen(true);


        
    }

    private ScrollPane createScrollPane(Stage prim) {
        
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scrollPane.setStyle("-fx-background-image:url('Images/back1.jpeg');"); // Disable horizontal scrollbar




       
      

        HBox hbox0 = new HBox(0); // Set spacing between VBox elements
        hbox0.setPadding(new Insets(50));
        VBox vbox0 = new VBox(10); // First VBox
        //Text add vishal govind  and description   
           
        Button button = new Button(" Back");
        button.setTranslateX(-50);
        button.setTranslateY(-50);

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

        
      button.setOnAction(event -> {
        prim.show();
        primaryStage.close();
    });
    
        hbox0.getChildren().addAll(button);
       












     /* 
             Add Vbox1
      */
         HBox hbox = new HBox(70); // Set spacing between VBox elements
        hbox.setPadding(new Insets(50));
        VBox vbox1 = new VBox(10); // First VBox
        
        //Add the Shashi Sir pic
        HBox firstSet=createImageSet(new String[]{"Images/Shashisir1.png"});
        DropShadow dropShadow = new DropShadow(90, Color.BLUE);
        firstSet.setEffect(dropShadow);
          Timeline timeline = new Timeline(
            new KeyFrame(Duration.ZERO, new KeyValue(dropShadow.radiusProperty(), 90)),
            new KeyFrame(Duration.seconds(3), new KeyValue(dropShadow.radiusProperty(), 15)),
            new KeyFrame(Duration.seconds(2), new KeyValue(dropShadow.radiusProperty(), 15))
        );

        
  
        
       /*  Button backButton = new Button(" Back");

        // Set the background color and increase text size

        Font buttonFont = Font.font("Arial", 22); 
        backButton.setFont(buttonFont);
        backButton.setStyle("-fx-font-size: 22; -fx-background-color: darkcyan;");
        backButton.setMinSize(100, 50);
        backButton.setStyle("-fx-padding : 0 0  0 0; -fx-alignment : CENTER");
        //hbox.setStyle("-fx-padding : 0 0 0 50; -fx-alignment : LEFT");


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
    
        // Position the button in the VBox
         // Position the button in the top-left corner
         StackPane.setAlignment(backButton, Pos.TOP_RIGHT);
         StackPane.setMargin(backButton, new Insets(10, 0, 10, 100));
         backButton.setOnAction(event->{
          colorTransition3.play();
      });

        
      backButton.setOnAction(event -> {
        prim.show();
        primaryStage.close();
    });
    
       
*/
     
        
    //    HBox hb_bk = new HBox(backButton);
    //    hb_bk.setStyle("-fx-padding : 0 1000 0 0  ;-fx-alignment : LEFT");
        hbox.getChildren().addAll(firstSet);
        firstSet.setStyle("-fx-padding : 100 0 0 0");
        hbox.setStyle("-fx-padding : 0 0 0 100; -fx-alignment : RIGHT");
      //vbox1.setStyle("-fx-padding : 100 0 0 0");
         vbox1.setStyle("-fx-padding : 0 0 0 0");
         vbox1.getChildren().addAll(firstSet);
      
        /*
            Add VBox2
        */

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  

         //Text add Shashi sir  and description
        
          VBox vbox2 = new VBox(60); // Second VBox
         Text welcomeText1 = new Text("       Shashi Sir");
         welcomeText1.setX(100);
         welcomeText1.setY(100);
         welcomeText1.setTranslateX(70);
        welcomeText1.setTranslateY(20);
         
         // Set the font color

         welcomeText1.setFill(Color.WHITE);   
         welcomeText1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,80));
         welcomeText1.setStyle("-fx-padding : 0 0 0 0; -fx-alignment : TOP");
         DropShadow dropShadow1 = new DropShadow(70, Color.BLUE);
         welcomeText1.setEffect(dropShadow1);

        Text welcomeText = new Text("Shashikant Bagal (Shashi Sir) is the inspiration and the symbol of High Skillset,\n Multi-Domain, and perseverance to students.  Shashi  Sir  has  pursued  his\n Graduation degree in BCS from Mumbai University and a Master's degree\n in Computer Application from Pune University. Dr. Vijay D. Gokhale Sir is\n an inspiration and Guru to Shashi Sir. He has learned UNIX Internals, Win32SDK,\n COM(Component Object Model), WinRT, and OpenGL from his Guru. Before founding\nCore2Web Technologies, Shashi Sir has worked in Isana Systems and as a freelancer too.\n Our sir has contributed with great people for projects and has evolved with a\n deeper understanding.");
        welcomeText.setX(100);
        welcomeText.setY(100);
        welcomeText.setFill(Color.WHITE);    
    //  welcomeText.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
        welcomeText.setFont(Font.font("Poppin", FontWeight.BOLD, FontPosture.ITALIC, 25));

        Text welcomeText2 = new Text("In January 2017, sir established Core2Web Technologies, where he is teaching \ntechnologies   like  C,   C++,    Java,   Python,   and   Operating   System. \nSir mainly focuses on building the thought process by answering questions like How,\n Why, What, and When. He teaches insights into Fundamental aspects of programming\n languages and Operating System. Sir is mostly known for bridging the technical concepts\n with real-time scenarios. Sir always keeps himself updated with the latest technologies \nand more eager to share them with his students. With his one belief in solving student's\n doubts anytime keeps on motivating his students.\n In 2019, Shashi Sir Co-Founded his firm Biencaps System Pvt. Ltd. At a very young \nage, our sir has evolved as an Entrepreneur. With his caliber and skillset, our sir\n inspires us every day");
        welcomeText2.setX(100);
        welcomeText2.setY(100);
        welcomeText2.setFill(Color.WHITE);    
    //   welcomeText.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
        welcomeText2.setFont(Font.font("Poppin", FontWeight.BOLD, FontPosture.ITALIC, 25));
        vbox2.getChildren().addAll(welcomeText1,welcomeText,welcomeText2); 
        hbox.getChildren().addAll(vbox1,vbox2);
        
       
       
   
        /*
         Add Vbox3
         */

        HBox hbox1 = new HBox(10); // Set spacing between VBox elements
        hbox1.setPadding(new Insets(2000));
        VBox vbox3 = new VBox(10); // First VBox
        
        //Text add Sachin  sir  and description

        Text welcomeText5 = new Text("   Sachin Sir\n");
        welcomeText5.setX(100);
        welcomeText5.setY(100);
        welcomeText5.setTranslateY(70);
        welcomeText5.setFill(Color.WHITE);   
        welcomeText5.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,80));
         welcomeText5.setStyle("-fx-padding : 0 0 0 0; -fx-alignment : TOP");
        DropShadow dropShadow4 = new DropShadow(70, Color.BLUE);
        welcomeText5.setEffect(dropShadow4);
        
        Text welcomeText3 = new Text("Sachin Sir is truly a remarkable individual at Core2Web \nwho embodies the spirit of mentorship and guidance.\nSachin Sir's journey from being a student at Core2Web \nto becoming an integral part of this institution is a remarkable \nand inspiring one. His substantial contributions have played\na pivotal role in the growth and success of Core2Web,\n alongside the esteemed Shashi Sir.");
        welcomeText3.setX(100);
        welcomeText3.setY(100);
        welcomeText3.setFill(Color.WHITE);    
        welcomeText3.setFont(Font.font("Poppin", FontWeight.BOLD, FontPosture.ITALIC, 25));
        
        Text welcomeText4 = new Text("His dedication to helping students in every scenario \nis nothing short of inspirational.Whether it's a \nchallenging problem,a perplexing concept,or a general \ninquiry, Sachin Sir is always there to lend a helping hand. \n\n In recognizing Sachin Sir's contributions, we express our \nheartfelt gratitude for his invaluable impact on education.\n He is a symbol of support and a source of inspiration for \nall who have had the privilege of benefiting from his mentorship.\n His presence at Core2Web enriches the\n educational experience, and we are fortunate to have such \na remarkable individual guiding and inspiring us.");
        welcomeText4.setX(100);
        welcomeText4.setY(100);
        welcomeText4.setFill(Color.WHITE);    
        welcomeText4.setFont(Font.font("Poppin", FontWeight.BOLD, FontPosture.ITALIC, 25));
        vbox3.setStyle("-fx-padding : 0 0 0 150");
        vbox3.getChildren().addAll(welcomeText5,welcomeText3,welcomeText4); 
         
         /*
             Add Vbox 4
          */
        VBox vbox4 = new VBox(10);
         //Add the Shashi Sir pic
        HBox firstSet1=createImageSet(new String[]{"Images/Sachinsir (3).jpeg"});
        DropShadow dropShadow3 = new DropShadow(80, Color.BLUE);
          firstSet.setEffect(dropShadow3);
          Timeline timeline1 = new Timeline(
            new KeyFrame(Duration.ZERO, new KeyValue(dropShadow3.radiusProperty(), 90)),
            new KeyFrame(Duration.seconds(3), new KeyValue(dropShadow3.radiusProperty(), 15)),
            new KeyFrame(Duration.seconds(2), new KeyValue(dropShadow3.radiusProperty(), 15))
        );
        timeline1.setCycleCount(Timeline.INDEFINITE);
        timeline1.play();

        firstSet1.setEffect(dropShadow3);
        hbox1.getChildren().addAll(firstSet1);
        firstSet.setStyle("-fx-padding : 100 0 0 0");
        hbox1.setStyle("-fx-padding : 150 0  100; -fx-alignment : RIGHT");
        vbox4.setStyle("-fx-padding : 0 0 0 250");
        vbox4.getChildren().addAll(firstSet1);
        hbox1.getChildren().addAll(vbox3,vbox4);





         /*
          
                Add 4 vbox in 1 hbox for add the pic team leads

          */

          HBox hbox2 = new HBox(70); // Set spacing between VBox elements
          hbox2.setPadding(new Insets(50));
          VBox vbox5 = new VBox(10);
          VBox vbox6 = new VBox(10);
          VBox vbox7 = new VBox(10);
          VBox vbox8 = new VBox(10);
           VBox vbox9 = new VBox(10);
          

          // Add image1 of vishal

         HBox firstSet5=createImageSet1(new String[]{"Images/vishal.png"});
        DropShadow dropShadow5 = new DropShadow(80, Color.BLUE);
        firstSet5.setEffect(dropShadow5);
        hbox2.getChildren().addAll(firstSet5);
        firstSet5.setStyle("-fx-padding : 100 0 0 0");
        hbox2.setStyle("-fx-padding : 0 0 0 100; -fx-alignment : RIGHT");
        vbox5.setStyle("-fx-padding : 0 0 50 0");
        vbox5.getChildren().addAll(firstSet5);
    

        // Add image 2 of Subodh
         HBox firstSet6=createImageSet1(new String[]{"Images/subodh.png"});
        DropShadow dropShadow6 = new DropShadow(80, Color.BLUE);
        firstSet6.setEffect(dropShadow6);
        hbox2.getChildren().addAll(firstSet6);
        firstSet6.setStyle("-fx-padding : 100 0 0 0");
        hbox2.setStyle("-fx-padding : 0 0 0 100; -fx-alignment : RIGHT");
        vbox6.setStyle("-fx-padding : 0 0 0 0");
        vbox6.getChildren().addAll(firstSet6);
        

         // Add image3 of govind

         HBox firstSet7=createImageSet1(new String[]{"Images/govind.png"});
        DropShadow dropShadow7 = new DropShadow(80, Color.BLUE);
        firstSet7.setEffect(dropShadow7);
        hbox2.getChildren().addAll(firstSet7);
        firstSet7.setStyle("-fx-padding : 100 0 0 0");
        hbox2.setStyle("-fx-padding : 0 0 0 100; -fx-alignment : RIGHT");
        vbox7.setStyle("-fx-padding : 0 0 0 0");
        vbox7.getChildren().addAll(firstSet7);
    

         //Add image 4 shiv

        HBox firstSet8=createImageSet1(new String[]{"Images/shiv.png"});
        DropShadow dropShadow8 = new DropShadow(80, Color.BLUE);
        firstSet8.setEffect(dropShadow8);
        hbox2.getChildren().addAll(firstSet8);
        firstSet8.setStyle("-fx-padding : 100 0 0 0");
        hbox2.setStyle("-fx-padding : 0 0 0 100; -fx-alignment : RIGHT");
        vbox8.setStyle("-fx-padding : 0 0 0 0");
        vbox8.getChildren().addAll(firstSet8);

        HBox firstSet9=createImageSet1(new String[]{"Images/Prajwal 1.png"});
        DropShadow dropShadow9 = new DropShadow(80, Color.BLUE);
        firstSet9.setEffect(dropShadow9);
        hbox2.getChildren().addAll(firstSet9);
        firstSet9.setStyle("-fx-padding : 100 0 0 0");
        hbox2.setStyle("-fx-padding : 0 0 0 100; -fx-alignment : RIGHT");
        vbox9.setStyle("-fx-padding : 0 0 0 0");
        vbox9.getChildren().addAll(firstSet9);
        hbox2.getChildren().addAll(vbox5,vbox6,vbox7,vbox8,vbox9);



        HBox hbox3 = new HBox(0); // Set spacing between VBox elements
        hbox3.setPadding(new Insets(0));
        VBox vbox10 = new VBox(10); // First VBox
        //Text add vishal govind  and description
        Text welcomeText10 = new Text("           Vishal                Subodh               Govind                   Shiv                    Prajwal");
        welcomeText10.setX(100);
        welcomeText10.setY(100);
        welcomeText10.setFill(Color.WHITE);   
        welcomeText10.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,50));
         welcomeText10.setStyle("-fx-padding : 0 0 0 0; -fx-alignment : TOP");
        DropShadow dropShadow10 = new DropShadow(50, Color.BLUE);
        welcomeText10.setEffect(dropShadow10);
         hbox3.getChildren().addAll(welcomeText10);



        HBox hbox4 = new HBox(20); // Set spacing between VBox elements
        hbox4.setPadding(new Insets(80));
        VBox vbox11 = new VBox(10); // First VBox
        //Text add  description
        Text welcomeText11 = new Text("                  The Core2web Institute boasts four dedicated leaders, namely Subodh, Govind, Shiv, Vishal and Prajwal. They collectively manage\n the \"Super-X\" program, which aims to support students in developing their projects. These leaders offer valuable guidance and   direction, \nensuring that students have the resources and knowledge needed to successfully complete their projects within the \"Super-X\" program.\nTheir commitment and expertise play a vital role in empowering students to achieve their goals and create exceptional projects.\n" + //
                "\t   Subodh, Govind, Shiv, Vishal and Prajwal play crucial roles in guiding and supporting the students on their project-building journeys.\n Subodh's expertise and experience make him an invaluable resource, while Govind's leadership ensures that the program runs smoothly \nand efficiently. Shiv brings a creative and innovative perspective to the table,  inspiring  students to  think outside the box,   Lastly,\n Vishal's attention to detail and precision ensures that the projects are executed flawlessly.Together, these leaders form a dynamic\n team, committed to providing students with the guidance and direction they need to excel in the \"Super-X\" program.");
        welcomeText11.setX(100);
        welcomeText11.setY(100);
        welcomeText11.setFill(Color.WHITE);   
        welcomeText11.setFont(Font.font("Poppin", FontWeight.BOLD, FontPosture.ITALIC,25));
         welcomeText11.setStyle("-fx-padding : 0 0 0 0; -fx-alignment : TOP");
        DropShadow dropShadow11 = new DropShadow(50, Color.BLUE);
        welcomeText10.setEffect(dropShadow11);
         hbox4.getChildren().addAll(welcomeText11);




           HBox hbox5 = new HBox(70); // Set spacing between VBox elements
          hbox5.setPadding(new Insets(50));
          VBox vbox12 = new VBox(10);
          VBox vbox13 = new VBox(10);
          VBox vbox14 = new VBox(10);
          
          

         // Add image1 of vishal
         HBox firstSet12=createImageSet1(new String[]{"Images/Rahul 2.png"});
        DropShadow dropShadow12 = new DropShadow(80, Color.BLUE);
        firstSet12.setEffect(dropShadow12);
        hbox5.getChildren().addAll(firstSet12);
        firstSet12.setStyle("-fx-padding : 100 0 0 0");
        hbox5.setStyle("-fx-padding : 0 0 0 100; -fx-alignment : RIGHT");
        vbox12.setStyle("-fx-padding : 0 0 0 100");
        vbox12.getChildren().addAll(firstSet12);

         HBox firstSet13=createImageSet1(new String[]{"Images/Chetan 1.png"});
        DropShadow dropShadow13 = new DropShadow(80, Color.BLUE);
        firstSet13.setEffect(dropShadow13);
        hbox5.getChildren().addAll(firstSet13);
        firstSet13.setStyle("-fx-padding : 100 0 0 0");
        hbox5.setStyle("-fx-padding : 0 0 0 100; -fx-alignment : RIGHT");
        vbox13.setStyle("-fx-padding : 0 0 0 100");
        vbox13.getChildren().addAll(firstSet13);

         HBox firstSet14=createImageSet1(new String[]{"Images/Shweta 1.png"});
        DropShadow dropShadow14 = new DropShadow(80, Color.BLUE);
        firstSet14.setEffect(dropShadow14);
        hbox5.getChildren().addAll(firstSet14);
        firstSet14.setStyle("-fx-padding : 100 0 0 0");
        hbox5.setStyle("-fx-padding : 0 0 0 450; -fx-alignment : RIGHT");
        vbox14.setStyle("-fx-padding : 0 0 0 100");
        vbox14.getChildren().addAll(firstSet14);
         hbox5.getChildren().addAll(firstSet12,firstSet13,firstSet14);


          HBox hbox6 = new HBox(0); // Set spacing between VBox elements
        hbox6.setPadding(new Insets(0));
        VBox vbox15 = new VBox(10); // First VBox
        //Text add vishal govind  and description
        Text welcomeText15 = new Text("                                         Rahul                Chetan               Shweta");
        welcomeText15.setX(100);
        welcomeText15.setY(100);
        welcomeText15.setFill(Color.WHITE);   
        welcomeText15.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,50));
         welcomeText15.setStyle("-fx-padding : 0 0 0 0; -fx-alignment : TOP");
        DropShadow dropShadow15 = new DropShadow(50, Color.BLUE);
        welcomeText15.setEffect(dropShadow15);
         hbox6.getChildren().addAll(welcomeText15);



        HBox hbox7 = new HBox(70); // Set spacing between VBox elements
        hbox7.setPadding(new Insets(50));
        VBox vbox16 = new VBox(10);
        VBox vbox17 = new VBox(10);
        VBox vbox18 = new VBox(10);
        VBox vbox19 = new VBox(10);
           
          
          

         // Add image1 of vishal
         HBox firstSet16=createImageSet1(new String[]{"Images/Ajay 1.png"});
        DropShadow dropShadow16 = new DropShadow(80, Color.BLUE);
        firstSet16.setEffect(dropShadow16);
        hbox7.getChildren().addAll(firstSet16);
        firstSet16.setStyle("-fx-padding : 100 0 0 0");
        hbox7.setStyle("-fx-padding : 0 0 0 100; -fx-alignment : RIGHT");
        vbox16.setStyle("-fx-padding : 0 0 0 100");
        vbox16.getChildren().addAll(firstSet16);

          HBox firstSet17=createImageSet1(new String[]{"Images/Abhinav 1.png"});
        DropShadow dropShadow17 = new DropShadow(80, Color.BLUE);
        firstSet17.setEffect(dropShadow17);
        hbox7.getChildren().addAll(firstSet17);
        firstSet17.setStyle("-fx-padding : 100 0 0 0");
        hbox7.setStyle("-fx-padding : 0 0 0 100; -fx-alignment : RIGHT");
        vbox17.setStyle("-fx-padding : 0 0 0 100");
        vbox17.getChildren().addAll(firstSet17);

          HBox firstSet18=createImageSet1(new String[]{"Images/Dhiraj 1.png"});
        DropShadow dropShadow18 = new DropShadow(80, Color.BLUE);
        firstSet18.setEffect(dropShadow18);
        hbox7.getChildren().addAll(firstSet18);
        firstSet18.setStyle("-fx-padding : 100 0 0 0");
        hbox7.setStyle("-fx-padding : 0 0 0 100; -fx-alignment : RIGHT");
        vbox18.setStyle("-fx-padding : 0 0 0 100");
        vbox18.getChildren().addAll(firstSet18);

          HBox firstSet19=createImageSet1(new String[]{"Images/Yashraj 1.png"});
        DropShadow dropShadow19 = new DropShadow(80, Color.BLUE);
        firstSet19.setEffect(dropShadow19);
        hbox7.getChildren().addAll(firstSet19);
        firstSet19.setStyle("-fx-padding : 100 0 0 0");
        hbox7.setStyle("-fx-padding : 0 0 0 250; -fx-alignment : RIGHT");
        vbox19.setStyle("-fx-padding : 0 0 0 100");
        vbox19.getChildren().addAll(firstSet19);
         hbox7.getChildren().addAll(firstSet16,firstSet17,firstSet18,firstSet19);


         HBox hbox8 = new HBox(0); // Set spacing between VBox elements
        hbox8.setPadding(new Insets(0));
        VBox vbox20 = new VBox(10); // First VBox
        //Text add vishal govind  and description   
        Text welcomeText20 = new Text("                           Ajay                Abhinav               Dhiraj                 Yashraj");
        welcomeText20.setX(100);
        welcomeText20.setY(100);
        welcomeText20.setFill(Color.WHITE);   
        welcomeText20.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,50));
         welcomeText20.setStyle("-fx-padding : 0 0 0 0; -fx-alignment : TOP");
        DropShadow dropShadow20 = new DropShadow(50, Color.BLUE);
        welcomeText20.setEffect(dropShadow20);
         hbox8.getChildren().addAll(welcomeText20);



        HBox hbox9 = new HBox(0); // Set spacing between VBox elements
        hbox9.setPadding(new Insets(0));
        VBox vbox21 = new VBox(10); // First VBox
        //Text add vishal govind  and description   
        Text welcomeText21 = new Text("SuperX_Programmer Mentors");
        welcomeText21.setX(100);
        welcomeText21.setY(100);
        welcomeText21.setFill(Color.WHITE);   
        welcomeText21.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,80));
        welcomeText21.setStyle("-fx-padding : 0 0 0 500; -fx-alignment : TOP");
        hbox9.setStyle("-fx-padding : 0 0 0 450; -fx-alignment : RIGHT");
        DropShadow dropShadow21 = new DropShadow(50, Color.BLUE);
        welcomeText21.setEffect(dropShadow21);
        hbox9.getChildren().addAll(welcomeText21);


        HBox hbox10 = new HBox(0); // Set spacing between VBox elements
        hbox10.setPadding(new Insets(0));
        VBox vbox22 = new VBox(10); // First VBox
        //Text add vishal govind  and description   
        Text welcomeText22 = new Text("....Group Leaders...");
        welcomeText22.setX(100);
        welcomeText22.setY(100);
        welcomeText22.setFill(Color.WHITE);   
        welcomeText22.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,100));
        welcomeText22.setStyle("-fx-padding : 0 0 0 800; -fx-alignment : TOP");
        hbox10.setStyle("-fx-padding : 0 0 0 540; -fx-alignment : RIGHT");
        DropShadow dropShadow22 = new DropShadow(50, Color.BLUE);
        welcomeText22.setEffect(dropShadow22);
        hbox10.getChildren().addAll(welcomeText22);


        HBox hbox11 = new HBox(0); // Set spacing between VBox elements
        hbox11.setPadding(new Insets(50));
        VBox vbox23 = new VBox(10); // First VBox
        //Text add vishal govind  and description   
        Text welcomeText23 = new Text("We proudly introduce our dedicated team members:\n                                                                  Rahul, Chetan, Shweta, Ajay, Abhinav, Dhiraj, and Yashraj.\n                                                                  Everyone have worked tirelessly on the \"Super-X\" application project.\n                                                                 Each of these talented individuals contributed their unique skills,creativity, and\n                                                                unwavering dedication to bring the \"Super-X\" program to life.\n                                                             Their collective effort and commitment to excellence resulted in a remarkable project.\n                                                            We are immensely proud of our team's achievements and look forward to their \n                                                         continued contributions to our mission of fostering innovation and excellence in education.");
        welcomeText23.setX(100);
        welcomeText23.setY(100);
        welcomeText23.setFill(Color.WHITE);   
        welcomeText23.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,30));
        welcomeText23.setStyle("-fx-padding : 0 0 0 800; -fx-alignment : TOP");
      //  hbox11.setStyle("-fx-padding : 0 0 0 540; -fx-alignment : RIGHT");
        //DropShadow dropShadow23 = new DropShadow(50, Color.BLUE);
        //welcomeText23.setEffect(dropShadow23);
        hbox11.getChildren().addAll(welcomeText23);

    


        // Create an HBox to hold image sets
        VBox setContainer = new VBox();
        setContainer.setSpacing(10);
        setContainer.getChildren().addAll(hbox0,hbox,hbox1,hbox9,hbox2,hbox3,hbox4,hbox10,hbox5,hbox6,hbox7,hbox8,hbox11);
        setContainer.setStyle("-fx-background-image : url(Images/back1.jpeg)");
        scrollPane.setContent(setContainer);
         


       
        return scrollPane;
           
    }


    private HBox createImageSet(String[]... imagePathsArray) {
        HBox imageSet = new HBox(80); // spacing between images

        for (String[] imagePaths : imagePathsArray) {
            for (String imagePath : imagePaths) {
                ImageView imageView = new ImageView(new Image(imagePath));
                imageView.setFitWidth(600); 
                imageView.setFitHeight(1000);//Set the desired width for the image
                imageView.setPreserveRatio(true); // Maintain image aspect ratio
                imageSet.getChildren().add(imageView);
            }
        }
        return imageSet;
        
    }
      private HBox createImageSet1(String[]... imagePathsArray) {
        HBox imageSet = new HBox(80); // spacing between images
         for (String[] imagePaths : imagePathsArray) {
            for (String imagePath : imagePaths) {
                ImageView imageView1 = new ImageView(new Image(imagePath));
                imageView1.setFitWidth(270); 
                imageView1.setFitHeight(270);//Set the desired width for the image
                imageView1.setPreserveRatio(true); // Maintain image aspect ratio
                imageSet.getChildren().add(imageView1);
            }
        }
             return imageSet;
    }
        
}
