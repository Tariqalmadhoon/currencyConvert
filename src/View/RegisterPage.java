/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Yahya
 */
public class RegisterPage extends Stage {
     
    final Label usernameLabel;
    final TextField usernameTF;

    final Label passwordLabel;
    final PasswordField passwordTF;
    
    
    final Image image ;

      
    final ImageView imageView ;
  

    final Button registerBtn;
    final GridPane grid;
 
 
    final HBox hbox;

    public RegisterPage() {
        usernameLabel = new Label("User name");
        usernameTF = new TextField();
        usernameLabel.setPadding(new Insets(0,0,0,90));
        
        passwordLabel = new Label("Password");
        passwordTF = new PasswordField();
        passwordLabel.setPadding(new Insets(0,0,0,90));

        image = new Image(getClass().getResourceAsStream("converterassaignment.png"));
        imageView = new ImageView(image);
        imageView.setFitWidth(250);
        imageView.setFitHeight(250);
       
        
        
        
        registerBtn = new Button("Register");
        
        registerBtn.setCursor(Cursor.HAND);
        registerBtn.getStyleClass().add("btn");
        registerBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                if(usernameTF.getText().equals("user") && passwordTF.getText().equals("userpass")){
                
                try {
                    ViewManager.openAdminPage();
                    ViewManager.closeRegisterPage();
                } catch (IOException ex) {
                    Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("this data is invalid!!");
            alert.showAndWait();  
            } 
            
        }
        });
 
        grid = new GridPane();
        grid.setHgap(150);
        grid.setVgap(10);
     
     
 
    
        grid.add(imageView, 1, 0);
        grid.add(usernameLabel, 1, 1);
        grid.add(usernameTF, 1, 2);
        grid.add(passwordLabel, 1, 3);
        grid.add(passwordTF, 1, 4);
       

      grid.add(registerBtn, 1, 6, 2, 2);
      
        grid.setAlignment(Pos.CENTER);
     
 
 
 
        hbox = new HBox(30,  grid);
        
 
        
        StackPane root = new StackPane();
        root.getChildren().add(hbox);
        
        
        Scene scene = new Scene(root, 500, 700);
     
        scene.getStylesheets().add("/css/style.css");

        this.setScene(scene);
        this.setTitle("Rigester Page");
        this.setResizable(false);
        this.show();
    }

}
