/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxapplication4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author rsantos
 */
public class FXMLDocumentController implements Initializable {
    
    Double valornf, valoricms, mva, imposto, result;

    @FXML
    private TextField txtValor;
    private TextField txtIcms;
    private TextField txtMva;
    private TextField txtResultado;
    private CheckBox cbMva;
    private ChoiceBox cbImposto;
    private Button btnCalcular;
    private Button btnLimpar;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        txtResultado.setText(String.valueOf(result));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
