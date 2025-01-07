package es.juliogtrenard.jaspersupermercado;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Clase que muestra una aplicacion con reportes de un supermercado
 */
public class SupermercadoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SupermercadoApplication.class.getResource("/es/juliogtrenard/jaspersupermercado/fxml/supermercado.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("REPORTES");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * El punto de entrada de la aplicacion
     * @param args argumentos de linea de comandos
     */
    public static void main(String[] args) {
        launch();
    }
}