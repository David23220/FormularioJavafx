package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Formulario Fx");
        GridPane grid = new GridPane();
        grid.setHgap(15);
        grid.setVgap(15);

        Label labela = new Label("TexField.....");
        TextField texfield = new TextField();

        Label labelb = new Label("Contraseña :");
        PasswordField password = new PasswordField();

        Label labec = new Label("AreaText");
        TextArea texarea = new TextArea();

        CheckBox checkbox = new CheckBox("Aceptar Condiciones");
        RadioButton radioBButton = new RadioButton("Escoger opcion 1 : ");
        ToggleButton toggleButton = new ToggleButton("Descargando");
        Hyperlink hyperlink = new Hyperlink("Hiperlink");
        Button button = new Button("Aceptar");
        ProgressBar progressBar = new ProgressBar();
        progressBar.getStyleClass().add("progress-bar");
        ProgressIndicator progressIdicator = new ProgressIndicator();
        progressIdicator.getStyleClass().add("progress-indicator");
        Slider slider = new Slider();

        grid.add(labela, 0, 0);
        grid.add(texfield, 1, 0);
        grid.add(labelb, 0, 1);
        grid.add(password, 1, 1);
        grid.add(hyperlink, 0, 2);
        grid.add(radioBButton, 0, 3);
        grid.add(labec, 0, 4);
        grid.add(texarea, 1, 4);
        grid.add(checkbox, 0, 5);
        grid.add(toggleButton, 0, 6);
        grid.add(button, 0, 7);
        grid.add(progressBar, 1, 7);
        grid.add(progressIdicator, 0, 8);
        grid.add(slider, 1, 8);

        Scene scene = new Scene(grid, 890, 450);

        // Ruta del archivo CSS
        scene.getStylesheets().add(getClass().getResource("/resources/styles.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
