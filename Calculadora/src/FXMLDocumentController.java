/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 94421340278
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    double x,y,result;
    TextField drogas=new TextField();
    
    public void teste(){
        
    }
 
    
    
    public void um(ActionEvent event){
            drogas.setText(drogas.getText()+("1"));
    }
    public void dois(){
            drogas.setText(drogas.getText()+("2"));
    }
    public void tres(){
            drogas.setText(drogas.getText()+("3"));
    }
    public void quatro(){
        drogas.setText(drogas.getText()+("4"));
    }
    public void cinco(){
        drogas.setText(drogas.getText()+("5"));
    }
    public void seis(){
        drogas.setText(drogas.getText()+("6"));
    }
    public void sete(){
            drogas.setText(drogas.getText()+("7"));
    }
    public void oito(){
            drogas.setText(drogas.getText()+("8"));
    }
    public void nove(){
            drogas.setText(drogas.getText()+("9"));
    }
    public void zero(){
            drogas.setText(drogas.getText()+("0"));
    }
    public void Limpar(){
            drogas.setText("");
    }
   
    
    

}