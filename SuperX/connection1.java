import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class connection1 {
    private TextField usernameField;
    private PasswordField passwordField;

    public connection1(TextField usernameField, PasswordField passwordField) {
        this.usernameField = usernameField;
        this.passwordField = passwordField;
    }

    public boolean connectAndValidate() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        boolean val =false;
       
        String jdbcUrl = "jdbc:mysql://localhost:3306/loginpage";
        String dbUsername = "root";
        String dbPassword = "mysql";

        try {
          
            Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);

            String query = "SELECT * FROM login WHERE usr = ? AND passwd = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            
            Alert al = new Alert(AlertType.ERROR);

            
            if (resultSet.next()) {
               
                val =true;
            } else if(username.isEmpty() && password.isEmpty()){

                
                al.setTitle("Error");
                al.setContentText("UserName And PassWord Required");
                usernameField.clear();
                passwordField.clear();
                al.showAndWait();
            
            }else if(username.isEmpty() || password.isEmpty()){

                al.setTitle("Error");
                al.setContentText("Incorrect UserName Or PassWord");
                usernameField.clear();
                passwordField.clear();
                al.showAndWait();
            
            
            }else if(password.isEmpty()){
                    al.setTitle("Error");
                    al.setContentText("Password Required");
                    usernameField.clear();
                    passwordField.clear();
                    al.showAndWait();

            }else if(username.isEmpty()){
                     al.setTitle("Error");
                     al.setContentText("UserName Required");
                     usernameField.clear();
                     passwordField.clear();
                     al.showAndWait();
                
            }else{

                // al.setTitle("Success");
                // al.setContentText("Successfully Login..!");
                // al.showAndWait();
               
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return val;
    }
}
