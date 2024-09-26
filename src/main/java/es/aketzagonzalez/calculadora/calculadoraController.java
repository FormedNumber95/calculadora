package es.aketzagonzalez.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * Clase calculadoraController.
 */
public class calculadoraController {

    /** El grupo de radioButtons. */
    @FXML
    private ToggleGroup grupoOpciones;

    /** El radiobutton dividir. */
    @FXML
    private RadioButton radBtnDividir;

    /** El radiobutton multiplicar. */
    @FXML
    private RadioButton radBtnMultiplicar;

    /** El radiobutton restar. */
    @FXML
    private RadioButton radBtnRestar;

    /** El radiobutton sumar. */
    @FXML
    private RadioButton radBtnSumar;

    /** El texto del operador 1. */
    @FXML
    private TextField txtOperador1;

    /** El texto del operador 2. */
    @FXML
    private TextField txtOperador2;

    /** The texto de la respuesta. */
    @FXML
    private TextField txtRespuesta;

    /**
     * Ejecutar la operacion seleccionada de los radioButtons.
     *
     * @param event El evento
     */
    @FXML
    void operarOperacion(ActionEvent event) {
    	if(!radBtnDividir.isSelected()&&!radBtnMultiplicar.isSelected()&&
    			!radBtnRestar.isSelected()&&!radBtnSumar.isSelected()) {
    		return;
    	}
    	try {
    		double op1=Double.parseDouble(txtOperador1.getText());
    		double op2=Double.parseDouble(txtOperador2.getText());
    		if(radBtnDividir.isSelected()&&op2==0) {
    			txtRespuesta.setText("No se puede dividir entre 0");
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
    		txtRespuesta.setText("Las calculadoras solo funcionan con numeros");
    		return;
    	}
    }

}
