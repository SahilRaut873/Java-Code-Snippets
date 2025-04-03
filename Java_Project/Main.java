import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("BorderPane Test");
    BorderPane bp = new BorderPane();
    bp.setPadding(new Insets(10, 20, 10, 20));

    Button btnBottom2 = new Button("Insert");
    bp.setBottom(btnBottom2);

    Button btnBottom3 = new Button("Create");
    bp1.setBottom(btnBottom3);

    Scene scene = new Scene(bp, 300, 200);
    primaryStage.setScene(scene);
    primaryStage.show();

    Scene scene1 = new Scene(bp1, 300, 200);
    primaryStage.setScene(scene1);
    primaryStage.show();
  }
}