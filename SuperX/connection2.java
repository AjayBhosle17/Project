import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class connection2 {

  public boolean insertData(String groupId, String groupName, String projectName, String description, File projectImage, String member1_name, File image1, String mem2, File image2, String mem3, File image3, String mem4, File image4, String mem5, File image5, File image8, File image9, File image10) {

    
    String url = "jdbc:mysql://localhost:3306/loginpage";
    String username = "root";
    String password = "mysql";

    try {
        Connection connection = DriverManager.getConnection(url, username, password);

        String sql = "INSERT INTO projdet  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        Fetch objFetch = new Fetch();
        int x = objFetch.count();
        preparedStatement.setInt(1, x);
        preparedStatement.setString(2, groupName);
        preparedStatement.setString(3, projectName);

        FileInputStream fis = new FileInputStream(projectImage);
        preparedStatement.setBinaryStream(4, fis, (int) projectImage.length());

        preparedStatement.setString(5, description);
        preparedStatement.setString(6, member1_name);
        if (image1 != null) {
            FileInputStream fis1 = new FileInputStream(image1);
            preparedStatement.setBinaryStream(7, fis1, (int) image1.length());
        } else {
            preparedStatement.setBinaryStream(7, null, 0);
        }

        preparedStatement.setString(8, mem2);
        if (image2 != null) {
            FileInputStream fis2 = new FileInputStream(image2);
            preparedStatement.setBinaryStream(9, fis2, (int) image2.length());
        } else {
            preparedStatement.setBinaryStream(9, null, 0);
        }

        preparedStatement.setString(10, mem3);
        if (image3 != null) {
            FileInputStream fis3 = new FileInputStream(image3);
            preparedStatement.setBinaryStream(11, fis3, (int) image3.length());
        } else {
            preparedStatement.setBinaryStream(11, null, 0);
        }

        preparedStatement.setString(12, mem4);
        if (image4 != null) {
            FileInputStream fis4 = new FileInputStream(image4);
            preparedStatement.setBinaryStream(13, fis4, (int) image4.length());
        } else {
            preparedStatement.setBinaryStream(13, null, 0);
        }

        preparedStatement.setString(14, mem5);
        if (image5 != null) {
            FileInputStream fis5 = new FileInputStream(image5);
            preparedStatement.setBinaryStream(15, fis5, (int) image5.length());
        } else {
            preparedStatement.setBinaryStream(15, null, 0);
        }

        if (image8 != null) {
            FileInputStream fis6 = new FileInputStream(image8);
            preparedStatement.setBinaryStream(16, fis6, (int) image8.length());
        } else {
            preparedStatement.setBinaryStream(16, null, 0);
        }

        if (image9 != null) {
            FileInputStream fis7 = new FileInputStream(image9);
            preparedStatement.setBinaryStream(17, fis7, (int) image9.length());
        } else {
            preparedStatement.setBinaryStream(17, null, 0);
        }

        if (image10 != null) {
            FileInputStream fis8 = new FileInputStream(image10);
            preparedStatement.setBinaryStream(18, fis8, (int) image10.length());
        } else {
            preparedStatement.setBinaryStream(18, null, 0);
        }
        System.out.println(member1_name);
        preparedStatement.executeUpdate();
        System.out.println("Connection Successful");

        preparedStatement.close();
        connection.close();

        return true;
    } catch (SQLException | FileNotFoundException obj) {
         Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Error");
                 alert.setHeaderText(null);
                alert.setContentText("Data cannot be inserted");
                alert.showAndWait();
        obj.printStackTrace();
    }
    return false;
    }
}