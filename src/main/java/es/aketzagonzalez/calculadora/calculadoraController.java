package es.aketzagonzalez.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class calculadoraController {

    @FXML
    private ToggleGroup grupoOpciones;

    @FXML
    private RadioButton radBtnDividir;

    @FXML
    private RadioButton radBtnMultiplicar;

    @FXML
    private RadioButton radBtnRestar;

    @FXML
    private RadioButton radBtnSumar;

    @FXML
    private TextField txtOperador1;

    @FXML
    private TextField txtOperador2;

    @FXML
    private TextField txtRespuesta;

    @FXML
    void operarOperacion(ActionEvent event) {
    	try {
    		double op1=Double.parseDouble(txtOperador1.getText());
    		double op2=Double.parseDouble(txtOperador2.getText());
    		if(radBtnDividir.isSelected()&&op2==0) {
    			return;
    		}
    		double respuesta=0;
    		if(radBtnDividir.isSelected()) {
    			respuesta=op1/op2;
    		}else {
    			if(radBtnMultiplicar.isSelected()) {
    				respuesta=op1*op2;
    			}else {
    				if(radBtnRestar.isSelected()) {
    					respuesta=op1-op2;
    				}else {
    					if(radBtnSumar.isSelected()) {
    						respuesta=op1+op2;
    					}
    				}
    			}
    		}
    		txtRespuesta.setText(respuesta+"");
    	}catch(NumberFormatException e) {
    		return;
    	}
    }

}
