/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import View.RegisterPage;

/**
 *
 * @author Yahya
 */
public class ConverterPage extends Stage{
    
    // All Scenes that AdminDashboard page have
    private Scene usersManagmentScene;
    private Scene reg;
    
   
 
    //private Scene accountsScene;
    //private Scene operationsScene;

    public ConverterPage() throws IOException {
        
        //load UserManagment FXML File in UsersManagment Scene
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AdminFXML/UsersManagment.fxml"));
        Parent root = loader.load();     
        usersManagmentScene = new Scene(root);
        
        
         
        
        // Set Main Scene in Admin Dasboard ( UsersManagment Scene )
        this.setScene(usersManagmentScene);
        this.setTitle("Converter Page");
        
        
        
         
        
        
    }
    
    
    
    
    public void changeSceneToCreateUser(){
        this.setScene(reg);
    }
    public void changeSceneToUsersManagment(){
        this.setScene(usersManagmentScene);
    }

    public void openRegisterPage() {
         
         ViewManager.openRegisterPage();
         ViewManager.closeAdminPage();
              
        
    }
    
    
 
    
    
    
}
