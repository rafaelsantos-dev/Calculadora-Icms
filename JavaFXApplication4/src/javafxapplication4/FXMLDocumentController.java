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
    
    @FXML
    Double valornf, valoricms, mva, imposto, resultado;
    
    @FXML
    private void btnCalcularClicado(ActionEvent event) {
        valornf = Double.parseDouble(txtValor.getText());
        valoricms = Double.parseDouble(txtIcms.getText());
        mva = Double.parseDouble(txtMva.getText());
        mva = mva / 100;
        //imposto = Double.parseDouble(imposto_nf.getText());
        //imposto = imposto / 100;
        resultado = (valornf + valornf * mva) - valoricms;
        //result = (valornf + valornf * mva) * imposto - valoricms;
        txtResultado.setText(String.valueOf(resultado));
    }
    @FXML
    private void btnLimparClicado(ActionEvent event) {
        txtValor.setText("");
        txtIcms.setText("");
        txtMva.setText("");
        txtResultado.setText("");
    } 

    @FXML
    private TextField txtValor;
    @FXML
    private TextField txtIcms;
    @FXML
    private TextField txtMva;
    @FXML
    private TextField txtResultado;
    @FXML
    private CheckBox cbMva;
    @FXML
    private ChoiceBox<String> cbImposto;
    @FXML
    private Button btnCalcular;
    @FXML
    private Button btnLimpar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
