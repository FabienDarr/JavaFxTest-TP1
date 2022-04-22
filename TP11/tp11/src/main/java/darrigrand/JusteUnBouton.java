package darrigrand;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class JusteUnBouton extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Juste Un Bouton");
        BorderPane root = new BorderPane();

        Scene scene = new Scene(root);
        Button b = new Button("Clique moi");
        root.setCenter(b);
        root.setPrefSize(400, 100);
        b.setStyle("-fx-border-color: red; -fx-border-radius: 5em ; -fx-font-family: 'Poppins';");
        b.setDisable(true);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
