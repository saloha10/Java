import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


    class Calculator extends Application {


        public static void main(String[] args) {
            launch();
        }

        public void start(Stage primaryStage) throws Exception {


            Group root = new Group();

            TextField textField = new TextField();

            HBox hBox = new HBox(textField);

            Scene scene = new Scene(root, 300, 300);

           root.getChildren().add(hBox);

            primaryStage.setTitle("Miniräknare");

            primaryStage.setScene(scene);

            primaryStage.show();
        }
    }



