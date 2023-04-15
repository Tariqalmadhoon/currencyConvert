/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import View.ViewManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Yahya
 */
public class UsersManagmentController implements Initializable {

 
    @FXML
    private Button convertButton;
 
    @FXML
    private Button logOutButton;

    @FXML
    private TextField USD;

    @FXML
    private TextField NIS;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   
     @FXML
    private void handleLogoutButton(ActionEvent event) {
          ViewManager.adminPage.openRegisterPage();                       /////////////////////////////////********////////////
    }
    

    @FXML
    private void handelconvertbutton(ActionEvent event) {
     
  
    double usdValue = Double.parseDouble(USD.getText());
    double conversionRate = 3.66;  
    double resultv = usdValue * conversionRate;
    
 
    NIS.setText(String.format("%.2f", resultv));
        
        
    }
  

    
    
}
