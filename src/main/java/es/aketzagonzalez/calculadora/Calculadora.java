package es.aketzagonzalez.calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase Calculadora.
 */
public class Calculadora extends Application {
    
    /** El stage. */
    private static Stage stage;

    /**
     * Metodo start que inicia el metodo setRoot.
     *
     * @param s El stage
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @Override
    public void start(@SuppressWarnings("exports") Stage s) throws IOException {
        stage=s;
        setRoot("consola","");
    }

    /**
     * Setea el root del fxml.
     *
     * @param fxml El nuevo root
     * @throws IOException Signals that an I/O exception has occurred.
     */
    static void setRoot(String fxml) throws IOException {
        setRoot(fxml,stage.getTitle());
    }

    /**
     * Setea el root del fxml.
     *
     * @param fxml El fxml
     * @param title El titulo
     * @throws IOException Signals that an I/O exception has occurred.
     */
    static void setRoot(String fxml, String title) throws IOException {
        Scene scene = new Scene(loadFXML(fxml));
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Carga FXML.
     *
     * @param fxml El fxml
     * @return El padre
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Calculadora.class.getResource("/fxml/"+fxml + ".fxml"));
        return fxmlLoader.load();
    }


    /**
     * Metodo main que ejecuta el programa.
     *
     * @param args Los argumentos que se pasan por consola
     */
    public static void main(String[] args) {
        launch(args);
    }

}
